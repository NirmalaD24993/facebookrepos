package PageLayer;


 


import static UtilityLayer.Handledropdown.*;
import static UtilityLayer.UtilClass.*;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{

	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement reemail;
	
	@FindBy(name="reg_passwd__")
	private WebElement password;
	
	
	@FindBy(name="birthday_day")
	private WebElement day;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBy(xpath="//span[@class='_5k_2 _5dba']/label")
	private List<WebElement> selectgender;
	
	
	@FindBy(name="websubmit")
	private WebElement submit;
	
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerFunctionality(String fname, String lname, String Email, String reEmail, String Password)
	{
		
		sendKeys(firstname, fname);
		sendKeys(lastname, lname);
		sendKeys(email, Email);
		sendKeys(reemail, reEmail);
		sendKeys(password, Password);
	}
	
		public void registerFunctionality(String Day, String Month, String Year)
		{
			handleDrodown(day, Day);
			handleDrodown(month, Month);
			handleDrodown(year, Year);
		}
		
		public void registerFunctionality(String gender)
		{
			
			
			handleRadioButton(selectgender, gender);
		}
		
		
		public void registerFunctionality()
		{
			click(submit);
		}
		
	}
	
	
	
	
	
	
	


