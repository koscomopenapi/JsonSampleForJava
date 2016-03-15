/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

import java.util.ArrayList;

/**
 *
 * @author heungjae
 */
public class TransList {
    
    ArrayList <Transaction> transaction = new ArrayList();

    public TransList() {
    }

    public void addTransaction(Transaction transaction) {
        this.transaction.add(transaction);
    }
    
}
