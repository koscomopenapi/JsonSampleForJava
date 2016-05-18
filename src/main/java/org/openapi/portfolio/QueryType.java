/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class QueryType {
    String assetType;
    String rspType;
    int count;
    String page;

    public QueryType() {
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getRspType() {
        return rspType;
    }

    public void setRspType(String rspType) {
        this.rspType = rspType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.assetType);
        hash = 67 * hash + Objects.hashCode(this.rspType);
        hash = 67 * hash + this.count;
        hash = 67 * hash + Objects.hashCode(this.page);
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
        final QueryType other = (QueryType) obj;
        if (this.count != other.count) {
            return false;
        }
        if (!Objects.equals(this.assetType, other.assetType)) {
            return false;
        }
        if (!Objects.equals(this.rspType, other.rspType)) {
            return false;
        }
        if (!Objects.equals(this.page, other.page)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "QueryType{" + "assetType=" + assetType + ", rspType=" + rspType + ", count=" + count + ", page=" + page + '}';
    }
    

}
