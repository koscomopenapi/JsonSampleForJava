/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.common.reqrep;

import java.util.Objects;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;

/**
 *
 * @author heungjae
 */
public class RequestByAccNo {

    Partner partner;
    CommonHeader commonHeader;
    DevInfo devInfo;
    AccInfo accInfo;

    public RequestByAccNo() {
    }

    public RequestByAccNo(Partner partner, CommonHeader commonHeader, DevInfo devInfo, AccInfo accInfo) {
        this.partner = partner;
        this.commonHeader = commonHeader;
        this.devInfo = devInfo;
        this.accInfo = accInfo;
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

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.partner);
        hash = 79 * hash + Objects.hashCode(this.commonHeader);
        hash = 79 * hash + Objects.hashCode(this.devInfo);
        hash = 79 * hash + Objects.hashCode(this.accInfo);
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
        final RequestByAccNo other = (RequestByAccNo) obj;
        if (!Objects.equals(this.partner, other.partner)) {
            return false;
        }
        if (!Objects.equals(this.commonHeader, other.commonHeader)) {
            return false;
        }
        if (!Objects.equals(this.devInfo, other.devInfo)) {
            return false;
        }
        if (!Objects.equals(this.accInfo, other.accInfo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RequestByAccNo{" + "partner=" + partner + ", commonHeader=" + commonHeader + ", devInfo=" + devInfo + ", accInfo=" + accInfo + '}';
    }

}
