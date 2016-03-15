/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListResponse {
    CommonHeader commonHeader;
    AccInfo accInfo;
    GroupList groupList;
    Response resp;

    public InterestSymbolListResponse(CommonHeader commonHeader, AccInfo accInfo, GroupList interestSymbolGroupList, Response resp) {
        this.commonHeader = commonHeader;
        this.accInfo = accInfo;
        this.groupList = interestSymbolGroupList;
        this.resp = resp;
    }

    public InterestSymbolListResponse() {
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    public GroupList getInterestSymbolGroupList() {
        return groupList;
    }

    public void setInterestSymbolGroupList(GroupList interestSymbolGroupList) {
        this.groupList = interestSymbolGroupList;
    }

    public Response getResp() {
        return resp;
    }

    public void setResp(Response resp) {
        this.resp = resp;
    }
    
}
