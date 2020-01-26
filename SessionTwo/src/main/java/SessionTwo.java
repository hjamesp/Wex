/*Feature: BUYING CHEAPEST TEST AUTOMATION BOOK
 * As a consumer that want to learn about Test Automation
 * I want to search for the cheapest book in Amazon website
 * So that I can buy a book
 * 
 * Scenario: Searching the cheapest
 *	 	Given I navigate to “www.amazon.com”.
 * 		When I select the option “Books” in the dropdown next to the search text input criteria.
 * 		Then I search for “Test automation”.
 * 		And I select the cheapest book of the page without using any sorting method available.
 * 		When I reach the detailed book page, I check if the name in the header is the same name of the book that I select previously.
 */

import java.awt.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SessionTwo {
	
	private WebDriver driver;
	
	@Before
	public void starting() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bruno\\Documents\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
	}
	
	@Test
	public void testAutomation(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bruno\\Documents\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		WebElement element = driver.findElement(By.id("searchDropdownBox"));
		driver.findElement(By.xpath("//*[@class='nav-search-scope nav-sprite']")).click();
		Select combo = new Select(element);
		combo.selectByValue("earch-alias=stripbooks-intl-ship");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Test automation");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Test Automation  best practices: \"Won the Best Aut')]")).click();
		Assert.assertEquals("Test Automation  best practices: \"Won the Best Automation Book Award in TestKit 2014\"", driver.findElement(By.xpath("//span[contains(text(),'Test Automation  best practices: \\\"Won the Best Automation Book Award in TestKit 2014\\\"')]")));
	}

}













//driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']/option[@value='search-alias=stripbooks-intl-ship']")).click();