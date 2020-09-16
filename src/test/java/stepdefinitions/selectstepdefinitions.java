package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.searchPageObjects;

import static org.junit.Assert.assertEquals;

public class selectstepdefinitions {
    WebDriver driver;
   //searchPageObject SearchPage;

    @Given("that you are on the home page")
    public void that_you_are_on_the_home_page() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Chriselda\\Desktop\\IntelliJ\\geckodriver.exe");
        Thread.sleep(5000);
        driver = new FirefoxDriver();
        driver.get("https://magento.abox.co.za/index.php/");

    }

    @When("you search for the product")
    public void you_search_for_the_product() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath(searchPageObjects.btnSearch())).click();
        driver.findElement(By.xpath(searchPageObjects.btnListSearch())).click();
        driver.findElement(By.xpath(searchPageObjects.btnCategory())).click();
    }

    @Then("you can view the product list page")
    public void you_can_view_the_product_list_page() {
        /*
        Asserts page Heading
         */
        assertEquals(driver.findElement(By.xpath(searchPageObjects.txtAssert())).getText(), "Hoodies & Sweatshirts");

        /*
        Scrolls down the product list
         */
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
