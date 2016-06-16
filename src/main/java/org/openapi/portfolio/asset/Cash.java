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
    Amount cash;

    public Cash() {
    }

    public Cash(Amount amount) {
        this.cash = amount;
    }

    public Amount getAmount() {
        return cash;
    }

    public void setAmount(Amount amount) {
        this.cash = amount;
    }

    @Override
    public String toString() {
        return "Cash{" + "amount=" + cash + '}';
    }
    
    
}
