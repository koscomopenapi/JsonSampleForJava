/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import java.util.Objects;
import org.openapi.common.CommonHeader;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListResponse {
    CommonHeader commonHeader;
    InterestSymbolListResponseBody InterestSymbolListResponseBody;

    public InterestSymbolListResponse() {
    }

    public InterestSymbolListResponse(CommonHeader commonHeader, InterestSymbolListResponseBody InterestSymbolListResponseBody) {
        this.commonHeader = commonHeader;
        this.InterestSymbolListResponseBody = InterestSymbolListResponseBody;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public InterestSymbolListResponseBody getInterestSymbolListResponseBody() {
        return InterestSymbolListResponseBody;
    }

    public void setInterestSymbolListResponseBody(InterestSymbolListResponseBody InterestSymbolListResponseBody) {
        this.InterestSymbolListResponseBody = InterestSymbolListResponseBody;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.commonHeader);
        hash = 73 * hash + Objects.hashCode(this.InterestSymbolListResponseBody);
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
        final InterestSymbolListResponse other = (InterestSymbolListResponse) obj;
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.InterestSymbolListResponseBody, other.InterestSymbolListResponseBody)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterestSymbolListResponse{" + "commonHeader=" + commonHeader + ", InterestSymbolListResponseBody=" + InterestSymbolListResponseBody + '}';
    }
    
    
}
