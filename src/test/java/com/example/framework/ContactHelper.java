package com.example.framework;

import com.example.tests.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    protected ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getContactName());
        type(By.name("lastname"), contactData.getContactSurname());
        type(By.name("address"), contactData.getContactAddress());
        type(By.name("mobile"), contactData.getContactPhone());
        type(By.name("email"), contactData.getContactEmail());
        selectByText(By.name("bday"), contactData.getDay());
        selectByText(By.name("bmonth"), contactData.getMonth());
        type(By.name("byear"), contactData.getYear());
        selectByText(By.name("new_group"), contactData.getGroupName());
        type(By.name("address2"), contactData.getContactAddress2());
    }


    public void submitNewContactCreation() {
        click(By.name("submit"));
    }

    public void goToContactCreationPage() {
        click(By.linkText("add new"));
    }

    public void returnToMainPage() {
        click(By.linkText("home"));
    }

    public void goToContactModifirerPage() {
        click(By.xpath(".//*[@id='maintable']/tbody/tr[2]/td[7]/a[1]"));
    }

    public void deleteContact() {
        click(By.xpath(".//*[@id='content']/form[2]/input[2]"));
    }

    public void submitContactModification() {
        click(By.xpath(".//*[@id='content']/form[1]/input[11]"));
    }

    public void fillModifyContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getContactName());
        type(By.name("lastname"), contactData.getContactSurname());
        type(By.name("address"), contactData.getContactAddress());
        type(By.name("home"), contactData.getContactPhone());
        type(By.name("email"), contactData.getContactEmail());
        selectByText(By.name("bday"), contactData.getDay());
        selectByText(By.name("bmonth"), contactData.getMonth());
        type(By.name("byear"), contactData.getYear());
        type(By.name("address2"), contactData.getContactAddress2());
    }
}
