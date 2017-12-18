package com.example.tests;

public class ContactData {
    public String contactName;
    public String contactSurname;
    public String contactAddress;
    public String contactPhone;
    public String contactEmail;
    public String contactAddress2;
    public String month;
    public String day;
    public String year;
    public String groupName;

    public ContactData(String contactName, String contactSurname, String contactAddress, String contactPhone,
                       String contactEmail, String contactAddress2, String month, String day, String year, String groupName) {
        this.contactName = contactName;
        this.contactSurname = contactSurname;
        this.contactAddress = contactAddress;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.contactAddress2 = contactAddress2;
        this.month = month;
        this.day = day;
        this.year = year;
        this.groupName = groupName;
    }

    public ContactData() {

    }

    public String getContactName() {
        return contactName;
    }

    public String getContactSurname() {
        return contactSurname;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactAddress2() {
        return contactAddress2;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getGroupName(){return groupName;}
}
