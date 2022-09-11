package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		int wait_time = 3000;  
		//step no : 1
		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Testing for Kranthi\\Java Training\\JavaTrainingForKranthi\\With_Java\\BrowserDrivers\\chromedriver.exe");
		
		Thread.sleep(wait_time);
		
		// step no : 2
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(wait_time);
		
		// step no : 3
		
		driver.get("https://automationteststore.com/");
		
		Thread.sleep(wait_time);

		// maximising the window
		
		driver.manage().window().maximize();
		
		Thread.sleep(wait_time);
		
		// step no : 4
		
		driver.close();
		
		Thread.sleep(wait_time);
		
		
	}

}
