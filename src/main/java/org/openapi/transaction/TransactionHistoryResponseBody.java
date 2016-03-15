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
public class TransactionHistoryResponseBody extends TransactionHistoryRequestBody {
    QueryResult queryResult;

    public TransactionHistoryResponseBody() {
    }

    
    public TransactionHistoryResponseBody(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    public TransactionHistoryResponseBody(QueryResult queryResult, QueryParameter queryParameter) {
        super(queryParameter);
        this.queryResult = queryResult;
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    public QueryParameter getQueryParameter() {
        return queryParameter;
    }

    public void setQueryParameter(QueryParameter queryParameter) {
        this.queryParameter = queryParameter;
    }

    @Override
    public String toString() {
        return "TransactionHistoryResponseBody{" + "queryResult=" + queryResult + '}';
    }
    
    
}
