package Generic_Actions_for_Each_WebElement_Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_DropDown_Automation {

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
		
		
		// Dropdown Automation
		
		WebElement Country_DropDown = driver.findElement(By.xpath("//*[@id=\"AccountFrm_country_id\"]"));
		
		Select CountryDropDown = new Select(Country_DropDown);
		
		
		//CountryDropDown.selectByIndex(1);
		
		//CountryDropDown.selectByValue("13");
		
		CountryDropDown.selectByVisibleText("Bangladesh");
		
//		Thread.sleep(wait_time);
//		
//		CountryDropDown.selectByIndex(5);
//		
//		
//		for(int i =0;i<30;i++)
//		{
//			CountryDropDown.selectByIndex(i);
//			Thread.sleep(2000);
//		}
		
		
		
		
		
		
		
		
	}

}
