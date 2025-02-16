package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_UI_Drop_downs {

	public static void main(String[] args) {
		// Assignment 2: UI(Dropdowns,EditBoxes,Error Validation) Assignment
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Kundan Prasad");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.id("exampleInputPassword1"));
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).isSelected());
		
		 WebElement staticdropdown =  driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropdown = new Select(staticdropdown);
		
		dropdown.selectByVisibleText("Female");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		System.out.println(driver.findElements(By.xpath("//div[@class=\"form-check form-check-inline\"]")).size());//check how many radio button
		
		driver.findElement(By.name("inlineRadioOptions")).click();
		
		driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("02/02/1992");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		//System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
		
		
		
		

	}

}
