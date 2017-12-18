package com.example.tests;


import org.testng.annotations.Test;

import java.util.List;

public class ContactRemovalTest extends TestBase {

    @Test
    public void deleteSomeContact(){
        app.getNavigationHelper().openMainPage();
        app.getContactHelper().goToContactModifirerPage();
        // save old state
        // actions
        app.getContactHelper().deleteContact();
        app.getContactHelper().returnToMainPage();
        // save new state

        // compare states
    }

}
