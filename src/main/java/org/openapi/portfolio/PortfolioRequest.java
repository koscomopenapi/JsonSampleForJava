/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;
import org.openapi.common.PlatformFields;

/**
 *
 * @author heungjae
 */
public class PortfolioRequest {
    
    Partner partner;
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    DevInfo devInfo;
    PortfolioRequestBody portfolioRequestBody;

    public PortfolioRequest() {
    }

    public PortfolioRequest(Partner partner, CommonHeader commonHeader, PlatformFields platformFields, DevInfo devInfo, PortfolioRequestBody portfolioRequestBody) {
        this.partner = partner;
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.devInfo = devInfo;
        this.portfolioRequestBody = portfolioRequestBody;
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

    public PortfolioRequestBody getPortfolioRequestBody() {
        return portfolioRequestBody;
    }

    public void setPortfolioRequestBody(PortfolioRequestBody portfolioRequestBody) {
        this.portfolioRequestBody = portfolioRequestBody;
    }

    @Override
    public String toString() {
        return "PortfolioRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", devInfo=" + devInfo + ", portfolioRequestBody=" + portfolioRequestBody + '}';
    }


    
    
}
