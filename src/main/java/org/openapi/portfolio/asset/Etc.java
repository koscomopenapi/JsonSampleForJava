/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio.asset;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class Etc {
    String assetType;
    String assetName;
    double qty;
    double earningRate;

    public Etc() {
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getEarningRate() {
        return earningRate;
    }

    public void setEarningRate(double earningRate) {
        this.earningRate = earningRate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.assetType);
        hash = 11 * hash + Objects.hashCode(this.assetName);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.qty) ^ (Double.doubleToLongBits(this.qty) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.earningRate) ^ (Double.doubleToLongBits(this.earningRate) >>> 32));
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
        final Etc other = (Etc) obj;
        if (Double.doubleToLongBits(this.qty) != Double.doubleToLongBits(other.qty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.earningRate) != Double.doubleToLongBits(other.earningRate)) {
            return false;
        }
        if (!Objects.equals(this.assetType, other.assetType)) {
            return false;
        }
        if (!Objects.equals(this.assetName, other.assetName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etc{" + "assetType=" + assetType + ", assetName=" + assetName + ", qty=" + qty + ", earningRate=" + earningRate + '}';
    }
    
    
}
