/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import java.util.ArrayList;

/**
 *
 * @author heungjae
 */
public class VirtualAccountList {
    
    ArrayList <VirtualAccount> virtualAccount = new ArrayList();

    public VirtualAccountList() {
    }
    
    public void addVirtualAccount(VirtualAccount virtualAccount) {
        this.virtualAccount.add(virtualAccount);
    }
}
