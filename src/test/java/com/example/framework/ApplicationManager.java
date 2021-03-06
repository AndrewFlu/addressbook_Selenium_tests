package com.example.framework;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    public WebDriver driver;
    public String baseUrl;

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

    public ApplicationManager(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Andrew\\IdeaProjects\\addressbook_Selenium_tests\\" +
                "src\\main\\resources\\drivers\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://localhost/"+ "/addressbookv4.1.4/?lang=en";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void stop() {
        driver.quit();
    }

    public NavigationHelper getNavigationHelper() {
        if (navigationHelper == null){
            navigationHelper = new NavigationHelper(this);
        }
        return navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        if (groupHelper == null){
            groupHelper = new GroupHelper(this);
        }
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        if (contactHelper == null){
            contactHelper = new ContactHelper(this);
        }
        return contactHelper;
    }
}
