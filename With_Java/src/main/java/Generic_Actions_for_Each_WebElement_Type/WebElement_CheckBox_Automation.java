package Generic_Actions_for_Each_WebElement_Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_CheckBox_Automation {

	public static void main(String[] args) throws InterruptedException {
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
		
		
		// drop down
		
		//*[@id="AccountFrm_agree"]
		
		WebElement PrivacyPolicyCheckBox = driver.findElement(By.xpath("//*[@id=\"AccountFrm_agree\"]"));
		
		boolean isCheckBoxSelected = PrivacyPolicyCheckBox.isSelected();
		
		if(isCheckBoxSelected)
		{
			System.out.println("check box is already selected");
		}
		else
		{
			PrivacyPolicyCheckBox.click();
		}
		
		Thread.sleep(wait_time);
		
		isCheckBoxSelected = PrivacyPolicyCheckBox.isSelected();
		
		System.out.println("is check box selected :: "+isCheckBoxSelected);
		
		
		
//		for(int i =0;i<27;i++)
//		{
//			Thread.sleep(2000);
//			PrivacyPolicyCheckBox.click();
//			
//		}
		
		
		
		Thread.sleep(10000);
		
		// Radio Button
		
		WebElement YesRadioButton = driver.findElement(By.xpath("//*[@id=\"AccountFrm_newsletter1\"]"));
		
		YesRadioButton.click();
		
		
		
		
		
	}

}
