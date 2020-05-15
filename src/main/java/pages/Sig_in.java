package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Sig_in extends BaseTest implements  DefaultProperties {

    private By slcMrs = By.id("id_gender2");
    private By txtFisrtName = By.id("customer_firstname");
    private By txtLastName = By.id("customer_lastname");
    private By txtPasswd = By.id("passwd");
    private By txtAdress1 = By.id("address1");
    private By txtAdress2 = By.id("address2");
    private By txtCity = By.id("city");
    private By txtState = By.id("id_state");
    private By txtPostCode = By.id("postcode");
    private By txtPhone = By.id("phone_mobile");
    private By txtAlias = By.id("alias");

    private By btnSubimit = By.id("submitAccount");



        public void DadosPessoais (){
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            getDriver().findElement(slcMrs).click();
            getDriver().findElement(txtFisrtName).sendKeys("Mayara");
            getDriver().findElement(txtLastName).sendKeys("Ferreira");
            getDriver().findElement(txtPasswd).sendKeys("12345");
            getDriver().findElement(txtAdress1).sendKeys("Rua Marte");
            getDriver().findElement(txtAdress2).sendKeys("Rua Terra");
            getDriver().findElement(txtCity).sendKeys("Jandira");
            getDriver().findElement(txtState).sendKeys("Alaska");
            getDriver().findElement(txtPostCode).sendKeys("00000");
            getDriver().findElement(txtPhone).sendKeys("5555555555");
            getDriver().findElement(txtAlias).sendKeys("Rua Saturno");
            getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            getDriver().findElement(btnSubimit).click();
        }

}
