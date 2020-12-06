package tests.helpers;

import org.openqa.selenium.Dimension;
import tests.ApplicationManager;
import tests.models.Page;

public class PageHelper extends HelperBase {
    public PageHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void openPage(Page page) {
        driver.get(page.getUrl());
        if (page.getHeight() != 0 && page.getWidth() != 0) {
            driver.manage().window().setSize(new Dimension(page.getWidth(), page.getHeight()));
        } else {
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }
    }
}
