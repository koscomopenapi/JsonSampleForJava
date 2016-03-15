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
public class CommonHeader {
    
    String reqIdPlatform;
    String reqIdConsumer;
    String certDn;
    String ci;

    public CommonHeader() {
    }

    public CommonHeader(String reqIdPlatform, String reqIdConsumer, String certDn, String ci) {
        this.reqIdPlatform = reqIdPlatform;
        this.reqIdConsumer = reqIdConsumer;
        this.certDn = certDn;
        this.ci = ci;
    }

    public String getReqIdPlatform() {
        return reqIdPlatform;
    }

    public void setReqIdPlatform(String reqIdPlatform) {
        this.reqIdPlatform = reqIdPlatform;
    }

    public String getReqIdConsumer() {
        return reqIdConsumer;
    }

    public void setReqIdConsumer(String reqIdConsumer) {
        this.reqIdConsumer = reqIdConsumer;
    }

    public String getCertDn() {
        return certDn;
    }

    public void setCertDn(String certDn) {
        this.certDn = certDn;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.reqIdPlatform);
        hash = 59 * hash + Objects.hashCode(this.reqIdConsumer);
        hash = 59 * hash + Objects.hashCode(this.certDn);
        hash = 59 * hash + Objects.hashCode(this.ci);
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
        final CommonHeader other = (CommonHeader) obj;
        if (!Objects.equals(this.reqIdPlatform, other.reqIdPlatform)) {
            return false;
        }
        if (!Objects.equals(this.reqIdConsumer, other.reqIdConsumer)) {
            return false;
        }
        if (!Objects.equals(this.certDn, other.certDn)) {
            return false;
        }
        if (!Objects.equals(this.ci, other.ci)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CommonHeader{" + "reqIdPlatform=" + reqIdPlatform + ", reqIdConsumer=" + reqIdConsumer + ", certDn=" + certDn + ", ci=" + ci + '}';
    }
    
    
}
