/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import java.util.Objects;
import org.openapi.common.CommonHeader;

/**
 *
 * @author heungjae
 */
public class VirtualAccountRequest {
    
    CommonHeader commonHeader;
    VirtualAccountList virtualAccountList;

    public VirtualAccountRequest() {
    }

    public VirtualAccountRequest(CommonHeader commonHeader, VirtualAccountList body) {
        this.commonHeader = commonHeader;
        this.virtualAccountList = body;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public VirtualAccountList getBody() {
        return virtualAccountList;
    }

    public void setBody(VirtualAccountList body) {
        this.virtualAccountList = body;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.commonHeader);
        hash = 97 * hash + Objects.hashCode(this.virtualAccountList);
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
        final VirtualAccountRequest other = (VirtualAccountRequest) obj;
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.virtualAccountList, other.virtualAccountList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VirtualAccountRequest{" + "commonHeader=" + commonHeader + ", body=" + virtualAccountList + '}';
    }
    
    
}
