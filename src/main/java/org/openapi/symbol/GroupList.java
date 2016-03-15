/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import java.util.ArrayList;

/**
 *
 * @author heungjae
 */
public class GroupList {

    ArrayList<Group> group = new ArrayList();

    public GroupList() {
    }

    public void addInterestSymbolGroup(Group interestSymbolGroup) {
        group.add(interestSymbolGroup);
    }

}
