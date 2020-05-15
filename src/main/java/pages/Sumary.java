package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;

public class Sumary extends BaseTest implements  DefaultProperties {

    private By btnProcedTocheckout2 = By.cssSelector(".columns-container a[title='Proceed to checkout']");

    public void procederParaCheckout (){
        getDriver().findElement(btnProcedTocheckout2).click();

    }


}
