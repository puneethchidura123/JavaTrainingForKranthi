package Generic_Actions_for_Each_WebElement_Type;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Automation_Demo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
int wait_time = 5000;
		
		String url = "https://automationteststore.com/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Testing for Kranthi\\Java Training\\JavaTrainingForKranthi\\With_Java\\BrowserDrivers\\chromedriver.exe");
		
		// initialize chrome driver

		WebDriver driver = new ChromeDriver();
		
		
		// to implement hard wait 
		Thread.sleep(wait_time);  // wait_time should be milliseconds
		
		
		// navigating to URL

		driver.get(url); // url has to be a string
		
		Thread.sleep(wait_time);
		
		// maximising the window
		
		driver.manage().window().maximize();
		
		Thread.sleep(wait_time);
		
		// clicking on Login_Or_Register_Link
		WebElement Login_Or_Register_Link = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
		Login_Or_Register_Link.click();
		
		Thread.sleep(wait_time);
		
		// clicking on Continue_Button
		WebElement Continue_Button = driver.findElement(By.xpath("//*[@id=\"accountFrm\"]/fieldset/button"));
		String  Button_Text =    Continue_Button.getText();
		System.out.println(Button_Text);
		Continue_Button.click();
		
		Thread.sleep(wait_time);
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		File f1 = s.getScreenshotAs(OutputType.FILE);
		
		File f2 = new File("D:\\Trainings\\Testing for Kranthi\\Java Training\\JavaTrainingForKranthi\\With_Java\\ScreenShots\\kranthi.jpg");
		FileUtils.copyFile(f1,f2);
		
		System.out.println("Screenshot taken successfully");
		
		
		
	}

}
