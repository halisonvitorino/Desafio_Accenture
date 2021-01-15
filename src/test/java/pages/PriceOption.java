package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOption {
	
	public WebDriver driver = null;

	By selectsilver_option   = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span\r\n");
	By selectgold_option     = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span\r\n");
	By selectplatinum_option = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span\r\n");
	By selectultimate_option = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span\r\n");
	By nextsendquote_button  = By.id("nextsendquote");

	public PriceOption(WebDriver driver) {
		this.driver = driver;
	}

	public void fill_selectsilver() {
		driver.findElement(selectsilver_option).click();
	}

	public void fill_selectgold() {
		driver.findElement(selectgold_option).click();
	}

	public void fill_selectplatinum() {
		driver.findElement(selectplatinum_option).click();
	}

	public void fill_selectultimate() {
		driver.findElement(selectultimate_option).click();
	}

	public void click_nextsendquote() {
		WebDriverWait wait = new WebDriverWait (driver, 10); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(nextsendquote_button)));
		element.click();
	}
}
