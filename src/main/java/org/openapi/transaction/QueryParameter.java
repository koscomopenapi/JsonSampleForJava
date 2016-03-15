/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class QueryParameter {
    String fromDate;
    String toDate;
    String isinCode;
    String side;
    int count;
    int page;

    public QueryParameter() {
    }

    public QueryParameter(String fromDate, String toDate, String isinCode, String side, int count, int page) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.isinCode = isinCode;
        this.side = side;
        this.count = count;
        this.page = page;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.fromDate);
        hash = 67 * hash + Objects.hashCode(this.toDate);
        hash = 67 * hash + Objects.hashCode(this.isinCode);
        hash = 67 * hash + Objects.hashCode(this.side);
        hash = 67 * hash + this.count;
        hash = 67 * hash + this.page;
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
        final QueryParameter other = (QueryParameter) obj;
        if (this.count != other.count) {
            return false;
        }
        if (this.page != other.page) {
            return false;
        }
        if (!Objects.equals(this.fromDate, other.fromDate)) {
            return false;
        }
        if (!Objects.equals(this.toDate, other.toDate)) {
            return false;
        }
        if (!Objects.equals(this.isinCode, other.isinCode)) {
            return false;
        }
        if (!Objects.equals(this.side, other.side)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QueryParameter{" + "fromDate=" + fromDate + ", toDate=" + toDate + ", isinCode=" + isinCode + ", side=" + side + ", count=" + count + ", page=" + page + '}';
    }
    
    
}
