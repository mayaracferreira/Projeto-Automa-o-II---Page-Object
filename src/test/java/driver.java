import hooks.BaseTest;
import org.junit.Test;
import pages.*;


public class driver extends BaseTest {

    private Adress adress = new Adress();
    private Authentication authentication = new Authentication();
    private Index index = new Index();
    private Payment payment = new Payment();
    private Shipping shipping = new Shipping();
    private Sig_in sig_in = new Sig_in();
    private Sumary sumary = new Sumary();


    @Test

    public void testCompra() {
        index.acessarAplicacao();
        index.isLoginPagePresent();
        index.selecionarProduto();
        sumary.procederParaCheckout();
        authentication.cadastrarEmail();
        sig_in.DadosPessoais();
        adress.procederParaCheckout();
        shipping.frete();
        payment.pagamento();


    }
}




















