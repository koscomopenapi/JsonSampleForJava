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
public class Response {
    
    String respCode;
    String respMsg;

    public Response() {
    }

    public Response(String respCode, String respMsg) {
        this.respCode = respCode;
        this.respMsg = respMsg;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.respCode);
        hash = 53 * hash + Objects.hashCode(this.respMsg);
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
        final Response other = (Response) obj;
        if (!Objects.equals(this.respCode, other.respCode)) {
            return false;
        }
        if (!Objects.equals(this.respMsg, other.respMsg)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resp{" + "respCode=" + respCode + ", respMsg=" + respMsg + '}';
    }
    
    
}
