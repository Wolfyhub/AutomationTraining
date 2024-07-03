package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;

public class ProjectFinal {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(500);

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
        driver.findElement(By.id("postal-code")).sendKeys("7200");
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

        if (totalCalculated == totalExpected) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("alert('La suma es correcta. Total: $" + totalCalculated + "');");
            
            Alert alert = driver.switchTo().alert();
            alert.accept();
            
            driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();
        }

        driver.quit();
    }
}
