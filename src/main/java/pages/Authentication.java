package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Authentication extends BaseTest implements  DefaultProperties {

    private By txtEmail = By.id("email_create");
    private By btnsubimitCreat = By.id("SubmitCreate");


    public void cadastrarEmail() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(txtEmail).sendKeys("mayara.test8@gft.com");
        getDriver().findElement(btnsubimitCreat).click();

    }

}