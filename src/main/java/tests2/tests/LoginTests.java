package tests2.tests;

import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;
import tests2.models.Account;
import tests2.models.Page;
import tests2.models.SuperMail;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class LoginTests extends TestBase {
    public LoginTests() throws IOException, SAXException, ParserConfigurationException {
    }

    @Test
    public void loginWithInValidData() {
        Account account = Account.builder().domain("bk.ru").login("si1x").password("!!!").build();
        applicationManager.getLoginHelper().login(account);
        Assert.assertFalse(applicationManager.getLoginHelper().isLoggedIn(account.getLogin() + "@" + account.getDomain()));
    }

    @Test
    public void LoginWithValidData() {
        Account account = Account.builder().domain("bk.ru").login("si1x").password("Simon000!").build();
        applicationManager.getLoginHelper().login(account);
        Assert.assertTrue(applicationManager.getLoginHelper().isLoggedIn(account.getLogin() + "@" + account.getDomain()));
    }

}
