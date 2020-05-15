package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Payment extends BaseTest implements  DefaultProperties {

    private By btnBankwire = By.cssSelector(".bankwire");
    private By btnSubmit = By.cssSelector("button[type='submit']");

    public void pagamento(){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(btnBankwire).click();
        getDriver().findElement(btnSubmit).click();
    }

}
