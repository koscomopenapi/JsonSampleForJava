/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio.asset;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class Amount {
    Double amt;

    public Amount() {
    }

    public Amount(Double amt) {
        this.amt = amt;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.amt);
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
        final Amount other = (Amount) obj;
        if (!Objects.equals(this.amt, other.amt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cash{" + "amt=" + amt + '}';
    }
    
}
