package com.example.tests;


import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testNonEmptyContactCreation() throws Exception {

        app.getNavigationHelper().openMainPage();
        app.getContactHelper().goToContactCreationPage();
        ContactData contact = new ContactData();
        contact.contactName = "Dmitriy";
        contact.contactSurname = "Egoshin";
        contact.contactAddress = "Gogolya 2a, 2 floor";
        contact.contactAddress2 = "Voznesenskaya 124";
        contact.contactEmail = "egoshindima@yandex.ru";
        contact.contactPhone = "89177285448";
        contact.day = "10";
        contact.month = "September";
        contact.year = "1984";
        contact.groupName = "group name 1";
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitNewContactCreation();
        app.getContactHelper().returnToMainPage();
    }

    @Test
    public void testEmptyContactCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getContactHelper().goToContactCreationPage();

        app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "",
                "", "-", "-", "", "[none]"));
        app.getContactHelper().submitNewContactCreation();
        app.getContactHelper().returnToMainPage();
    }

}
