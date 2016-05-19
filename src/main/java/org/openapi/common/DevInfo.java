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
public class DevInfo {
    String ipAddr;
    String macAddr;

    public DevInfo() {
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.ipAddr);
        hash = 59 * hash + Objects.hashCode(this.macAddr);
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
        final DevInfo other = (DevInfo) obj;
        if (!Objects.equals(this.ipAddr, other.ipAddr)) {
            return false;
        }
        if (!Objects.equals(this.macAddr, other.macAddr)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DevInfo{" + "ipAddr=" + ipAddr + ", macAddr=" + macAddr + '}';
    }


}
