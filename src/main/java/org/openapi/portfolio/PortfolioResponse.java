/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class PortfolioResponse {
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    PortfolioResponseBody portfolioResponseBody;
    PortfolioList portfolioList;
    Response resp;

    public PortfolioResponse() {
    }

    public PortfolioResponse(CommonHeader commonHeader, PlatformFields platformFields, PortfolioResponseBody portfolioResponseBody, PortfolioList portfolioList, Response resp) {
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.portfolioResponseBody = portfolioResponseBody;
        this.portfolioList = portfolioList;
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

    public PortfolioResponseBody getPortfolioResponseBody() {
        return portfolioResponseBody;
    }

    public void setPortfolioResponseBody(PortfolioResponseBody portfolioResponseBody) {
        this.portfolioResponseBody = portfolioResponseBody;
    }

    public PortfolioList getPortfolioList() {
        return portfolioList;
    }

    public void setPortfolioList(PortfolioList portfolioList) {
        this.portfolioList = portfolioList;
    }

    public Response getResp() {
        return resp;
    }

    public void setResp(Response resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "PortfolioResponse{" + "commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", portfolioResponseBody=" + portfolioResponseBody + ", portfolioList=" + portfolioList + ", resp=" + resp + '}';
    }




    
}
