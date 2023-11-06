package sa.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SAHome {
	
	
    WebDriver driver;
	
	public SAHome(WebDriver driver)
	{
		
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@id='signin_button']")
	WebElement signinbuttn;
	
	@FindBy(xpath="//button[@id='signup_button']")
	WebElement signupbuttn;
	
	
	public  SignIn click_signin() {
		
		 signinbuttn.click();
		 SignIn signin=new SignIn(driver);
		 return signin;
		 
	}

	public  SignUp click_signup() {
		
		signupbuttn.click();
		SignUp signup=new SignUp(driver);
		 return signup;
		 
	}

	public void goTo(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}
	
	
	

}
