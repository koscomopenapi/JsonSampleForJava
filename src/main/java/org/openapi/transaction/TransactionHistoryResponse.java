/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.transaction;

import java.util.Objects;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class TransactionHistoryResponse {
    CommonHeader commonHeader;
    AccInfo accInfo;
    TransactionHistoryResponseBody transactionHistoryResponseBody;
    TransList transList;
    Response resp;

    public TransactionHistoryResponse() {
    }

    public TransactionHistoryResponse(CommonHeader commonHeader, AccInfo accInfo, TransactionHistoryResponseBody body, TransList transList, Response resp) {
        this.commonHeader = commonHeader;
        this.accInfo = accInfo;
        this.transactionHistoryResponseBody = body;
        this.transList = transList;
        this.resp = resp;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    public TransactionHistoryResponseBody getBody() {
        return transactionHistoryResponseBody;
    }

    public void setBody(TransactionHistoryResponseBody body) {
        this.transactionHistoryResponseBody = body;
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
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.commonHeader);
        hash = 41 * hash + Objects.hashCode(this.accInfo);
        hash = 41 * hash + Objects.hashCode(this.transactionHistoryResponseBody);
        hash = 41 * hash + Objects.hashCode(this.transList);
        hash = 41 * hash + Objects.hashCode(this.resp);
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
        final TransactionHistoryResponse other = (TransactionHistoryResponse) obj;
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.accInfo, other.accInfo)) {
            return false;
        }
        if (!Objects.equals(this.transactionHistoryResponseBody, other.transactionHistoryResponseBody)) {
            return false;
        }
        if (!Objects.equals(this.transList, other.transList)) {
            return false;
        }
        if (!Objects.equals(this.resp, other.resp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TransactionHistoryResponse{" + "commonHeader=" + commonHeader + ", accInfo=" + accInfo + ", body=" + transactionHistoryResponseBody + ", transList=" + transList + ", resp=" + resp + '}';
    }
    
    
}
