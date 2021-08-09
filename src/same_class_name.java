import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class same_class_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https:login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("Chandra Shekhar Jaswal");
		driver.findElement(By.cssSelector("#password")).sendKeys("123abc");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();*/
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("7009340525");
		driver.findElement(By.cssSelector("#pass")).sendKeys("sdfsdd");
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'loginform\']/div[2]/div[2]")).getText());
	}

}
