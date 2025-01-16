package assignments.week2.day2Assignment;

import java.time.Duration;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//- Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
//- Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")).click();
//- Verify that the expected message is displayed.
		WebElement label = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/span[1]"));
		String fetchedLabelText =label.getText();
		System.out.println(fetchedLabelText );
		String expectedPartialText = "Checked";

		if (fetchedLabelText.equals(expectedPartialText)) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("ERROR");
        }

//- Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")).click();
//- click tri-state option.
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]")).click();
		
//- Verify which tri-state option has been chosen.
		
		WebElement label2 = driver.findElement(By.xpath("//p[contains(text(),'State = 1')]"));
		String fetchedLabelText2 =label2.getText();
		System.out.println(fetchedLabelText2  + " tri-state option has been chosen.");

//- Click on the "Toggle Switch."
		System.out.println("waiting...");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();

//- Verify that the expected message is displayed.
		WebElement label3 = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/span[1]"));
		String fetchedLabelText3 =label3.getText();
		System.out.println(fetchedLabelText3 );
		String expectedPartialText3 = "Checked";

		if (fetchedLabelText3.equals(expectedPartialText3)) {
            System.out.println("SUCCEss");
        } else {
            System.out.println("ERROr");
        }

//Click checkbox.		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")).click();

//- Verify if the Checkbox is disabled.
		WebElement verifyDisable = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
						 

	        if (verifyDisable.isSelected()) {
	            System.out.println("The field is enabled.");
	        } else {
	            System.out.println("The field is disabled.");
	        }

//- Select multiple options on the page (details may be needed). >> [select all]
	        driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[3]/div[1]/ul[1]")).click();
	        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[2]")).click();
	        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/a[1]/span[1]")).click();

//- Perform any additional actions or verifications required. >> [unselect one checkbox]
	        
	        driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[3]/div[1]/ul[1]")).click();
	        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/ul[1]/li[1]/div[1]/div[2]/span[1]")).click();
	        driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/a[1]/span[1]")).click();
	        	                
	        driver.close();
	        
	        System.out.println("CHECKBOX ASSIGNMENT COMPLETED SUCCESSFULLY");
	}

}
