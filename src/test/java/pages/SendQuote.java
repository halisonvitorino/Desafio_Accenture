package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuote {
	
	By email_field           = By.id("email");
	By phone_field           = By.id("phone");
	By username_field        = By.id("username");
	By password_field        = By.id("password");
	By confirmpassword_field = By.id("confirmpassword");
	By comments_field        = By.id("Comments");
	By sendemail_field       = By.id("sendemail");
	By success_message       = By.xpath("/html/body/div[4]/h2\r\n");
	
	WebDriver driver;
	
	public SendQuote(WebDriver driver) {
		this.driver = driver;
	}

	public void fill_email(String text) {
		driver.findElement(email_field).sendKeys(text);
	}
	
	public void fill_phone(String text) {
		driver.findElement(phone_field).sendKeys(text);		 
	}
	
	public void fill_username(String text) {
		driver.findElement(username_field).sendKeys(text);	 
	}
	
	public void fill_password(String text) {
		driver.findElement(password_field).sendKeys(text);		 
	}
	
	public void fill_confirmpassword(String text) {
		driver.findElement(confirmpassword_field).sendKeys(text);	 
	}
	
	public void fill_comments(String text) {
		driver.findElement(comments_field).sendKeys(text);	 
	}
	
	public void click_sendemail() {
		driver.findElement(sendemail_field).click();		 
	}
	
	public String verify_message(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		String message = driver.findElement(success_message).getText();
		return message;
	}
}
