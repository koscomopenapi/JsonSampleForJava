/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import java.util.Objects;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class BalanceResponse {
    
    CommonHeader commonHeader;
    BalanceResponseBody balanceResponseBody;
    BalanceList balanceList;
    Response resp;

    public BalanceResponse() {
    }

    public BalanceResponse(CommonHeader commonHeader, BalanceResponseBody balanceResponseBody, BalanceList balanceList, Response resp) {
        this.commonHeader = commonHeader;
        this.balanceResponseBody = balanceResponseBody;
        this.balanceList = balanceList;
        this.resp = resp;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public BalanceResponseBody getBalanceResponseBody() {
        return balanceResponseBody;
    }

    public void setBalanceResponseBody(BalanceResponseBody balanceResponseBody) {
        this.balanceResponseBody = balanceResponseBody;
    }

    public BalanceList getBalanceList() {
        return balanceList;
    }

    public void setBalanceList(BalanceList balanceList) {
        this.balanceList = balanceList;
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
        hash = 37 * hash + Objects.hashCode(this.commonHeader);
        hash = 37 * hash + Objects.hashCode(this.balanceResponseBody);
        hash = 37 * hash + Objects.hashCode(this.balanceList);
        hash = 37 * hash + Objects.hashCode(this.resp);
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
        final BalanceResponse other = (BalanceResponse) obj;
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.balanceResponseBody, other.balanceResponseBody)) {
            return false;
        }
        if (!Objects.equals(this.balanceList, other.balanceList)) {
            return false;
        }
        if (!Objects.equals(this.resp, other.resp)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "BalanceResponse{" + "commonHeader=" + commonHeader + ", balanceResponseBody=" + balanceResponseBody + ", balanceList=" + balanceList + ", resp=" + resp + '}';
    }

    
    
}
