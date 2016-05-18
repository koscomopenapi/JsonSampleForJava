/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import java.util.Objects;
import org.openapi.transaction.QueryResult;

/**
 *
 * @author heungjae
 */
public class PortfolioResponseBody extends PortfolioRequestBody {
    QueryResult queryResult;

    public PortfolioResponseBody() {
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
        final PortfolioResponseBody other = (PortfolioResponseBody) obj;
        if (!Objects.equals(this.queryResult, other.queryResult)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "portfolioResponseBody{" + "queryResult=" + queryResult + '}';
    }
    
}
