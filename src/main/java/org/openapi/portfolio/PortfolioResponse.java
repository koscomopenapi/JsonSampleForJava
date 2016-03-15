/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import java.util.Objects;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class PortfolioResponse {
    CommonHeader commonHeader;
    PortfolioRequestBody portfolioRequestBody;
    PortfolioList portfolioList;
    Response resp;

    public PortfolioResponse() {
    }

    public PortfolioResponse(CommonHeader commonHeader, PortfolioRequestBody portfolioRequestBody, PortfolioList portfolio, Response resp) {
        this.commonHeader = commonHeader;
        this.portfolioRequestBody = portfolioRequestBody;
        this.portfolioList = portfolio;
        this.resp = resp;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public PortfolioRequestBody getBody() {
        return portfolioRequestBody;
    }

    public void setBody(PortfolioRequestBody body) {
        this.portfolioRequestBody = body;
    }

    public PortfolioList getPortfolio() {
        return portfolioList;
    }

    public void setPortfolio(PortfolioList portfolio) {
        this.portfolioList = portfolio;
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
        hash = 29 * hash + Objects.hashCode(this.commonHeader);
        hash = 29 * hash + Objects.hashCode(this.portfolioRequestBody);
        hash = 29 * hash + Objects.hashCode(this.portfolioList);
        hash = 29 * hash + Objects.hashCode(this.resp);
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
        final PortfolioResponse other = (PortfolioResponse) obj;
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.portfolioRequestBody, other.portfolioRequestBody)) {
            return false;
        }
        if (!Objects.equals(this.portfolioList, other.portfolioList)) {
            return false;
        }
        if (!Objects.equals(this.resp, other.resp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PortfolioResponse{" + "commonHeader=" + commonHeader + ", body=" + portfolioRequestBody + ", portfolio=" + portfolioList + ", resp=" + resp + '}';
    }
    
    
}
