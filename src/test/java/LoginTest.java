import org.example.LoginPage;
import org.example.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        ProductsPage productspage =new ProductsPage(driver);
        assertTrue(productspage.getAssertMsgForEnteringThePage().getText()
                        .contains("Products"),
                "The Test Fails");
    }
}