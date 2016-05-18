/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import java.util.Objects;
import org.openapi.transaction.QueryResult;

/**
 *
 * @author heungjae
 */
public class BalanceResponseBody extends PortfolioRequestBody {
    QueryResult queryResult;

    public BalanceResponseBody() {
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.queryResult);
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
        final BalanceResponseBody other = (BalanceResponseBody) obj;
        if (!Objects.equals(this.queryResult, other.queryResult)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BalanceResponseBody{" + "queryResult=" + queryResult + '}';
    }
    
    
}
