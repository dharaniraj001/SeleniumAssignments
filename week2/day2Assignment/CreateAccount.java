package assignments.week2.day2Assignment;

import java.time.Duration;

import javax.sound.sampled.AudioFileFormat.Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
			WebElement industryDD = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/select[1]"));
			Select sel=new Select(industryDD); 
			sel.selectByIndex(3);
			
			WebElement ownershipDD = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/select[1]"));
			Select sel2=new Select(ownershipDD); 
			sel2.selectByVisibleText("S-Corporation");
			
			WebElement sourceDD = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/select[1]"));
			Select sel3=new Select(sourceDD); 
			sel3.selectByValue("LEAD_EMPLOYEE");
			
			WebElement marketingChampDD = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[7]/td[4]/select[1]"));
			Select sel4=new Select(marketingChampDD); 
			sel4.selectByIndex(6);
			
			WebElement stateProvinceDD = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[20]/td[4]/select[1]"));
			Select sel5=new Select(stateProvinceDD); 
			sel5.selectByValue("TX");
			
			
			
			driver.findElement(By.xpath("//tbody/tr[22]/td[2]/input[1]")).click();
			
			
			WebElement label = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]"));
			String fetchedLabelText =label.getText();
			System.out.println(fetchedLabelText );
			String expectedPartialText = "Dharani Raj";

			if (fetchedLabelText.contains(expectedPartialText)) {
	            System.out.println("SUCCESS");
	        } else {
	            System.out.println("ERROR");
	        }
			
			
			System.out.println("Account Created Successfully. Screen title is: "+driver.getTitle());
			
			driver.close();
		}


	}


