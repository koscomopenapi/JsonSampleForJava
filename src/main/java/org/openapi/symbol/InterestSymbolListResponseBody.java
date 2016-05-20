/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import java.util.Objects;
import org.openapi.common.AccInfo;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListResponseBody {
    AccInfo accInfo;      
    GroupList groupList;
    Response resp;

    public InterestSymbolListResponseBody() {
    }

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    public GroupList getGroupList() {
        return groupList;
    }

    public void setGroupList(GroupList groupList) {
        this.groupList = groupList;
    }

    public Response getResp() {
        return resp;
    }

    public void setResp(Response resp) {
        this.resp = resp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.accInfo);
        hash = 43 * hash + Objects.hashCode(this.groupList);
        hash = 43 * hash + Objects.hashCode(this.resp);
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
        final InterestSymbolListResponseBody other = (InterestSymbolListResponseBody) obj;
        if (!Objects.equals(this.accInfo, other.accInfo)) {
            return false;
        }
        if (!Objects.equals(this.groupList, other.groupList)) {
            return false;
        }
        if (!Objects.equals(this.resp, other.resp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterestSymbolListResponseBody{" + "accInfo=" + accInfo + ", groupList=" + groupList + ", resp=" + resp + '}';
    }
    



}
