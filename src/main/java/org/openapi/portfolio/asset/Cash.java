/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio.asset;

/**
 *
 * @author heungjae
 */
public class Cash {
    Amount amount;

    public Cash() {
    }

    public Cash(Amount amount) {
        this.amount = amount;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cash{" + "amount=" + amount + '}';
    }
    
    
}
