package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Shipping extends BaseTest implements  DefaultProperties {

    private By slcIagree = By.id("cgv");
    private By btnProcessCarrier = (By.cssSelector("button[name='processCarrier']"));


    public void frete(){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(slcIagree).click();
        getDriver().findElement(btnProcessCarrier).click();
    }

}
