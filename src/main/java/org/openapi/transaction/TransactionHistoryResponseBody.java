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
public class TransactionHistoryResponseBody extends TransactionHistoryRequestBody {
    
    QueryResult queryResult;

    public TransactionHistoryResponseBody() {
    }

    public TransactionHistoryResponseBody(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    public QueryParams getQueryParameter() {
        return queryParams;
    }

    public void setQueryParameter(QueryParams queryParameter) {
        this.queryParams = queryParameter;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.queryResult);
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
        final TransactionHistoryResponseBody other = (TransactionHistoryResponseBody) obj;
        if (!Objects.equals(this.queryResult, other.queryResult)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TransactionHistoryResponseBody{" + "queryResult=" + queryResult + '}';
    }


}
