/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.symbol;

import java.util.Objects;
import org.openapi.common.AccInfo;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListRequestBody {
    AccInfo accInfo;
    
    public InterestSymbolListRequestBody() {
    }

    public InterestSymbolListRequestBody(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    public AccInfo getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(AccInfo accInfo) {
        this.accInfo = accInfo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.accInfo);
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
        final InterestSymbolListRequestBody other = (InterestSymbolListRequestBody) obj;
        if (!Objects.equals(this.accInfo, other.accInfo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterestSymbolListRequestBody{" + "accInfo=" + accInfo + '}';
    }



}
