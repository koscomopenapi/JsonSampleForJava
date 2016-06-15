/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;

/**
 *
 * @author heungjae
 */
public class VirtualAccountRequest {
    
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    VirtualAccountList virtualAccountList;

    public VirtualAccountRequest() {
    }

    public VirtualAccountRequest(CommonHeader commonHeader, PlatformFields platformFields, VirtualAccountList virtualAccountList) {
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.virtualAccountList = virtualAccountList;
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

    public VirtualAccountList getVirtualAccountList() {
        return virtualAccountList;
    }

    public void setVirtualAccountList(VirtualAccountList virtualAccountList) {
        this.virtualAccountList = virtualAccountList;
    }

    @Override
    public String toString() {
        return "VirtualAccountRequest{" + "commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", virtualAccountList=" + virtualAccountList + '}';
    }

 
    
    
}
