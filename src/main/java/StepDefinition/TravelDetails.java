package StepDefinition;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelDetails {

    WebDriver driver;


	 @Given("^Home Page should be open$")
	 public void user_already_on_login_page() {
	 System.setProperty("webdriver.chrome.driver","New folder\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.goibibo.com/");
	 }

	@When("^Page Title is Goibibo-XXX$")
	 public void title_of_website() {
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off", title);
	 }

	 @Then("^Maximize the window$")
	 public void max_win() {
	 	driver.manage().window().maximize();
	 	System.out.println("The browser got maximized");
	 }


	 @Then("^Source is entered$")
		public void src_details() {
		 driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Delhi (DEL)");
		 WebDriverWait nw = new WebDriverWait(driver, 30);
		 nw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-autosuggest-1-suggestion--0\"]"))).click();
	 }

	@And("^destination is entered$")
	public void des_details() {
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Mumbai (BOM)");
		WebDriverWait nw = new WebDriverWait(driver, 30);
		nw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-autosuggest-1-suggestion--0\"]"))).click();
	}

	@And("^Booking Date Details are selected$")
	public void date_details() {
	 	driver.findElement(By.id("departureCalendar")).click();
		WebDriverWait nw = new WebDriverWait(driver, 30);
		nw.until(ExpectedConditions.visibilityOfElementLocated(By.id("fare_20200825"))).click();
	}

	@And("^Search button is clicked$")
	public void search() {
	 	driver.findElement(By.id("gi_search_btn")).click();
	}

	@Then("^Flight details page should get opened$")
	public void flight_details_page_verification() {
		driver.get("https://www.goibibo.com/flights/air-DEL-BOM-20200825--1-0-0-E-D/");
	}

	@And("^Flight Search should be sorted by Highest price$")
	public void Sorted_by_price() {
	 	driver.findElement(By.xpath("//span[contains(text(),'PRICE')]")).click();
	}

	@Then("^Click on first Book Button$")
	public void Book() {
		driver.findElement(By.xpath("//*[@data-cy='bookBtn']")).click();
	}

	@Then("^Add Travel Protection$")
	public void travel_protect() {
		WebDriverWait nw = new WebDriverWait(driver, 30);
		nw.until(ExpectedConditions.visibilityOfElementLocated(By.id("risk-trip"))).click();
	}

	@Then("^Enter the details of Traveller$")
	public void select_title() {
	 	Select s = new Select(driver.findElement(By.xpath("//*[@data-fieldname='Title']")));
	 	s.selectByVisibleText("Mr");
	 	driver.findElement(By.id("AdultfirstName1")).sendKeys("Vijay");
	 	driver.findElement(By.id("AdultlastName1")).sendKeys("Tomar");
	 	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	 	driver.findElement(By.id("mobile")).sendKeys("9999999999");
	 }

	 @And("^Click on Proceed$")
	 public void Proceed() {
	 	driver.findElement(By.xpath("//div[contains(text(),'Proceed')]")).click();
		WebDriverWait nw = new WebDriverWait(driver, 30);
		nw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button blue large fb padLR30']"))).click();
		 driver.findElement(By.xpath("//button[@class='width100 ico14 padLR20 white button hpyOrangeBg large txtCenter marginT15 brdrTLR0 padTB5 bkPgPrcd']")).click();
	 }

	@Then("^Select the wallet option for payment$")
	public void Payment() {
		WebDriverWait nw = new WebDriverWait(driver, 30);
		nw.until(ExpectedConditions.visibilityOfElementLocated(By.id("tab_wallet"))).click();
	}
	@Then("^Browser should be closed$")
	public void close_browser() {
	 	driver.quit();
	}
}
