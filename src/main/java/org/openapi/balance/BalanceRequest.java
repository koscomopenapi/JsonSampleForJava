/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import java.util.Objects;
import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;
import org.openapi.common.PlatformFields;


/**
 *
 * @author heungjae
 */
public class BalanceRequest {
    Partner partner;
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    DevInfo devInfo;
    PortfolioRequestBody balanceRequestBody;

    public BalanceRequest() {
    }

    public BalanceRequest(Partner partner, CommonHeader commonHeader, PlatformFields platformFields, DevInfo devInfo, PortfolioRequestBody balanceRequestBody) {
        this.partner = partner;
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.devInfo = devInfo;
        this.balanceRequestBody = balanceRequestBody;
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

    public PortfolioRequestBody getBalanceRequestBody() {
        return balanceRequestBody;
    }

    public void setBalanceRequestBody(PortfolioRequestBody balanceRequestBody) {
        this.balanceRequestBody = balanceRequestBody;
    }

    @Override
    public String toString() {
        return "BalanceRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", devInfo=" + devInfo + ", balanceRequestBody=" + balanceRequestBody + '}';
    }


    
        
}
