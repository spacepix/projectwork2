package hu.masterfield.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResult extends BasePage {
    public SearchResult(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h2")
    WebElement searchResultTitle;

    public void possibleRoutesShouldBeDisplayed() {
        WebElement title = searchResultTitle;
        isLoaded(searchResultTitle);
        wait.until(ExpectedConditions.textToBePresentInElementLocated((By) title, "Lehetséges útvonalak"));
    }

}

