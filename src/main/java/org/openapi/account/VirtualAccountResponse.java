/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class VirtualAccountResponse {
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    VirtualAccountResponseList virtualAccountResponseList;
    Response resp;

    public VirtualAccountResponse() {
    }

    public VirtualAccountResponse(CommonHeader commonHeader, PlatformFields platformFields, VirtualAccountResponseList virtualAccountResponseList, Response resp) {
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.virtualAccountResponseList = virtualAccountResponseList;
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

    public VirtualAccountResponseList getVirtualAccountResponseList() {
        return virtualAccountResponseList;
    }

    public void setVirtualAccountResponseList(VirtualAccountResponseList virtualAccountResponseList) {
        this.virtualAccountResponseList = virtualAccountResponseList;
    }

    public Response getResp() {
        return resp;
    }

    public void setResp(Response resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "VirtualAccountResponse{" + "commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", virtualAccountResponseList=" + virtualAccountResponseList + ", resp=" + resp + '}';
    }



    
}
