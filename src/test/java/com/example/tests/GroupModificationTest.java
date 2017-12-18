package com.example.tests;


import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class GroupModificationTest extends TestBase {

    @Test
    public void modifySomeGroup(){
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().goToGroupsPage();
        // save state
        List<GroupData> oldList = app.getGroupHelper().getGroups();
        // actions
        app.getGroupHelper().initGroupModification(0);
        GroupData group = new GroupData();
        group.groupName = "new_name555";
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();
        // save new state
        List<GroupData> newList = app.getGroupHelper().getGroups();
        // compare states
        oldList.remove(0);
        oldList.add(group);
        Collections.sort(oldList);
        assertEquals(newList, oldList);
    }
}
