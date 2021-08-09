import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail_automate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
	
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("dummy97dummy97");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();	
		
		/*String Catpcha=driver.findElement(By.id("captchaimg")).getText();
        
        driver.findElement(By.xpath("//*[@id=\'ca\']")).sendKeys(Catpcha);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
        
        System.out.println(Catpcha);
        
		driver.findElement(By.xpath("//*[@class=\'whsOnd zHQkBf\']/div[1]/div/div[1]/input]")).sendKeys("12345697@");*/
        
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebDriverWait wait=new WebDriverWait(driver, 5);
		 
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	        
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345697@");
	        
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/span")).click();	
		
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")).click();
		driver.findElement(By.name("to")).sendKeys("jaswalshekhar6@gmail.com");
		driver.findElement(By.className("aoT")).sendKeys("Incubyte assessment");
		driver.findElement(By.xpath("//*[@id=\':9y\']")).sendKeys("What's UP!!");
		driver.findElement(By.xpath("//*[@id=\':8j\']")).click();
		String text=driver.findElement(By.className("bAq")).getText();
		System.out.print(text);
		if(text=="Sending...")
		{
			System.out.print("Pass");
		}
		else
		{
			System.out.print("Fail");
		}
		
	}

}
