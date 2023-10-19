package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.IClass;

import java.util.List;


//ok
public class LoginPage {

    // Declare of the web elements
    @FindBy(name="username")
    WebElement txtUsername;

    @FindBy(name="password")
    WebElement txtPassword;

    //ok
    @FindBy(tagName = "button")
    WebElement btnLogin;

    @FindBy(className = "oxd-userdropdown-name")
    WebElement btnUserProfile;

    @FindBy(className = "oxd-userdropdown-link")
    List<WebElement> linkSubItems;



//ok
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


    //ok
    public void doLogin(String username, String password){
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }



    public void doLogout(){
        btnUserProfile.click();
        linkSubItems.get(3).click();

    }


}
