package tests.helpers;

import org.openqa.selenium.By;
import tests.ApplicationManager;
import tests.models.Mail;
import tests.models.SuperMail;

public class MailCreationHelper extends HelperBase {
    public MailCreationHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void fillTheMailWithParameters(SuperMail mailExtended) {
        if (mailExtended.getReceiver() != null) {
            driver.findElement(By.name("To")).click();
            driver.findElement(By.name("To")).sendKeys(mailExtended.getReceiver());
            driver.findElement(By.name("Body")).click();
        }
        if (mailExtended.getCopyReceiver() != null) {
            driver.findElement(By.linkText("Копия/Скрытая копия")).click();
            driver.findElement(By.name("CC")).click();
            driver.findElement(By.name("CC")).sendKeys(mailExtended.getCopyReceiver());
            driver.findElement(By.name("BCC")).click();
            driver.findElement(By.name("BCC")).sendKeys(mailExtended.getCopyReceiver());

        }
        if (mailExtended.getSubject() != null) {
            driver.findElement(By.name("Subject")).click();
            driver.findElement(By.name("Subject")).sendKeys(mailExtended.getSubject());
        }
        driver.findElement(By.name("Body")).click();
        driver.findElement(By.name("Body")).sendKeys(mailExtended.getText());
    }

    public void selectReceiver(Mail mail) {
        driver.findElement(By.name("To")).click();
        driver.findElement(By.name("To")).sendKeys(mail.getReceiver());
    }

    public void addTextToMail(Mail mail) {
        if (mail.getText() != null) {
            driver.findElement(By.name("Body")).click();
            driver.findElement(By.name("Body")).sendKeys(mail.getText());
        }
    }

    public void createNewMail(Mail mail) {
        selectReceiver(mail);
        addTextToMail(mail);
       // clickSaveButton();
    }
}
