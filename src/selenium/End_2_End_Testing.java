package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class End_2_End_Testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");// Url Open
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"IXB\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"BHO\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			
			System.out.println("isDisable");
			Assert.assertTrue(true);
		}else {
			System.out.println("test is fail because i selected one way but here its slect round trip");
			Assert.assertTrue(false);
			
		}
		
		
		
		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<4;i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		//Assert.assertEquals(driver.findElements(By.id("divpaxinfo")), "4 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("USD");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		driver.quit();
		
		

	}

}
