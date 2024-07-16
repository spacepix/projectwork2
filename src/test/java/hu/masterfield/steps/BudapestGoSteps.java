package hu.masterfield.steps;

import hu.masterfield.pages.SearchResult;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import hu.masterfield.pages.HomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BudapestGoSteps {

    protected static WebDriver driver;

    protected static WebDriverWait wait;
    public HomePage homePage;
    public SearchResult searchResult;


    /* Selenium Webdriver elindítása */
    @BeforeAll
    public static void openBrowser() {
        // set chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        // init driver
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().setSize(new Dimension(900, 900));
    }

    @AfterAll
    public static void closeBrowser() {
        driver.quit();
    }


    @Given("I open BudapestGO")
    public void iOpenBudapestGO() {
        driver.get("https://futar.bkk.hu/");
        HomePage homePage = new HomePage(driver);
        homePage.isLoaded();
        homePage.isInteractable();
    }

    @When("I accept cookies")
    public void iAcceptCookies() {
        homePage.acceptCookies();

        //By cookieButton = By.xpath("//button[text()='Elfogadom']");
        // driver.findElement(cookieButton).click();
    }


    @When("I type {string} into departure field")
    public void iTypeIntoSource(String departure) {
        homePage.iTypeIntoSource(departure);
    }

    @And("I type {string} into destination field")
    public void iTypeIntoDestinationField(String destination) {
        homePage.iTypeIntoDestinationField(destination);
    }

    @And("I click on the Search button")
    public void iClickOnTheSearchButton() {
        homePage.iClickOnTheSearchButton();
    }

    @Then("possible routes should be displayed")
    public void possibleRoutesShouldBeDisplayed() {
        searchResult.possibleRoutesShouldBeDisplayed();

    }

    @When("I Start a Bug Report")
    public void IclickReportaBug() {
        homePage.IclickReportaBug();
    }


    @Then("Report a bug page is opened")
    public void reportABugPageIsOpened() {
        homePage.reportABugPageIsOpened();
    }


    @Given("the language is set to {string}")
    public void theLanguageIsSetTo(String arg0) {
    }

    @When("I change the language to {string}")
    public void iChangeTheLanguageTo(String arg0) {
    }

    @Then("language is changed to <newLanguage>")
    public void languageIsChangedToNewLanguage() {
    }

    @When("I type {string} into Search for lines, stops and addresses field")
    public void iTypeIntoSearchForLinesStopsAndAddressesField(String arg0) {
    }

    @And("click on {string} in the drop down window")
    public void clickOnInTheDropDownWindow(String arg0) {
    }

    @Then("I get Page with line details and schedule")
    public void iGetPageWithLineDetailsAndSchedule() {
    }

    @Then("I get a dropdown Menu with all the Stops and Line information in that street")
    public void iGetADropdownMenuWithAllTheStopsAndLineInformationInThatStreet() {
    }

   
}

