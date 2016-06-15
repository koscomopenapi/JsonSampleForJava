/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;

/**
 *
 * @author heungjae
 */
public class RealAccountListRequest {
    CommonHeader commonHeader;
    PlatformFields platformFields;

    public RealAccountListRequest() {
    }

    public RealAccountListRequest(CommonHeader commonHeader, PlatformFields platformFields) {
        this.commonHeader = commonHeader;
        this.platformFields = platformFields;
    }
    
}
