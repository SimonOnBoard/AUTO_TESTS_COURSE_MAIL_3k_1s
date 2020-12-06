package tests.helpers;

import org.openqa.selenium.By;
import tests.ApplicationManager;

public class ClickerHelper extends HelperBase {

    public ClickerHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void clickSaveButton() {
        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button .button__icon")).click();
    }

    public void clickOnNewMailButton() {
        driver.findElement(By.cssSelector(".button__inner")).click();
    }

    public void openMenuByClickingOnIcon() {
        // 12 | click | css=.toolbar__button-wrapper > .button .button__icon |
        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button .button__icon")).click();
    }

    public void clickOnCreateNewNoteIcon() {
        // 14 | click | css=.toolbar__button-wrapper > .button-wrapper:nth-child(3) .button__inner |
        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button-wrapper:nth-child(3) .button__inner")).click();
    }

    public void clickOnNotes() {
        // 13 | click | css=.folder-list__item:nth-child(3) .folder |
        driver.findElement(By.cssSelector(".folder-list__item:nth-child(3) .folder")).click();
    }

    public void clickOnSendButton() {
        driver.findElement(By.cssSelector(".toolbar__button-wrapper_right > .button > .button__inner")).click();
    }

    public void openMenu() {
        driver.findElement(By.cssSelector(".toolbar__button-wrapper > .button > .button__inner")).click();
    }
}
