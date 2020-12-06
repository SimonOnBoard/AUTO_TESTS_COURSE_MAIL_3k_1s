package tests2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests2.helpers.ClickerHelper;
import tests2.helpers.LoginHelper;
import tests2.helpers.MailCreationHelper;
import tests2.helpers.PageHelper;
import tests2.models.Page;

public class ApplicationManager {
    private static ThreadLocal<ApplicationManager> app = new ThreadLocal<>();

    public static ApplicationManager getInstance() {
        if (app.get() == null) {
            ApplicationManager newInstance = new ApplicationManager();
            newInstance.getPageHelper().openPage(Page.builder().url("https://m.mail.ru/login").height(1920).width(1080).build());
            app.set(newInstance);
        }
        return app.get();
    }

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

    private ApplicationManager() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ken\\IdeaProjects\\Schooool\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        clickerHelper = new ClickerHelper(this);
        loginHelper = new LoginHelper(this);
        mailCreationHelper = new MailCreationHelper(this);
        pageHelper = new PageHelper(this);
    }

    @Override
    protected void finalize() throws Throwable {
        driver.quit();
        super.finalize();
    }
}
