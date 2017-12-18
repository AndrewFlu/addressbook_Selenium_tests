package com.example.tests;

public class GroupData implements Comparable<GroupData>{
    public  String groupName;
    public  String header;
    public  String footer;

    public GroupData(String groupName, String header, String footer) {
        this.groupName = groupName;
        this.header = header;
        this.footer = footer;
    }

    public GroupData() {
    }

    public String getGroupName() {
        return groupName;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public String toString() {
        return "GroupData{" + "groupName='" + groupName + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupData)) return false;

        GroupData groupData = (GroupData) o;

        return getGroupName().equals(groupData.getGroupName());
    }


    public int compareTo(GroupData other) {
        return other.groupName.compareTo(this.groupName);
    }
}
