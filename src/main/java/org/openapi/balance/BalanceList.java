/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class BalanceList {
    
    ArrayList <Object> balance = new ArrayList();

    public BalanceList() {
    }

    public ArrayList<Object> getBalance() {
        return balance;
    }

    public void setBalance(ArrayList<Object> balance) {
        this.balance = balance;
    }
    
     public void addBalance(Object objet) {
        balance.add(objet);
    } 

    public Object getBalance(int idx) {
        return balance.get(idx);
    } 
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.balance);
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
        final BalanceList other = (BalanceList) obj;
        if (!Objects.equals(this.balance, other.balance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BalanceList{" + "balance=" + balance + '}';
    }
    
 
}
