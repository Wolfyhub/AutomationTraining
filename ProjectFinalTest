package Project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertEquals;

public class ProjectFinalTest {

    private WebDriver driver;
    private String baseUrl = "https://www.saucedemo.com/v1/";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        Thread.sleep(500);
    }

    @Test
    public void testSumPricesAndCheckout() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1500);

        String[] productXPaths = {
            "/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button",
            "/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button",
            "/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button"
        };

        for (String xpath : productXPaths) {
            driver.findElement(By.xpath(xpath)).click();
        }

        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click();

        driver.findElement(By.id("first-name")).sendKeys("Jürgen");
        driver.findElement(By.id("last-name")).sendKeys("Morales");
        driver.findElement(By.id("postal-code")).sendKeys("72000");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();

        String[] priceXPaths = {
            "/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]",
            "/html/body/div/div[2]/div[3]/div/div[1]/div[4]/div[2]/div[2]",
            "/html/body/div/div[2]/div[3]/div/div[1]/div[5]/div[2]/div[2]"
        };

        double totalCalculated = 0.0;
        for (String xpath : priceXPaths) {
            String priceText = driver.findElement(By.xpath(xpath)).getText().replace("$", "");
            totalCalculated += Double.parseDouble(priceText);
        }

        String totalExpectedText = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[5]")).getText().split("\\$")[1];
        double totalExpected = Double.parseDouble(totalExpectedText);

        assertEquals(totalExpected, totalCalculated, 0.0);

        if (totalCalculated == totalExpected) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("alert('La suma es correcta. Total: $" + totalCalculated + "');");
            
            
            Alert alert = driver.switchTo().alert();
            Thread.sleep(1500);
            alert.accept();
            
            driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();
            Thread.sleep(1500);
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
