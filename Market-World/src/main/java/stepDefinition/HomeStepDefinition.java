package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDefinition
{
	
	WebDriver driver;

	@Given("^users are already on Home page$")
	public void users_are_already_on_login_pages() throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging778.marketworld.online/");
	}

	@When("^title of Home page is$")
	public void title_of_logins_page_is() throws Exception 
	{
		
		String title = driver.getTitle();
		System.out.println("Title of Home Page is : "+title);
		Thread.sleep(1000);
	}

	@Then("^users click on Competition button\"$")
	public void users_click_on_Competition_button() throws Exception 
	{
//		driver.findElement(By.xpath("//*[@id=\'nav\']/div[4]/ul/li[1]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\'general_modal\']/div/div/div/div/fieldset/button/div")).click();
//		Thread.sleep(1000);
	}

	@Then("^users enters click on  Winners button$")
	public void users_enters_click_on_Winners_button() throws Exception 
	{
////		Robot robot = new Robot();
//		
//		driver.findElement(By.xpath("//*[@id=\'nav\']/div[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//
//
////		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////			try {
////				FileUtils.copyFile(screen, new File("D:\\Screenshot/Ajay.png"));
////				
////			} catch (Exception e) {
////				System.out.println(e.getMessage());
////			}
////			robot.keyPress(KeyEvent.VK_ALT);
////			robot.keyPress(KeyEvent.VK_LEFT);
////			robot.keyRelease(KeyEvent.VK_ALT);
////			robot.keyRelease(KeyEvent.VK_LEFT);
			
		}


	@Then("^users enters click on  Login button$")
	public void users_enters_click_on_Login_button() throws Exception 
	{
//		driver.findElement(By.xpath("//*[@id=\'nav\']/div[4]/ul/li[3]/a")).click();
//		Thread.sleep(2000);
	}

	@Then("^user clicks on  Sign Up button$")
	public void user_clicks_on_Sign_Up_button() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\'nav\']/div[4]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("full_name")).sendKeys("Ajay SIngh");
		driver.findElement(By.name("email")).sendKeys("testingajay8@gmail.com");
		driver.findElement(By.name("password")).sendKeys("qwerty");
		driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
	}

//	@Then("^user close the browser$")
//	public void user_close_the_browser() throws Exception 
//	{
//
//	}
	
}
