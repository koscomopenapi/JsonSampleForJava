/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import java.util.Objects;
import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListRequest {

    Partner partner;
    CommonHeader commonHeader;
    DevInfo devInfo;
    private InterestSymbolListRequestBody interestSymbolListRequestBody;

    public InterestSymbolListRequest() {
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

    public InterestSymbolListRequestBody getInterestSymbolListRequestBody() {
        return interestSymbolListRequestBody;
    }

    public void setInterestSymbolListRequestBody(InterestSymbolListRequestBody interestSymbolListRequestBody) {
        this.interestSymbolListRequestBody = interestSymbolListRequestBody;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.partner);
        hash = 29 * hash + Objects.hashCode(this.commonHeader);
        hash = 29 * hash + Objects.hashCode(this.devInfo);
        hash = 29 * hash + Objects.hashCode(this.interestSymbolListRequestBody);
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
        final InterestSymbolListRequest other = (InterestSymbolListRequest) obj;
        if (!Objects.equals(this.partner, other.partner)) {
            return false;
        }
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.devInfo, other.devInfo)) {
            return false;
        }
        if (!Objects.equals(this.interestSymbolListRequestBody, other.interestSymbolListRequestBody)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterestSymbolListRequest{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", devInfo=" + devInfo + ", interestSymbolListRequestBody=" + interestSymbolListRequestBody + '}';
    }



}
