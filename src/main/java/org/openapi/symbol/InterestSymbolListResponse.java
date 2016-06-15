/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListResponse {
    CommonHeader commonHeader;
    PlatformFields platformFields;   //option
    InterestSymbolListResponseBody InterestSymbolListResponseBody;

    public InterestSymbolListResponse() {
    }

    public InterestSymbolListResponse(CommonHeader commonHeader, PlatformFields platformFields, InterestSymbolListResponseBody InterestSymbolListResponseBody) {
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
        this.InterestSymbolListResponseBody = InterestSymbolListResponseBody;
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

    public InterestSymbolListResponseBody getInterestSymbolListResponseBody() {
        return InterestSymbolListResponseBody;
    }

    public void setInterestSymbolListResponseBody(InterestSymbolListResponseBody InterestSymbolListResponseBody) {
        this.InterestSymbolListResponseBody = InterestSymbolListResponseBody;
    }

    @Override
    public String toString() {
        return "InterestSymbolListResponse{" + "commonHeader=" + commonHeader + ", platformFields=" + platformFields + ", InterestSymbolListResponseBody=" + InterestSymbolListResponseBody + '}';
    }


    
    
}
