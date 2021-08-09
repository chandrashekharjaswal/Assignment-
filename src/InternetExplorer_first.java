import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C:\\Work\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
