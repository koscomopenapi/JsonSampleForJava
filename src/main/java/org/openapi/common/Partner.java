/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.common;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class Partner {
    String comId;
    String srvId;

    public Partner() {
    }

    public Partner(String comId, String srvId) {
        this.comId = comId;
        this.srvId = srvId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getSrvId() {
        return srvId;
    }

    public void setSrvId(String srvId) {
        this.srvId = srvId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.comId);
        hash = 71 * hash + Objects.hashCode(this.srvId);
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
        final Partner other = (Partner) obj;
        if (!Objects.equals(this.comId, other.comId)) {
            return false;
        }
        if (!Objects.equals(this.srvId, other.srvId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Partner{" + "comId=" + comId + ", srvId=" + srvId + '}';
    }
    
    
}
