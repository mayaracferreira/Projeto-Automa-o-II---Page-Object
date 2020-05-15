package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class Index extends BaseTest implements  DefaultProperties {

    private By btnAddtoCart = By.xpath("//a[@data-id-product='3']");
    private By btnProcedTocheckout1 =By.xpath("//a[@title='Proceed to checkout']");

    public  void acessarAplicacao(){
        getDriver().get(URL_BASE);

    }
    public  boolean isLoginPagePresent(){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = getWait().until((ExpectedConditions.elementToBeClickable(btnAddtoCart)));
        return element.isEnabled();
    }

    public void  selecionarProduto(){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(btnAddtoCart).click();
        getDriver().findElement(btnProcedTocheckout1).click();
    }
}
