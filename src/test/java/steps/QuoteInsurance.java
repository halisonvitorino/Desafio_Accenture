package steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.InsurantData;
import pages.PriceOption;
import pages.ProductData;
import pages.SendQuote;
import pages.VehicleData;


public class QuoteInsurance {

	private static WebDriver driver = null;

	VehicleData vd;
	InsurantData id;
	ProductData pd;
	PriceOption po;
	SendQuote   sq;

	@Before
	public void setupClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	

		vd = new VehicleData(driver);
		id = new InsurantData(driver);
		pd = new ProductData(driver);
		po = new PriceOption(driver);
		sq = new SendQuote(driver);					
	}	

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}


	@Given("The user is on the insurance quote page and want to quote")
	public void the_user_is_on_the_insurance_quote_page_and_want_to_quote() {  
		driver.get("http://sampleapp.tricentis.com/101/app.php");	
		driver.manage().window().maximize() ;
	}


	@When("The user fill in the form Enter Vehicle Data")
	public void the_user_fill_in_the_form_enter_vehicle_data() throws Exception {	
		vd.fill_make("Audi");
		vd.fill_enginePerformance("1000");
		vd.fill_dateManufacture("12/01/2020");
		vd.fill_numberSeats("2");
		vd.fill_fuelType("Gas");
		vd.fill_listPrice_field("1000");
		vd.fill_licencePlateNumber("ABC1234");
		vd.fill_annualMileage_field("10000");
		vd.click_insuranteData();
	}


	@When("The user fill in the form Enter Insurant Data")
	public void the_user_fill_in_the_form_enter_insurant_data() throws InterruptedException {
		
		id.fill_firstName("halison");
		id.fill_lastName("Vitorino");
		id.fill_birthDate("04/25/1975");
		id.fill_genderMale();
		id.fill_genderFemale();
		id.fill_streetAddress("Rua Pedro 333");
		id.fill_country("Brasil");
		id.fill_zipCode("71920180");
		id.fill_city("Aguas Claras");
		id.fill_occupation("Employee");
		id.fill_speeding();
		id.fill_bungeejumping();
		id.fill_cliffdiving();
		id.fill_skydiving();
		id.fill_other();
		id.fill_website("www.google.com");		
		id.click_nextenterproductdata();
	}


	@When("The user fill in the form Enter Product Data")
	public void the_user_fill_in_the_form_enter_product_data() {
		pd.fill_startdate("05/01/2021");
		pd.fill_insurancesum("3.000.000,00");
		pd.fill_meritrating("Bonus 1");
		pd.fill_damageinsurance("No Coverage");
		pd.fill_EuroProtection();
		pd.fill_LegalDefenseInsurance();
		pd.fill_courtesycar("Yes");
		pd.click_nextselectpriceoption();
	}

	@When("The user fill in the form Select Price Option")
	public void the_user_fill_in_the_form_select_price_option() {
		po.fill_selectsilver();
		po.fill_selectgold();
		po.fill_selectplatinum();
		po.fill_selectultimate();
		po.click_nextsendquote();
	}

	@When("The user fill in the form Send Quote")
	public void the_user_fill_in_the_form_send_quote() {
		sq.fill_email("halison@gmail.com");
		sq.fill_phone("61928115652");
		sq.fill_username("halison");
		sq.fill_password("Ha123456");
		sq.fill_confirmpassword("Ha123456");
		sq.fill_comments("comments");
		sq.click_sendemail();
	}

	@Then("The user validates the success message")
	public void the_user_validates_the_success_message(){	
		String expected_message = "Sending e-mail success!";
		String message_success = sq.verify_message().toString();
        if (message_success.equalsIgnoreCase(expected_message)) {
            System.out.println("Text is matching");
        } else {
            System.out.println("Error Alert.................: Text is not matching"); 
        }	        
        Assert.assertTrue(message_success.equalsIgnoreCase("Sending e-mail success!"));
	}
}
