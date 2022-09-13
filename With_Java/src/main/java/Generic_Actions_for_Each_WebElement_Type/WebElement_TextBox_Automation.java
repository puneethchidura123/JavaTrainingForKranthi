package Generic_Actions_for_Each_WebElement_Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_TextBox_Automation {

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
		
		//entering text into  a text box
		WebElement FirstName_TextBox = driver.findElement(By.xpath("//*[@id=\"AccountFrm_firstname\"]"));
		// entering the text
		FirstName_TextBox.sendKeys("Kranthi Kumar");
		Thread.sleep(wait_time);
		//clear the text in text box
		FirstName_TextBox.clear();
		Thread.sleep(wait_time);
		FirstName_TextBox.sendKeys("Kumar Kranthi");
		
		
		
		
		
		
	}

}
