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
    

    public QueryType() {
    }

    public QueryType(String assetType, String rspType) {
        this.assetType = assetType;
        this.rspType = rspType;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.assetType);
        hash = 97 * hash + Objects.hashCode(this.rspType);
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
        if (!Objects.equals(this.assetType, other.assetType)) {
            return false;
        }
        if (!Objects.equals(this.rspType, other.rspType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QueryType{" + "assetType=" + assetType + ", rspType=" + rspType + '}';
    }


    
    
}
