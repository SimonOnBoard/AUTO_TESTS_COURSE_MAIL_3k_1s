package tests2.tests;

import lombok.Setter;
import org.junit.Before;
import org.xml.sax.SAXException;
import tests2.ApplicationManager;
import tests2.models.Account;
import tests2.models.Page;
import tests2.models.Settings;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public class AuthBase {
    protected ApplicationManager applicationManager;
    Page page;
    Account account;

    public AuthBase() throws IOException, SAXException, ParserConfigurationException {
        Settings settings = new Settings();
        page = Page.builder().url(settings.getBaseUrl()).height(settings.getHeight()).width(settings.getWidth()).build();
        account = Account.builder().domain(settings.getDomain()).login(settings.getUsername()).password(settings.getPassword()).build();
    }


    @Before
    public void setUp() {
        applicationManager = ApplicationManager.getInstance();
        applicationManager.getPageHelper().openPage(page);
        applicationManager.getLoginHelper().login(account);
    }
}
