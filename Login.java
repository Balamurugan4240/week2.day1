package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// set the driver
		WebDriverManager.chromedriver().setup();
		
		//Lanuch browser
		ChromeDriver driver= new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Get the title
		String title= driver.getTitle();
		System.out.println(title);
		
		//Enter the username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
		
		//Enter the last name 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("murugan");
		
		//click on createLead button
		driver.findElement(By.name("submitButton")).click();
		
	
		
		//close the browser
		driver.close();
		
		
		
	}

}
