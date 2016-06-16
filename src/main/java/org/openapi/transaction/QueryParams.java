/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

/**
 *
 * @author heungjae
 */
public class QueryParams {
    String fromDate;
    String toDate;
    String isinCode;
    String side;
    int count;
    String page;

    public QueryParams() {
    }

    public QueryParams(String fromDate, String toDate, String isinCode, String side, int count, String page) {
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

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "QueryParameter{" + "fromDate=" + fromDate + ", toDate=" + toDate + ", isinCode=" + isinCode + ", side=" + side + ", count=" + count + ", page=" + page + '}';
    }

    
}
