/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

import java.util.Objects;
import org.openapi.common.AccInfo;

/**
 *
 * @author heungjae
 */
public class TransactionHistoryRequestBody {

    AccInfo accInfo;
    QueryParameter queryParameter;

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    public QueryParameter getQueryParameter() {
        return queryParameter;
    }

    public void setQueryParameter(QueryParameter queryParameter) {
        this.queryParameter = queryParameter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.accInfo);
        hash = 17 * hash + Objects.hashCode(this.queryParameter);
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
        final TransactionHistoryRequestBody other = (TransactionHistoryRequestBody) obj;
        if (!Objects.equals(this.accInfo, other.accInfo)) {
            return false;
        }
        if (!Objects.equals(this.queryParameter, other.queryParameter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TransactionHistoryRequestBody{" + "accInfo=" + accInfo + ", queryParameter=" + queryParameter + '}';
    }



}
