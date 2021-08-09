import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Restart_course_first {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText().matches("Sign in"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"headingSubtext\"]/span")).getText().matches("Continue to Gmail"));
		driver.findElement(By.id("identifierId")).sendKeys("jaswalshekhar6@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
	}

}
