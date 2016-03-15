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
public class Equity {
    String assetType;
    String isinCode;
    double qty;
    double earningRate;

    public Equity() {
    }

    public Equity(String assetType, String isinCode, double qty, double earningRate) {
        this.assetType = assetType;
        this.isinCode = isinCode;
        this.qty = qty;
        this.earningRate = earningRate;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
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
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.assetType);
        hash = 29 * hash + Objects.hashCode(this.isinCode);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.qty) ^ (Double.doubleToLongBits(this.qty) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.earningRate) ^ (Double.doubleToLongBits(this.earningRate) >>> 32));
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
        final Equity other = (Equity) obj;
        if (Double.doubleToLongBits(this.qty) != Double.doubleToLongBits(other.qty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.earningRate) != Double.doubleToLongBits(other.earningRate)) {
            return false;
        }
        if (!Objects.equals(this.assetType, other.assetType)) {
            return false;
        }
        if (!Objects.equals(this.isinCode, other.isinCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equity{" + "assetType=" + assetType + ", isinCode=" + isinCode + ", qty=" + qty + ", earningRate=" + earningRate + '}';
    }


}
