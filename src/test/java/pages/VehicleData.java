package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class VehicleData {

	public WebDriver driver = null;

	By automobile_menu          = By.id("nav_automobile");
	By make_field  				= By.id("make");
	By enginePerformance_field 	= By.id("engineperformance");
	By dateManufacture_field 	= By.id("dateofmanufacture");
	By numberSeats_field 		= By.id("numberofseats");
	By fuelType_field           = By.id("fuel");
	By listPrice_field          = By.id("listprice");
	By licencePlateNumber_field = By.id("licenseplatenumber");
	By annualMileage_field      = By.id("annualmileage");
	By insuranteData_button     = By.id("nextenterinsurantdata");	

	public VehicleData (WebDriver driver) {
		this.driver = driver;
	}

	public void fill_make(String text){		
		driver.findElement(automobile_menu).click();
		driver.findElement(make_field).click();
		Select dropdown = new Select (driver.findElement(make_field));
		dropdown.selectByVisibleText(text);
	}

	public void fill_enginePerformance(String text) {	
		driver.findElement(enginePerformance_field).sendKeys(text);		
	}

	public void fill_dateManufacture(String text) {
		driver.findElement(dateManufacture_field).sendKeys(text);		
	}

	public void fill_numberSeats(String text) {
		driver.findElement(numberSeats_field).click();
		Select dropdown = new Select (driver.findElement(numberSeats_field));
		dropdown.selectByVisibleText(text);				
	}

	public void fill_fuelType(String text) {
		driver.findElement(fuelType_field).click();
		Select dropdown = new Select (driver.findElement(fuelType_field));
		dropdown.selectByVisibleText(text);	
	}

	public void fill_listPrice_field(String text) {
		driver.findElement(listPrice_field).sendKeys(text);		
	}

	public void fill_licencePlateNumber(String text) {
		driver.findElement(licencePlateNumber_field).sendKeys(text);		
	}

	public void fill_annualMileage_field(String text) {
		driver.findElement(annualMileage_field).sendKeys(text);		
	}

	public void click_insuranteData() {
		driver.findElement(insuranteData_button).click();
	}
}
