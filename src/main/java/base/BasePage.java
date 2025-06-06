package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
protected WebDriver driver;
public WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver=driver;
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	 public  By toaster = By.id("toast-container");
	
	// Common method for waiting for an element to be visible
    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
 public void waitForTaosterToAppear() {
	    
	    waitForElementToBeVisible(toaster);
	    }

}
