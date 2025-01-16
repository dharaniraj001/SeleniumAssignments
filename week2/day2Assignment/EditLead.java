package assignments.week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
//create lead
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("DDR");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("firstName");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("lastName");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("firstNameLocal");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("department");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("descriptionInput");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("123@gmail.com");
//Select DD		
		WebElement stateDD = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select sel=new Select(stateDD); 
		sel.selectByVisibleText("New York");

		driver.findElement(By.xpath("//tbody/tr[24]/td[2]/input[1]")).click();

//Edit		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("important notes");
		driver.findElement(By.xpath("//tbody/tr[12]/td[2]/input[1]")).sendKeys("important notes");
		
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("EDIT LEAD ASIGNMENT COMPLETED SUCCESSFULLY");
		
	}

}
