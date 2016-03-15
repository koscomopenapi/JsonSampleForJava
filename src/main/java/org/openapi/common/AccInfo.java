/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.common;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class AccInfo {
    
    String realAccNo;
    String vtAccNo;

    public AccInfo() {
    }

    public AccInfo(String realAccNo, String vtAccNp) {
        this.realAccNo = realAccNo;
        this.vtAccNo = vtAccNp;
    }

    public String getRealAccNo() {
        return realAccNo;
    }

    public void setRealAccNo(String realAccNo) {
        this.realAccNo = realAccNo;
    }

    public String getVtAccNp() {
        return vtAccNo;
    }

    public void setVtAccNp(String vtAccNp) {
        this.vtAccNo = vtAccNp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.realAccNo);
        hash = 31 * hash + Objects.hashCode(this.vtAccNo);
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
        final AccInfo other = (AccInfo) obj;
        if (!Objects.equals(this.realAccNo, other.realAccNo)) {
            return false;
        }
        if (!Objects.equals(this.vtAccNo, other.vtAccNo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccInfo{" + "realAccNo=" + realAccNo + ", vtAccNp=" + vtAccNo + '}';
    }
    
    
}
