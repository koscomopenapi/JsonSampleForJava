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
public class VirtualAccountResponse {
    CommonHeader commonHeader;
    VirtualAccountResponseList virtualAccountResponseList;
    Response resp;

    public VirtualAccountResponse() {
    }

    public VirtualAccountResponse(CommonHeader commonHeader, VirtualAccountResponseList body, Response resp) {
        this.commonHeader = commonHeader;
        this.virtualAccountResponseList = body;
        this.resp = resp;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public VirtualAccountResponseList getBody() {
        return virtualAccountResponseList;
    }

    public void setBody(VirtualAccountResponseList body) {
        this.virtualAccountResponseList = body;
    }

    public Response getResp() {
        return resp;
    }

    public void setResp(Response resp) {
        this.resp = resp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.commonHeader);
        hash = 71 * hash + Objects.hashCode(this.virtualAccountResponseList);
        hash = 71 * hash + Objects.hashCode(this.resp);
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
        final VirtualAccountResponse other = (VirtualAccountResponse) obj;
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.virtualAccountResponseList, other.virtualAccountResponseList)) {
            return false;
        }
        if (!Objects.equals(this.resp, other.resp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VirtualAccountResponse{" + "commonHeader=" + commonHeader + ", body=" + virtualAccountResponseList + ", resp=" + resp + '}';
    }

    
}
