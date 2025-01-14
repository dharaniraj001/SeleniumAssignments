package assignments.week2.day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Dharani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("DDR");
		
		driver.findElement(By.cssSelector("#createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.xpath("//tbody/tr[24]/td[2]/input[1]")).click();
		
		System.out.println("Lead Created Successfully. Screen title is: "+driver.getTitle());
		
		driver.close();

	}

}
