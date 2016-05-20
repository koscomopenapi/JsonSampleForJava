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
import org.openapi.common.reqrep.CommonReq;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListRequest extends CommonReq {
    private InterestSymbolListRequestBody interestSymbolListRequestBody;

    public InterestSymbolListRequest(InterestSymbolListRequestBody interestSymbolListRequestBody) {
        this.interestSymbolListRequestBody = interestSymbolListRequestBody;
    }

    public InterestSymbolListRequest(InterestSymbolListRequestBody interestSymbolListRequestBody, Partner partner, CommonHeader commonHeader, DevInfo devInfo) {
        super(partner, commonHeader, devInfo);
        this.interestSymbolListRequestBody = interestSymbolListRequestBody;
    }

    public InterestSymbolListRequest() {
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
        hash = 97 * hash + Objects.hashCode(this.interestSymbolListRequestBody);
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
        if (!Objects.equals(this.interestSymbolListRequestBody, other.interestSymbolListRequestBody)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterestSymbolListRequest{" + "interestSymbolListRequestBody=" + interestSymbolListRequestBody + '}';
    }
    
    
    
}
