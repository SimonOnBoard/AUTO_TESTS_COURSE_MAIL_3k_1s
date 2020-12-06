package tests2.helpers;

import org.openqa.selenium.By;
import tests2.ApplicationManager;
import tests2.models.Mail;
import tests2.models.SuperMail;

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
        if (mailExtended.getSubject() != null) {
            driver.findElement(By.name("Subject")).click();
            driver.findElement(By.name("Subject")).sendKeys(mailExtended.getSubject());
        }
        if (mailExtended.getCopyReceiver() != null) {
            driver.findElement(By.linkText("Копия/Скрытая копия")).click();
            driver.findElement(By.name("CC")).click();
            driver.findElement(By.name("CC")).sendKeys(mailExtended.getCopyReceiver());
            driver.findElement(By.name("BCC")).click();
            driver.findElement(By.name("BCC")).sendKeys(mailExtended.getCopyReceiver());

        }
        driver.findElement(By.name("Body")).click();
        driver.findElement(By.name("Body")).clear();
        driver.findElement(By.name("Body")).sendKeys(mailExtended.getText());
    }

    public void selectReceiver(Mail mail) {
        driver.findElement(By.name("To")).click();
        driver.findElement(By.name("To")).sendKeys(mail.getReceiver());
    }

    public void addTextToMail(Mail mail) {
        if (mail.getText() != null) {
            driver.findElement(By.name("Body")).click();
            driver.findElement(By.name("Body")).clear();
            driver.findElement(By.name("Body")).sendKeys(mail.getText());
        }
    }

    public void createNewMail(Mail mail) {
        selectReceiver(mail);
        addTextToMail(mail);
    }

    public Mail getCreatedMailData() {
        String text = driver.findElement(By.name("Body")).getText();
        String receiver = driver.findElement(By.name("To")).getAttribute("value");
        receiver = receiver.substring(1, receiver.length() - 1);
        return new Mail(receiver, text);
    }

    public SuperMail getExtendedMailData() {
        String subject = driver.findElement(By.className("readmsg__theme")).getText();
        String text = driver.findElement(By.id("readmsg__body")).getText();
        return new SuperMail(null, text, null, subject);
    }
}
