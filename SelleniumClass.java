package Selleniump;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelleniumClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();

		driver.get("https://formy-project.herokuapp.com/form");
		Thread.sleep(500);
		
		driver.findElement(By.id("first-name")).sendKeys("Jürgen Aaron");
		Thread.sleep(500);
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.click();
		lastName.sendKeys("Morales");
		Thread.sleep(100);
		lastName.sendKeys(" A");
		Thread.sleep(200);
		lastName.sendKeys("r");
		Thread.sleep(200);
		lastName.sendKeys("e");
		Thread.sleep(200);
		lastName.sendKeys("n");
		Thread.sleep(200);
		lastName.sendKeys("a");
		Thread.sleep(200);
		lastName.sendKeys("s");
		Thread.sleep(500);
		
		WebElement jobTitle = driver.findElement(By.id("job-title"));
		jobTitle.click();
		jobTitle.sendKeys("Java developer");
		Thread.sleep(500);
		
		WebElement radio1 = driver.findElement(By.id("radio-button-3"));
		radio1.click();
		Thread.sleep(500); 
		
		WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
		checkBox1.click();
		Thread.sleep(500); 
		
		Select selectMenu = new Select (driver.findElement(By.id("select-menu")));
		selectMenu.selectByValue("3");
		Thread.sleep(500);
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		date.sendKeys("26/06/2024");
		Thread.sleep(500);
		date.sendKeys(Keys.RETURN);
		Thread.sleep(500);
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
		submit.click();
		Thread.sleep(2500);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Tarea de Selenium completada');");
        Thread.sleep(3000); 

        driver.switchTo().alert().accept();
        Thread.sleep(500); 

        driver.quit();
