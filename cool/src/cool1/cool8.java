package cool1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cool8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.close();

	}

}
