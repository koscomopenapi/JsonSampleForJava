/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import java.util.Objects;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class RealAccountListResponse {
    CommonHeader commonHeader;
    AccountList accountList;
    Response resp;

    public RealAccountListResponse() {
    }

    public RealAccountListResponse(CommonHeader commonHeader, AccountList accList, Response resp) {
        this.commonHeader = commonHeader;
        this.accountList = accList;
        this.resp = resp;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public AccountList getAccList() {
        return accountList;
    }

    public void setAccList(AccountList accList) {
        this.accountList = accList;
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
        hash = 37 * hash + Objects.hashCode(this.accountList);
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
        final RealAccountListResponse other = (RealAccountListResponse) obj;
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.accountList, other.accountList)) {
            return false;
        }
        if (!Objects.equals(this.resp, other.resp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RealAccountListResponse{" + "commonHeader=" + commonHeader + ", accList=" + accountList + ", resp=" + resp + '}';
    }


    
}
