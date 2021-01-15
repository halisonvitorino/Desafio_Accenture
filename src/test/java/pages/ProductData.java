package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ProductData {
	
	public WebDriver driver = null;
	
	By startdate_field		       = By.id("startdate");
	By insurancesum_field          = By.id("insurancesum");
	By meritrating_field		   = By.id("meritrating");
	By damageinsurance_field	   = By.id("damageinsurance");
	By EuroProtection_field        = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span\r\n");
	By LegalDefenseInsurance_field = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span\r\n");
	By courtesycar_field           = By.id("courtesycar");
	By nextselectpriceoption_field = By.id("nextselectpriceoption");
	
	
	public ProductData(WebDriver driver) {
		this.driver = driver;
	}	

	public void fill_startdate(String text) {
		driver.findElement(startdate_field).sendKeys(text);	 
	}
	
	public void fill_insurancesum(String text) {
		driver.findElement(insurancesum_field).click();
		Select dropdown = new Select (driver.findElement(insurancesum_field));
		dropdown.selectByVisibleText(text);		 
	}
	
	public void fill_meritrating(String text) {
		driver.findElement(meritrating_field).click();
		Select dropdown = new Select (driver.findElement(meritrating_field));
		dropdown.selectByVisibleText(text);	
	}
	
	public void fill_damageinsurance(String text) {
		driver.findElement(damageinsurance_field).click();
		Select dropdown = new Select (driver.findElement(damageinsurance_field));
		dropdown.selectByVisibleText(text);		 
	}
	
	public void fill_EuroProtection() {
		driver.findElement(EuroProtection_field).click();		 
	}
	
	public void fill_LegalDefenseInsurance() {
		driver.findElement(LegalDefenseInsurance_field).click(); 
	}
	
	public void fill_courtesycar(String text) {				
		driver.findElement(courtesycar_field).click();
		Select dropdown = new Select (driver.findElement(courtesycar_field));
		dropdown.selectByVisibleText(text);		
	}
	
	public void click_nextselectpriceoption() {
		driver.findElement(nextselectpriceoption_field).click();	 
	}
}
