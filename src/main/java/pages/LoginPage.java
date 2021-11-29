package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//ul//li")
    List<WebElement> locations;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    public void login(String username, String password, String locationName){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        clickLocation(locationName);
        loginButton.click();
    }

    public void clickLocation(String locationName){
        for (WebElement location : locations){
            if (location.getText().trim().equalsIgnoreCase(locationName)){
                location.click();
                break;
            }
        }
    }
}
