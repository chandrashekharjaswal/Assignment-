import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.msnagile.com/login?url=interview1");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("qa.sudhanshu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.cssSelector("#loginBtbn > span")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("body > app-root > app-content-wrapper > div > div > div > app-sidebar > div > div > div > ul > div:nth-child(3) > div > li > a > span")).click();
		driver.findElement(By.xpath("//*[@id=\"managUserBtn\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"inviteUserButton\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"emailfield\"]")).sendKeys("shekharjaswal@gmail.com");
		driver.findElement(By.cssSelector("#mat-dialog-0 > app-invite-user > mat-dialog-content > mat-form-field > div")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#sendbtn")).click();
		driver.findElement(By.cssSelector("#dltIcon")).click();
		
    		
		 driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
	      File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      Files.copy(s, new File("Assignment.png"));
		
		
		
	}

}
