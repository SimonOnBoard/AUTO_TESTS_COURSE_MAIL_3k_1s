package tests2.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import tests2.ApplicationManager;
import tests2.models.Account;

public class LoginHelper extends HelperBase {

    public LoginHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void login(Account account) {
        if (isLoggedIn()) {
            if (isLoggedIn(account.getLogin() + "@bk.ru")) {
                return;
            }
            logout();
        }

        driver.findElement(By.name("Login")).click();
        driver.findElement(By.name("Login")).clear();
        driver.findElement(By.name("Login")).sendKeys(account.getLogin());
        driver.findElement(By.name("Domain")).click();
        {
            WebElement dropdown = driver.findElement(By.name("Domain"));
            dropdown.findElement(By.xpath("//option[. = '" + account.getDomain() + "']")).click();
        }
        driver.findElement(By.name("Domain")).click();
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).sendKeys(account.getPassword());
        driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
    }

    private void logout() {
        WebElement webElement = driver.findElement(By.linkText("Выйти"));
        webElement.click();
    }

    public boolean isLoggedIn() {
        try {
            applicationManager.getClickerHelper().openMenuByClickingOnIcon();
        } catch (Exception e) {
            try {
                driver.findElement(By.cssSelector(".logo")).click();
            } catch (Exception x) {
                return false;
            }
        }

        try {
            String text = driver.findElement(By.className("toolbar__username")).getText();
            driver.navigate().back();
            if (text != null) return true;
        } catch (Exception e) {
            driver.navigate().back();
            return false;
        }
        return false;
    }

    public boolean isLoggedIn(String username) {
        try {
            applicationManager.getClickerHelper().openMenuByClickingOnIcon();
        } catch (Exception e) {
            try {
                driver.findElement(By.cssSelector(".logo")).click();
            } catch (Exception x) {
                return false;
            }
        }
        WebElement element = null;
        try {
            element = driver.findElement(By.className("toolbar__username"));
        } catch (Exception e) {
            return false;
        }
        String text = null;
        if (element != null) {
            text = element.getText();
            driver.navigate().back();
            return text.equals(username);
        }
        return false;
    }


}
