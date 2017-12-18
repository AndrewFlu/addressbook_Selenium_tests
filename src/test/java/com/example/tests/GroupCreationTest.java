package com.example.tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.*;

public class GroupCreationTest extends TestBase {
    @DataProvider
    public Iterator<Object[]> randomValidGroupGenerator(){
        List<Object[]> list = new ArrayList<>();

        // code
        for (int i=0; i<5; i++){
            GroupData group = new GroupData();
            group.groupName = generateRandomString();
            group.header = generateRandomString();
            group.footer = generateRandomString();
            list.add(new Object[]{group});
        }
        return list.iterator();
    }

    public String generateRandomString(){
        Random rnd = new Random();
        if (rnd.nextInt(3) == 0){
            return "";
        } else {
            return "RandomName" + rnd.nextInt();
        }
    }

    @Test(dataProvider = "randomValidGroupGenerator")
    public void testGroupCreationWithValidData(GroupData group) throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().goToGroupsPage();
        // save old state
        List<GroupData> oldList = app.getGroupHelper().getGroups();
        // actions
        app.getGroupHelper().initNewGroupCreation();
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
}
