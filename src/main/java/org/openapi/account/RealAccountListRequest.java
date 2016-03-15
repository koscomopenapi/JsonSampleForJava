/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import org.openapi.common.CommonHeader;

/**
 *
 * @author heungjae
 */
public class RealAccountListRequest {
    CommonHeader commonHeader;

    public RealAccountListRequest() {
    }

    public RealAccountListRequest(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }
    
}
