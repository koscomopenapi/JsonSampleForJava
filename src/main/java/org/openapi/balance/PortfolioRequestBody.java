/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import org.openapi.portfolio.*;
import java.util.Objects;
import org.openapi.common.AccInfo;

/**
 *
 * @author heungjae
 */
public class PortfolioRequestBody {
    AccInfo accInfo;
    QueryType queryType;
    
    public PortfolioRequestBody() {
    }

    public PortfolioRequestBody(AccInfo accInfo, QueryType queryType) {
        this.accInfo = accInfo;
        this.queryType = queryType;
    }

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.accInfo);
        hash = 83 * hash + Objects.hashCode(this.queryType);
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
        final PortfolioRequestBody other = (PortfolioRequestBody) obj;
        if (!Objects.equals(this.accInfo, other.accInfo)) {
            return false;
        }
        if (!Objects.equals(this.queryType, other.queryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BalanceRequestBody{" + "accInfo=" + accInfo + ", queryType=" + queryType + '}';
    }



}
