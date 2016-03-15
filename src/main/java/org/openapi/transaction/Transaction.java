/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class Transaction {
    String isinCode;
    String transDate;
    String transType;
    int changeAmt;
    int changeQty;
    int qty;

    public Transaction() {
    }

    public Transaction(String isinCode, String transDate, String transType, int changeAmt, int changeQty, int qty) {
        this.isinCode = isinCode;
        this.transDate = transDate;
        this.transType = transType;
        this.changeAmt = changeAmt;
        this.changeQty = changeQty;
        this.qty = qty;
    }

    public String getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public int getChangeAmt() {
        return changeAmt;
    }

    public void setChangeAmt(int changeAmt) {
        this.changeAmt = changeAmt;
    }

    public int getChangeQty() {
        return changeQty;
    }

    public void setChangeQty(int changeQty) {
        this.changeQty = changeQty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.isinCode);
        hash = 53 * hash + Objects.hashCode(this.transDate);
        hash = 53 * hash + Objects.hashCode(this.transType);
        hash = 53 * hash + this.changeAmt;
        hash = 53 * hash + this.changeQty;
        hash = 53 * hash + this.qty;
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
        final Transaction other = (Transaction) obj;
        if (this.changeAmt != other.changeAmt) {
            return false;
        }
        if (this.changeQty != other.changeQty) {
            return false;
        }
        if (this.qty != other.qty) {
            return false;
        }
        if (!Objects.equals(this.isinCode, other.isinCode)) {
            return false;
        }
        if (!Objects.equals(this.transDate, other.transDate)) {
            return false;
        }
        if (!Objects.equals(this.transType, other.transType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transaction{" + "isinCode=" + isinCode + ", transDate=" + transDate + ", transType=" + transType + ", changeAmt=" + changeAmt + ", changeQty=" + changeQty + ", qty=" + qty + '}';
    }
    
    
}
