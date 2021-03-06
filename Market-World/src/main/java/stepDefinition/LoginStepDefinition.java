package stepDefinition;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition
{
	WebDriver driver;
	

	@Given("^user is already on home page$")
	public void user_is_already_on_home_page() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging778.marketworld.online");
	}

	@When("^title of home page is$")
	public void title_of_home_page_is() throws Exception 
	{
		String title = driver.getTitle();
		System.out.println("Title is : "+title);
	}

	@Then("^Then user clicks on  login button$")
	public void then_user_clicks_on_login_button() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\'nav\']/div[4]/ul/li[3]/a")).click();
	}

	@Then("^users enter the \"([^\"]*)\"and \"([^\"]*)\"$")
	public void users_enter_the_and(String email, String password) throws Exception 
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		
	}
	
	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Exception 
	{
		Robot robot = new Robot();
		driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
	}
	
	@Then("^user click on enter competition button$")
	public void user_click_on_enter_competition_button() throws Exception 
	{
		driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/div/div/button/div")).click();
		Thread.sleep(3000);
	}

	@Then("^user click on play game button$")
	public void user_click_on_play_game_button() throws Exception 
	{
		driver.findElement(By.xpath("/html/body/main/section[2]/div/div[2]/div[2]/div/button/div")).click();
		Thread.sleep(3000);
	}

	@Then("^user click on start game button$")
	public void user_click_on_start_game_button() throws Exception 
	{

		driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/a")).click();
		Thread.sleep(2000);
		
		

	}

	
}
