package march__09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main (String arg[])throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	
	 driver.findElement(By.name("field-keywords")).sendKeys("Wrist Watch");
	 driver.findElement(By.id("nav-search-submit-button")).click();
	 
	driver.findElement(By.xpath("//span[text()='Analogue']"));
	driver.findElement(By.linkText("Analogue")).click();
	
	driver.findElement(By.xpath("//span[text()='Leather']"));
	driver.findElement(By.linkText("Leather")).click();
	
	
	driver.findElement(By.xpath("//span[text()='Titan']"));
	driver.findElement(By.linkText("Titan")).click();
    

	WebElement discountFilter = driver.findElement(By.xpath("//span[contains(text(), '25% Off or more')]"));
    discountFilter.click();
    
    
    WebElement fifthElement = driver.findElement(By.cssSelector("li[id^='result_']:nth-child(5)"));
    String fifthElementText = fifthElement.getText();
    System.out.println("Fifth Element: " + fifthElementText);
	 

    driver.quit();
    
			
}
	
}
