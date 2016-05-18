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
public class QueryResult {
    int totalCnt;
    int count;
    String page;

    public QueryResult() {
    }

    public QueryResult(int totalCnt, int count, String page) {
        this.totalCnt = totalCnt;
        this.count = count;
        this.page = page;
    }

    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
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
        hash = 29 * hash + this.totalCnt;
        hash = 29 * hash + this.count;
        hash = 29 * hash + Objects.hashCode(this.page);
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
        final QueryResult other = (QueryResult) obj;
        if (this.totalCnt != other.totalCnt) {
            return false;
        }
        if (this.count != other.count) {
            return false;
        }
        if (!Objects.equals(this.page, other.page)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QueryResult{" + "totalCnt=" + totalCnt + ", count=" + count + ", page=" + page + '}';
    }


}
