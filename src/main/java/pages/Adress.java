package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Adress extends BaseTest implements  DefaultProperties {

    private By btnProcessAddress = (By.cssSelector("button[name='processAddress']"));

    public void procederParaCheckout() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().findElement(btnProcessAddress).click();
    }

}