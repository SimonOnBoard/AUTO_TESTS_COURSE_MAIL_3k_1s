package tests1.tests;

import org.junit.After;
import org.junit.Before;
import tests1.ApplicationManager;

public class TestBase {
    protected ApplicationManager applicationManager;
    @Before
    public void setUp() {
        applicationManager = ApplicationManager.getInstance();
    }

//    protected void createNewMail(Mail mail) {
//        selectReceiver(mail);
//        addTextToMail(mail);
//        clickSaveButton();
//    }

//    protected void clickSaveButton() {
//        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button .button__icon")).click();
//    }

//    protected void addTextToMail(Mail mail) {
//        if (mail.getText() != null) {
//            driver.findElement(By.name("Body")).click();
//            driver.findElement(By.name("Body")).sendKeys(mail.getText());
//        }
//    }

//    protected void selectReceiver(Mail mail) {
//        driver.findElement(By.name("To")).click();
//        driver.findElement(By.name("To")).sendKeys(mail.getReceiver());
//    }

//    protected void clickOnNewMailButton() {
//        driver.findElement(By.cssSelector(".button__inner")).click();
//    }

//    protected void openMenu() {
//        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button > .button__inner")).click();
//    }

//    protected void login(Account account) {
//        driver.findElement(By.name("Login")).click();
//        driver.findElement(By.name("Login")).sendKeys(account.getLogin());
//        driver.findElement(By.name("Domain")).click();
//        {
//            WebElement dropdown = driver.findElement(By.name("Domain"));
//            dropdown.findElement(By.xpath("//option[. = '" + account.getDomain() + "']")).click();
//        }
//        driver.findElement(By.name("Domain")).click();
//        driver.findElement(By.name("Password")).click();
//        driver.findElement(By.name("Password")).sendKeys(account.getPassword());
//        driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
//    }

//    protected void openPage(Page page) {
//        driver.get(page.getUrl());
//        if (page.getHeight() != 0 && page.getWidth() != 0) {
//            driver.manage().window().setSize(new Dimension(page.getWidth(), page.getHeight()));
//        } else {
//            driver.manage().window().setSize(new Dimension(1920, 1080));
//        }
//    }

//    protected void openMenuByClickingOnIcon() {
//        // 12 | click | css=.toolbar__button-wrapper > .button .button__icon |
//        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button .button__icon")).click();
//    }

//    protected void clickOnCreateNewNoteIcon() {
//        // 14 | click | css=.toolbar__button-wrapper > .button-wrapper:nth-child(3) .button__inner |
//        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button-wrapper:nth-child(3) .button__inner")).click();
//    }

//    protected void clickOnNotes() {
//        // 13 | click | css=.folder-list__item:nth-child(3) .folder |
//        driver.findElement(By.cssSelector(".folder-list__item:nth-child(3) .folder")).click();
//    }

//    protected void fillTheMailWithParameters(SuperMail mailExtended) {
//        if (mailExtended.getReceiver() != null) {
//            driver.findElement(By.name("To")).click();
//            driver.findElement(By.name("To")).sendKeys(mailExtended.getReceiver());
//            driver.findElement(By.name("Body")).click();
//        }
//        if (mailExtended.getCopyReceiver() != null) {
//            driver.findElement(By.linkText("Копия/Скрытая копия")).click();
//            driver.findElement(By.name("CC")).click();
//            driver.findElement(By.name("CC")).sendKeys(mailExtended.getCopyReceiver());
//            driver.findElement(By.name("BCC")).click();
//            driver.findElement(By.name("BCC")).sendKeys(mailExtended.getCopyReceiver());
//
//        }
//        if (mailExtended.getSubject() != null) {
//            driver.findElement(By.name("Subject")).click();
//            driver.findElement(By.name("Subject")).sendKeys(mailExtended.getSubject());
//        }
//        driver.findElement(By.name("Body")).click();
//        driver.findElement(By.name("Body")).sendKeys(mailExtended.getText());
//    }

//    protected void clickOnSendButton() {
//        driver.findElement(By.cssSelector(".toolbar__button-wrapper_right > .button > .button__inner")).click();
//    }
}
