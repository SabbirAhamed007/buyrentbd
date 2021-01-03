package stepDeFiNatiOn;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AL_KAIFTest {
	
	public static WebDriver driver;
	
	@Given("^I open buyrentbd website AL KAIF$")
	public void i_open_buyrentbd_website_AL_KAIF() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com");
		
	}

	@Given("^I click on (\\d+)$")
	public void i_click_on(int arg1) throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='home-properties-section-inner']/div[3]/a[2]")).click();


		
		
	}

	@When("^I click on AL KAIF flat$")
	public void i_click_on_AL_KAIF_flat() throws Throwable {
		
		driver.get("https://buyrentbd.com/property/al-kaif-dokhinbari-baitul-aman-housing-society-adabor-dhaka/");

		
		
	}

	@When("^I click on next buttons AL KAIF$")
	public void i_click_on_next_buttons_AL_KAIF() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();


		
		
	}

	@When("^verift the text on the page AL KAIF$")
	public void verift_the_text_on_the_page_AL_KAIF() throws Throwable {
		

		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/div[1]/section[1]/div/div/div[1]/div/div/h2"));

		System.out.println(element.getText());



		
	}

	@Then("^I close browser for AL KAIF$")
	public void i_close_browser_for_AL_KAIF() throws Throwable {
		
		driver.quit();


		
		
	}



}
