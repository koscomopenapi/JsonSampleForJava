/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class Group {
   
    String groupName;
    String modifyDate;
    ArrayList<String> isinCode = new ArrayList();

    public Group() {
    }

    public Group(String groupName, String modifyDate) {
        this.groupName = groupName;
        this.modifyDate = modifyDate;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public ArrayList<String> getIsinList() {
        return isinCode;
    }

    public void setIsinList(ArrayList<String> isinList) {
        this.isinCode = isinList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.groupName);
        hash = 59 * hash + Objects.hashCode(this.modifyDate);
        hash = 59 * hash + Objects.hashCode(this.isinCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Group other = (Group) obj;
        if (!Objects.equals(this.groupName, other.groupName)) {
            return false;
        }
        if (!Objects.equals(this.modifyDate, other.modifyDate)) {
            return false;
        }
        if (!Objects.equals(this.isinCode, other.isinCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterestSymbolGroup{" + "groupName=" + groupName + ", modifyDate=" + modifyDate + ", isinList=" + isinCode + '}';
    }


    
}
