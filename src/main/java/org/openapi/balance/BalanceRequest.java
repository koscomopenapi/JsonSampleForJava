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
import org.openapi.portfolio.PortfolioRequestBody;

/**
 *
 * @author heungjae
 */
public class BalanceRequest {
    Partner partner;
    CommonHeader commonHeader;
    DevInfo DevInfo;
    PortfolioRequestBody portfolioRequestBody;

    public BalanceRequest() {
    }

    public BalanceRequest(Partner partner, CommonHeader commonHeader, DevInfo DevInfo, PortfolioRequestBody portfolioRequestBody) {
        this.partner = partner;
        this.commonHeader = commonHeader;
        this.DevInfo = DevInfo;
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
        return DevInfo;
    }

    public void setDevInfo(DevInfo DevInfo) {
        this.DevInfo = DevInfo;
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
        hash = 19 * hash + Objects.hashCode(this.partner);
        hash = 19 * hash + Objects.hashCode(this.commonHeader);
        hash = 19 * hash + Objects.hashCode(this.DevInfo);
        hash = 19 * hash + Objects.hashCode(this.portfolioRequestBody);
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
        final BalanceRequest other = (BalanceRequest) obj;
        if (!Objects.equals(this.partner, other.partner)) {
            return false;
        }
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.DevInfo, other.DevInfo)) {
            return false;
        }
        if (!Objects.equals(this.portfolioRequestBody, other.portfolioRequestBody)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BalanceRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", DevInfo=" + DevInfo + ", portfolioRequestBody=" + portfolioRequestBody + '}';
    }
    
    
        
}
