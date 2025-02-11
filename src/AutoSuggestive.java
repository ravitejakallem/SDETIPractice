import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
         driver.findElement(By.id("autosuggest")).sendKeys("IND");
         Thread.sleep(3000);
         System.out.println(driver.findElements(By.xpath(" //li[@class='ui-menu-item']/a")).size());;
         List<WebElement> options=driver.findElements(By.xpath(" //li[@class='ui-menu-item']/a"));
         for(WebElement option:options)
         {
        	 if(option.getText().equalsIgnoreCase("India"))
        	 {
        		 option.click();
        		 break;
        	 }
         }
	}

}
