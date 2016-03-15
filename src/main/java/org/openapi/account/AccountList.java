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
public class AccountList {
    
    ArrayList<Account> account = new ArrayList();

    public AccountList() {
    }
    
    public void addAccount(Account account) {
        this.account.add(account);
    }
    
}
