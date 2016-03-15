/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class Account {
    String accNo;
    String accType;

    public Account() {
    }

    public Account(String accNo, String accType) {
        this.accNo = accNo;
        this.accType = accType;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.accNo);
        hash = 61 * hash + Objects.hashCode(this.accType);
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
        final Account other = (Account) obj;
        if (!Objects.equals(this.accNo, other.accNo)) {
            return false;
        }
        if (!Objects.equals(this.accType, other.accType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account{" + "accNo=" + accNo + ", accType=" + accType + '}';
    }
    
    
}
