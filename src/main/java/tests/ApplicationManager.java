package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.helpers.ClickerHelper;
import tests.helpers.LoginHelper;
import tests.helpers.MailCreationHelper;
import tests.helpers.PageHelper;
import tests.models.Account;
import tests.models.Mail;
import tests.models.Page;
import tests.models.SuperMail;

public class ApplicationManager {
    private WebDriver driver;

    private ClickerHelper clickerHelper;
    private LoginHelper loginHelper;
    private MailCreationHelper mailCreationHelper;
    private PageHelper pageHelper;

    public WebDriver getDriver() {
        return driver;
    }

    public ClickerHelper getClickerHelper() {
        return clickerHelper;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public MailCreationHelper getMailCreationHelper() {
        return mailCreationHelper;
    }

    public PageHelper getPageHelper() {
        return pageHelper;
    }

    public ApplicationManager() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ken\\IdeaProjects\\Schooool\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        clickerHelper = new ClickerHelper(this);
        loginHelper = new LoginHelper(this);
        mailCreationHelper = new MailCreationHelper(this);
        pageHelper = new PageHelper(this);
    }

    public void stop() {
        driver.quit();
    }
}
