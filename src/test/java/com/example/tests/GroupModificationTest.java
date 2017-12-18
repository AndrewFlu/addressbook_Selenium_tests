package com.example.tests;


import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void modifySomeGroup(){
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().initGroupModification(1);
        GroupData groupData = new GroupData();
        groupData.groupName = "new_name";
        app.getGroupHelper().fillGroupForm(groupData);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();
    }
}
