package assignments.week2.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//- Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Dashboard")) {
            System.out.println("The Title is correct: " +title);
        } else {
            System.out.println("ERROR");
        }
        driver.navigate().back();

		
//		- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement verifyDisable = driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[2]"));
		 
//DOUBT TO ASK MENTOR
        if (verifyDisable.isEnabled()) {
            System.out.println("The Button is enabled.");
        } else {
            System.out.println("The Button is disabled.");
        }

		WebElement getPosition = driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[3]/button[1]/span[2]"));
		Point location = getPosition.getLocation();
		
		 int x = location.getX();
	     int y = location.getY();
	     
	        System.out.println("Element is located at X: " + x + ", Y: " + y);

	
//	        - Find and print the background color of the button with the text ‘Find the Save button color.’
			WebElement buttonColor = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
	        String backgroundColor = buttonColor.getCssValue("background-color");
	        System.out.println("Button background color is : " + backgroundColor);

//	        - Find and print the height and width of the button with the text ‘Find the height and width of this button.’
			WebElement buttonHeight = driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/button[1]/span[2]"));
	        Dimension buttonSize = buttonHeight.getSize();
	        System.out.println("Button size is : " +buttonSize);

	        driver.close();
	        
	        
	}

}
