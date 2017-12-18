package com.example.framework;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

    protected NavigationHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openMainPage() {
        driver.get(manager.baseUrl);
    }

    public void goToGroupsPage() {
        click(By.linkText("groups"));
    }
}
