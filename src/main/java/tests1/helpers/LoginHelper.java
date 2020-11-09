package tests1.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import tests1.ApplicationManager;
import tests1.models.Account;

public class LoginHelper extends HelperBase {

    public LoginHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void login(Account account) {
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.name("Login")).clear();
        driver.findElement(By.name("Login")).sendKeys(account.getLogin());
        driver.findElement(By.name("Domain")).click();
        {
            WebElement dropdown = driver.findElement(By.name("Domain"));
            dropdown.findElement(By.xpath("//option[. = '" + account.getDomain() + "']")).click();
        }
        driver.findElement(By.name("Domain")).click();
        driver.findElement(By.id("id_level")).click();
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).sendKeys(account.getPassword());
        driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

    }

}
