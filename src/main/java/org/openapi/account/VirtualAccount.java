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
public class VirtualAccount {
    
    String trCode;
    String realAccNo;
    String vtAccNo;
    String vtAccAlias;

    public VirtualAccount() {
    }

    public VirtualAccount(String trCode, String realAccNo, String vtAccNo, String vtAccAlias) {
        this.trCode = trCode;
        this.realAccNo = realAccNo;
        this.vtAccNo = vtAccNo;
        this.vtAccAlias = vtAccAlias;
    }

    public String getTrCode() {
        return trCode;
    }

    public void setTrCode(String trCode) {
        this.trCode = trCode;
    }

    public String getRealAccNo() {
        return realAccNo;
    }

    public void setRealAccNo(String realAccNo) {
        this.realAccNo = realAccNo;
    }

    public String getVtAccNo() {
        return vtAccNo;
    }

    public void setVtAccNo(String vtAccNo) {
        this.vtAccNo = vtAccNo;
    }

    public String getVtAccAlias() {
        return vtAccAlias;
    }

    public void setVtAccAlias(String vtAccAlias) {
        this.vtAccAlias = vtAccAlias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.trCode);
        hash = 59 * hash + Objects.hashCode(this.realAccNo);
        hash = 59 * hash + Objects.hashCode(this.vtAccNo);
        hash = 59 * hash + Objects.hashCode(this.vtAccAlias);
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
        final VirtualAccount other = (VirtualAccount) obj;
        if (!Objects.equals(this.trCode, other.trCode)) {
            return false;
        }
        if (!Objects.equals(this.realAccNo, other.realAccNo)) {
            return false;
        }
        if (!Objects.equals(this.vtAccNo, other.vtAccNo)) {
            return false;
        }
        if (!Objects.equals(this.vtAccAlias, other.vtAccAlias)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VirtualAccount{" + "trCode=" + trCode + ", realAccNo=" + realAccNo + ", vtAccNo=" + vtAccNo + ", vtAccAlias=" + vtAccAlias + '}';
    }
    
    
}
