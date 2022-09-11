package Generic_Actions_for_Each_WebElement_Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Link_Automation {

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
		
		// creating WebElemnt for the speacils link
		
		WebElement specials_link = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[1]/a/span"));
		
		String link_text = specials_link.getText();
		System.out.println(link_text);
		
		if(link_text.equals("SPECIALS133"))
		{
			specials_link.click();
			Thread.sleep(wait_time);
		}
		else
		{
			System.out.println(" link text mismatch identified");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
