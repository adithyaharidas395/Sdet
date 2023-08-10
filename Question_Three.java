package Sdet.Questions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question_Three {
	
	
	//public void logocheck()
	public static void main(String[] args)
	
	{
	
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\harid\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.makemytrip.com/");
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/a/picture/img")).isDisplayed());
	
	
	}

}
