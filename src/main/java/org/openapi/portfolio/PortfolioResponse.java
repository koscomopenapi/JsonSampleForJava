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
    PortfolioResponseBody portfolioResponseBody;
    PortfolioList portfolioList;
    Response resp;

    public PortfolioResponse() {
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public PortfolioResponseBody getPortfolioRequestBody() {
        return portfolioResponseBody;
    }

    public void setPortfolioRequestBody(PortfolioResponseBody portfolioRequestBody) {
        this.portfolioResponseBody = portfolioRequestBody;
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
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.commonHeader);
        hash = 97 * hash + Objects.hashCode(this.portfolioResponseBody);
        hash = 97 * hash + Objects.hashCode(this.portfolioList);
        hash = 97 * hash + Objects.hashCode(this.resp);
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
        if (!Objects.equals(this.portfolioResponseBody, other.portfolioResponseBody)) {
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
        return "PortfolioResponse{" + "commonHeader=" + commonHeader + ", portfolioResponseBody=" + portfolioResponseBody + ", portfolioList=" + portfolioList + ", resp=" + resp + '}';
    }


    
}
