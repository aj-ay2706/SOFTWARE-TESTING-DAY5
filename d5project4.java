package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d5project4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement fname=driver.findElement(By.id("source"));
		fname.sendKeys("COIMBATORE",Keys.ENTER);
		Thread.sleep(3000);
		fname.sendKeys(Keys.ENTER);
		WebElement dname=driver.findElement(By.id("destination"));
		dname.sendKeys("SALEM",Keys.ENTER);
		Thread.sleep(3000);
		dname.sendKeys(Keys.ENTER);
		WebElement tname=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		tname.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','04-05-2023')",tname);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]"));
		search.click();
		
		
		

	}

}