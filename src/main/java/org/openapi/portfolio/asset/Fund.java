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
public class Fund {
    
    String fundCode;
    String fundName;
    double qty;
    double earningRate;
    String maturity;

    public Fund() {
    }

    public Fund(String fundCode, String fundName, double qty, double earningRate, String maturity) {
        this.fundCode = fundCode;
        this.fundName = fundName;
        this.qty = qty;
        this.earningRate = earningRate;
        this.maturity = maturity;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
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

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.fundCode);
        hash = 89 * hash + Objects.hashCode(this.fundName);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.qty) ^ (Double.doubleToLongBits(this.qty) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.earningRate) ^ (Double.doubleToLongBits(this.earningRate) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.maturity);
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
        final Fund other = (Fund) obj;
        if (Double.doubleToLongBits(this.qty) != Double.doubleToLongBits(other.qty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.earningRate) != Double.doubleToLongBits(other.earningRate)) {
            return false;
        }
        if (!Objects.equals(this.fundCode, other.fundCode)) {
            return false;
        }
        if (!Objects.equals(this.fundName, other.fundName)) {
            return false;
        }
        if (!Objects.equals(this.maturity, other.maturity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fund{" + "fundCode=" + fundCode + ", fundName=" + fundName + ", qty=" + qty + ", earningRate=" + earningRate + ", maturity=" + maturity + '}';
    }
    
    
}
