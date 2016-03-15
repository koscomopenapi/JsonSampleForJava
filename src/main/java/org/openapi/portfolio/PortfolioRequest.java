/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import java.util.Objects;
import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;

/**
 *
 * @author heungjae
 */
public class PortfolioRequest {
    
    Partner partner;
    CommonHeader commonHeader;
    DevInfo devInfo;
    PortfolioRequestBody portfolioRequestBody;

    public PortfolioRequest() {
    }

    public PortfolioRequest(Partner partner, CommonHeader commonHeader, DevInfo devInfo, PortfolioRequestBody portfolioRequestBody) {
        this.partner = partner;
        this.commonHeader = commonHeader;
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
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.partner);
        hash = 67 * hash + Objects.hashCode(this.commonHeader);
        hash = 67 * hash + Objects.hashCode(this.devInfo);
        hash = 67 * hash + Objects.hashCode(this.portfolioRequestBody);
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
        final PortfolioRequest other = (PortfolioRequest) obj;
        if (!Objects.equals(this.partner, other.partner)) {
            return false;
        }
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.devInfo, other.devInfo)) {
            return false;
        }
        if (!Objects.equals(this.portfolioRequestBody, other.portfolioRequestBody)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PortfolioRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", devInfo=" + devInfo + ", portfolioRequestBody=" + portfolioRequestBody + '}';
    }
    
    
}
