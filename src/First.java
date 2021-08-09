import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set system property
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		
		//create driver object
		WebDriver driver=new ChromeDriver();
		
		//we will implement methods using driver object for different actions
		driver.get("https://google.com"); // to open to link
		System.out.println(driver.getTitle()); // to print the title of the page in the console
		int titleLength = driver.getTitle().length();  
		
		
		
		System.out.println(driver.getCurrentUrl()); // to print the URl opened
		//System.out.println(driver.getPageSource()); // to print the page source of the current page
		
		driver.get("http://facebook.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		//driver.close(); // to close the current browser
		driver.quit(); // close all the browsers opened by selenium script
		
	}

}
