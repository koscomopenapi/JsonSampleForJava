/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class TransactionHistoryResponse {

    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    TransactionHistoryResponseBody transactionHistoryResponseBody;
    TransList transList;
    Response resp;

    public TransactionHistoryResponse() {
    }

    public TransactionHistoryResponse(CommonHeader commonHeader, PlatformFields platformFields, TransactionHistoryResponseBody transactionHistoryResponseBody, TransList transList, Response resp) {
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.transactionHistoryResponseBody = transactionHistoryResponseBody;
        this.transList = transList;
        this.resp = resp;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public PlatformFields getPlatformFields() {
        return platformFields;
    }

    public void setPlatformFields(PlatformFields platformFields) {
        this.platformFields = platformFields;
    }

    public TransactionHistoryResponseBody getTransactionHistoryResponseBody() {
        return transactionHistoryResponseBody;
    }

    public void setTransactionHistoryResponseBody(TransactionHistoryResponseBody transactionHistoryResponseBody) {
        this.transactionHistoryResponseBody = transactionHistoryResponseBody;
    }

    public TransList getTransList() {
        return transList;
    }

    public void setTransList(TransList transList) {
        this.transList = transList;
    }

    public Response getResp() {
        return resp;
    }

    public void setResp(Response resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "TransactionHistoryResponse{" + "commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", transactionHistoryResponseBody=" + transactionHistoryResponseBody + ", transList=" + transList + ", resp=" + resp + '}';
    }

}
