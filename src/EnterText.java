import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("This is first script"); // this will print the text in thre email field in the facebook website.
		//driver.findElement(By.name("pass")).sendKeys("Grateful99@");
		//driver.findElement(By.linkText("Forgotten password?")).click();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("This is user id");
		driver.findElement(By.name("pw")).sendKeys("This is password");
		driver.findElement(By.id("Login")).click();
		
	}

}
