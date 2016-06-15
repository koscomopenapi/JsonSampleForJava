/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;
import org.openapi.common.PlatformFields;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListRequest {

    Partner partner;
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    DevInfo devInfo;
    private InterestSymbolListRequestBody interestSymbolListRequestBody;

    public InterestSymbolListRequest() {
    }

    public InterestSymbolListRequest(Partner partner, CommonHeader commonHeader, PlatformFields platformFields, DevInfo devInfo, InterestSymbolListRequestBody interestSymbolListRequestBody) {
        this.partner = partner;
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.devInfo = devInfo;
        this.interestSymbolListRequestBody = interestSymbolListRequestBody;
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

    public InterestSymbolListRequestBody getInterestSymbolListRequestBody() {
        return interestSymbolListRequestBody;
    }

    public void setInterestSymbolListRequestBody(InterestSymbolListRequestBody interestSymbolListRequestBody) {
        this.interestSymbolListRequestBody = interestSymbolListRequestBody;
    }

    @Override
    public String toString() {
        return "InterestSymbolListRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", devInfo=" + devInfo + ", interestSymbolListRequestBody=" + interestSymbolListRequestBody + '}';
    }

    



}
