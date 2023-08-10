package Sdet.Questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question_Five {
	
	WebDriver driver;
@BeforeMethod	
public void setup()
{
	System.setProperty("webdriver.chrome.driver","C://Users//ADITHYAH//Downloads//chromedriver_win32//chromedriver.exe");
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	 driver=new ChromeDriver();
}
	@Test
public void logo_check()
{
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/a/picture/img")).isDisplayed();
}
	@Test
public void quetion_webelements() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		WebElement flight_ele=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a"));
		WebElement oneway=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a"));
		WebElement From=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a"));
		WebElement To_location=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a"));
		driver.quit();
	}
	
	

}
