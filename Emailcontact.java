package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emailcontact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set the driver
		WebDriverManager.chromedriver().setup();
		
		//Lanuch browser
		ChromeDriver driver= new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		
		//Enter the username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Contract
		driver.findElement(By.linkText("Contacts")).click();
		
		//click findcontacts
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//click the Email
		driver.findElement(By.linkText("Email")).click();
		
		//enter email
		WebElement email = driver.findElement(By.name("emailAddress"));
		email.sendKeys("babu@testleaf.com");
		//click find contact
		driver.findElement(By.className("x-btn-text")).click();
		//close browser
		driver.close();
		
	}

}
