package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InsurantData {

	public WebDriver driver = null;

	By firstName 		= By.id("firstname");
	By lastName 		= By.id("lastname");
	By birthDate 		= By.id("birthdate");
	By genderMale 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span\r\n");
	By genderFemale 	= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span");
	By streetAddress 	= By.id("streetaddress");
	By country 			= By.id("country");
	By zipCode 			= By.id("zipcode");
	By city 			= By.id("city");
	By occupation 		= By.id("occupation");
	By speeding 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]\r\n");
	By bungeejumping 	= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]\r\n");
	By cliffdiving 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]\r\n");
	By skydiving 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]\r\n");
	By other 			= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]\r\n");
	By website 			= By.id("website");
	By picture 			= By.id("picture");
	By open 			= By.id("open");	
	By nextenterproductdata = By.id("nextenterproductdata");	
	
	
	public InsurantData (WebDriver driver) {
		this.driver = driver;
	}

	public void fill_firstName(String text) {
		driver.findElement(firstName).sendKeys(text);	 
	}

	public void fill_lastName(String text) {
		driver.findElement(lastName).sendKeys(text);	 
	}

	public void fill_birthDate(String text) throws InterruptedException {
		driver.findElement(birthDate).sendKeys(text);	
	}

	public void fill_genderMale() {
		driver.findElement(genderMale).click();	 		
	}

	public void fill_genderFemale() {		
		driver.findElement(genderFemale).click();
	}
	public void fill_streetAddress(String text) {
		driver.findElement(streetAddress).sendKeys(text);		 
	}

	public void fill_country(String text) {
		driver.findElement(country).sendKeys(text);		 
	}

	public void fill_zipCode(String text) {
		driver.findElement(zipCode).sendKeys(text);		 
	}

	public void fill_city(String text) {
		driver.findElement(city).sendKeys(text);		 
	}

	public void fill_occupation(String text) {
		driver.findElement(occupation).click();
		Select dropdown = new Select (driver.findElement(occupation));
		dropdown.selectByVisibleText(text);		 
	}

	public void fill_speeding() {
		driver.findElement(speeding).click();	 
	}

	public void fill_bungeejumping() {
		driver.findElement(bungeejumping).click();		 
	}

	public void fill_cliffdiving() {
		driver.findElement(cliffdiving).click();		 
	}

	public void fill_skydiving() {
		driver.findElement(skydiving).click();		 
	}

	public void fill_other() {
		driver.findElement(other).click();		 
	}

	public void fill_website(String text) {
		driver.findElement(website).sendKeys(text);	 
	}
	
//	public void fill_picture() {
//		driver.findElement(picture).sendKeys();	 
//	}
//
//	public void fill_open() {
//		driver.findElement(open).click();	 
//	}

	public void click_nextenterproductdata() {
		driver.findElement(nextenterproductdata).click();		 
	}
}
