import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	//	driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("this is user id");//xpath
		driver.findElement(By.cssSelector("*[id='login1']")).sendKeys("this is CSS selector");
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("this is Xpath");
		driver.findElement(By.cssSelector("*[name='proceed']")).click();
		
	}

}
