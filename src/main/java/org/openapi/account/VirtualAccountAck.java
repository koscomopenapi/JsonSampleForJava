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
public class VirtualAccountAck extends VirtualAccount {

    String status;
    String message;

    public VirtualAccountAck() {
    }

    public VirtualAccountAck(String trCode, String realAccNo, String vtAccNo, String vtAccAlias, String status, String message) {
        this.trCode = trCode;
        this.realAccNo = realAccNo;
        this.vtAccNo = vtAccNo;
        this.vtAccAlias = vtAccAlias;
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.trCode);
        hash = 67 * hash + Objects.hashCode(this.realAccNo);
        hash = 67 * hash + Objects.hashCode(this.vtAccNo);
        hash = 67 * hash + Objects.hashCode(this.vtAccAlias);
        hash = 67 * hash + Objects.hashCode(this.status);
        hash = 67 * hash + Objects.hashCode(this.message);
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
        final VirtualAccountAck other = (VirtualAccountAck) obj;
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
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VirtualAccountResponse{" + "trCode=" + trCode + ", realAccNo=" + realAccNo + ", vtAccNo=" + vtAccNo + ", vtAccAlias=" + vtAccAlias + ", status=" + status + ", message=" + message + '}';
    }


    
}
