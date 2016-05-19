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


/**
 *
 * @author heungjae
 */
public class BalanceRequest {
    Partner partner;
    CommonHeader commonHeader;
    DevInfo devInfo;
    PortfolioRequestBody balanceRequestBody;

    public BalanceRequest() {
    }

    public BalanceRequest(Partner partner, CommonHeader commonHeader, DevInfo DevInfo, PortfolioRequestBody balanceRequestBody) {
        this.partner = partner;
        this.commonHeader = commonHeader;
        this.devInfo = DevInfo;
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

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo DevInfo) {
        this.devInfo = DevInfo;
    }

    public PortfolioRequestBody getPortfolioRequestBody() {
        return balanceRequestBody;
    }

    public void setPortfolioRequestBody(PortfolioRequestBody portfolioRequestBody) {
        this.balanceRequestBody = portfolioRequestBody;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.partner);
        hash = 19 * hash + Objects.hashCode(this.commonHeader);
        hash = 19 * hash + Objects.hashCode(this.devInfo);
        hash = 19 * hash + Objects.hashCode(this.balanceRequestBody);
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
        if (!Objects.equals(this.devInfo, other.devInfo)) {
            return false;
        }
        return Objects.equals(this.balanceRequestBody, other.balanceRequestBody);
    }

    @Override
    public String toString() {
        return "BalanceRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", DevInfo=" + devInfo + ", balanceRequestBody=" + balanceRequestBody + '}';
    }
    
    
        
}
