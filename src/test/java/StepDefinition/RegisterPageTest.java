package StepDefinition;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageTest extends BaseClass {

	RegisterPage register;
	
	@Given("User on Register Page")
	public void user_on_register_page() {
	 
     initilization();
	}
    
	@When("User enter personal information {string} and {string}, {string}, {string}, {string}")
	public void user_enter_personal_information_and(String firstName, String LastName , String emailID, String reEmailID, String pass) 
{
		 register=new RegisterPage();
		register.registerFunctionality(firstName, LastName, emailID, reEmailID, pass);
	}
	@Then("User enter DateOfBirth is {string} and {string} and {string}")
	public void user_enter_date_of_birth_is_and_and(String date, String month, String year) {
	    
	register.registerFunctionality(date, month, year);
	}

	@Then("User select gender {string}")
	public void user_select_gender(String gender) {
		
		register.registerFunctionality(gender);
	   
	}
	@Then("User Click on SignUp button")
	public void user_click_on_sign_up_button() {
		
		register.registerFunctionality();
	   
	}

@After
public static void tearDown(Scenario scenario)
{
	
	if(scenario.isFailed())
	{
		byte[]src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    scenario.attach(src, "image/png", scenario.getName());
	
	}
	else
	{
		byte []f=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(f, "image/png", scenario.getName());	}
	
}


}
