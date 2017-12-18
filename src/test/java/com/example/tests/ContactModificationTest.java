package com.example.tests;


import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void editSomeContact(){
        app.getNavigationHelper().openMainPage();
        app.getContactHelper().goToContactModifirerPage();

        ContactData contactData = new ContactData();
        contactData.contactName = "New name";
        contactData.contactSurname = "Second surname";
        contactData.day = "2";
        contactData.month = "September";
        contactData.year = "1990";
        contactData.groupName ="Selenium IDE group 2";

        app.getContactHelper().fillModifyContactForm(contactData);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToMainPage();


}
}
