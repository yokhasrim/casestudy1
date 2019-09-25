package packnew;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class stepdef {
	WebDriver driver;
	Select sel;
	
	@Given("open the url of testmeapp")
	public void start(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\DRIVER1\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	@And ("click the signup button")
	public void signup(){
		driver.findElement(By.linkText("SignUp")).click();
			
	}
	 @Then ("the registration page is displayed")
	 public void regipage(){
		 
			
	 }
	 @And ("enter the username")
	 public void username(){
		 driver.findElement(By.id("userName")).sendKeys("Nasreen81");
			 
	 }
	 @And ("enter the firstname")
	 public void firstname(){
		 driver.findElement(By.id("firstName")).sendKeys("Nasreen");
			
	 }
	 @And ("enter the lastname")
	 public void lastname(){
		 driver.findElement(By.id("lastName")).sendKeys("khan");
			
	 }
	 @And ("enter the password")
	 public void password(){
		 driver.findElement(By.id("password")).sendKeys("nasreen123");
			
	 }
	 
	 @And ("enter the confirmpassword")
	 public void cpassword(){
		 driver.findElement(By.id("pass_confirmation")).sendKeys("nasreen123");
			
	 }
	 @And ("enter the gender")
	 public void gender(){
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
			
	 }
	 @And ("enter the emailid")
	 public void emailid(){
		 driver.findElement(By.id("emailAddress")).sendKeys("nasreen123@gmail.com");
			
	 }
	 @And ("specify the mobileno")
	 public void mobile(){
		 driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
			
	 }
	 @And ("specify the dob")
	 public void dob(){
		 driver.findElement(By.id("dob")).sendKeys("12/09/1997");
			
	 }
	 @And ("specify the address")
	 public void address(){
		 driver.findElement(By.id("address")).sendKeys("kolathur,Chennai");
			
	 }
	 @And ("select the securityquestion")
	 public void sq(){
		
			sel=new Select(driver.findElement(By.name("securityQuestion")));
			sel.selectByIndex(1);
	 }
	 @And ("select the answer")
	 public void answer(){
		 driver.findElement(By.id("answer")).sendKeys("White");
			
	 }
	 @Then ("click Register")
	 public void reg(){
		 driver.findElement(By.xpath("//input[@value='Register']")).click();
			
	 }
	 

}
