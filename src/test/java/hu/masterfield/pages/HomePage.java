package hu.masterfield.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"toolbar\"]/div[1]/a[1]")
    WebElement budapestGoLogo;

    @FindBy(xpath = "//button[text()='Elfogadom']")
    WebElement acceptCookiesButton;

    @FindBy(xpath = "//input[@placeholder='Honnan']")
    WebElement startLocationField;

    @FindBy(xpath = "//input[@placeholder='Hova']")
    WebElement destinationLocationField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement tripPlanerSearchButton;

    @FindBy(xpath = "//*[@id=\"panel-inner\"]/p/span[1]/a/span[2]")
    WebElement clickBugButton;

    @FindBy(xpath = "//*[@id=\"instabugForm\"]/h3")
    WebElement reportBugResultTitle;


    public boolean isLoaded() {
        return isLoaded(budapestGoLogo) && isLoaded(acceptCookiesButton);
    }


    public boolean isInteractable() {
        return isInteractable(acceptCookiesButton);
    }

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public void iTypeIntoSource(String departure) {

        startLocationField.sendKeys(departure + Keys.TAB);
    }

    public void iTypeIntoDestinationField(String destination) {
        destinationLocationField.sendKeys(destination + Keys.TAB);
    }

    public void iClickOnTheSearchButton() {
        tripPlanerSearchButton.click();
        SearchResult searchResult = new SearchResult(driver);

    }

    public void IclickReportaBug() {
        clickBugButton.click();

    }

    public void reportABugPageIsOpened() {
        isLoaded(reportBugResultTitle);
        //Ide még több ellenőrzés pontot kell elarkni
    }

}
