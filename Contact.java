package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {

	public static void main(String[] args) {
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
				
				//click create contract
				driver.findElement(By.linkText("Create Contact")).click();
				
		        //Enter the first name
				driver.findElement(By.id("firstNameField")).sendKeys("Bala");
				
				//Enter the last name 
				driver.findElement(By.id("lastNameField")).sendKeys("murugan");
				 
			    //click the create contact button 
				driver.findElement(By.name("submitButton")).click();
				
				String FirstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
				 String title = driver.getTitle();
				System.out.println(title);
				 System.out.println(FirstName);
				// Close the Browser
				// driver.close();
				
				
				
	}
}
