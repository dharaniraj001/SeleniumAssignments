package assignments.week2.day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Dharani Raj");
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[9]/td[2]/textarea[1]")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("2");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//tbody/tr[22]/td[2]/input[1]")).click();
		
		System.out.println("Account Created Successfully. Screen title is: "+driver.getTitle());
		
		driver.close();
	}

}
