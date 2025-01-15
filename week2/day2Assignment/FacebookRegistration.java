package assignments.week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("NAME");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("SURNAME");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")).sendKeys("email@gmail.com");
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Test@1234");

		WebElement dayDD = driver.findElement(By.cssSelector("#day"));
		Select sel = new Select(dayDD); 
		sel.selectByIndex(1);

		WebElement monthDD = driver.findElement(By.cssSelector("#month"));
		Select sel2 = new Select(monthDD); 
		sel2.selectByVisibleText("Feb");

		WebElement yearDD = driver.findElement(By.cssSelector("#year"));
		Select sel3 = new Select(yearDD); 
		sel3.selectByValue("2024");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/span[1]/span[2]/label[1]/input[1]")).click();
		
		System.out.println("SUCCESS");
//		driver.close();
		
	}

}
