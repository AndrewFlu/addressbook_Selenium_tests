package com.example.tests;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GroupCreationTest extends TestBase {

    @Test
    public void testNonEmptyGroupCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().goToGroupsPage();
        // save old state
        List<GroupData> oldList = app.getGroupHelper().getGroups();
        // actions
        app.getGroupHelper().initNewGroupCreation();
        GroupData group= new GroupData();
        group.groupName = "bbb";
        group.header = "header_1";
        group.footer = "footer_1";
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
        // save new state
        List<GroupData> newList = app.getGroupHelper().getGroups();

        // compare states
        oldList.add(group);

        Collections.sort(oldList);
        assertEquals(newList, oldList);

    }

    @Test
    public void testEmptyGroupCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().initNewGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
    }

}
