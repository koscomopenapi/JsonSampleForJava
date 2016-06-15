/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;
import org.openapi.common.PlatformFields;

/**
 *
 * @author heungjae
 */
public class TransactionHistoryRequest {
    
    Partner partner;
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    DevInfo devInfo;

    TransactionHistoryRequestBody transactionHistoryRequestBody;

    public TransactionHistoryRequest() {
    }

    public TransactionHistoryRequest(Partner partner, CommonHeader commonHeader, PlatformFields platformFields, DevInfo devInfo, TransactionHistoryRequestBody transactionHistoryRequestBody) {
        this.partner = partner;
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.devInfo = devInfo;
        this.transactionHistoryRequestBody = transactionHistoryRequestBody;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
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

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo devInfo) {
        this.devInfo = devInfo;
    }

    public TransactionHistoryRequestBody getTransactionHistoryRequestBody() {
        return transactionHistoryRequestBody;
    }

    public void setTransactionHistoryRequestBody(TransactionHistoryRequestBody transactionHistoryRequestBody) {
        this.transactionHistoryRequestBody = transactionHistoryRequestBody;
    }

    @Override
    public String toString() {
        return "TransactionHistoryRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", devInfo=" + devInfo + ", transactionHistoryRequestBody=" + transactionHistoryRequestBody + '}';
    }

    


    
    
}
