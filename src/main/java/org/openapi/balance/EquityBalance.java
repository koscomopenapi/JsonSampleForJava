/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import org.openapi.portfolio.asset.Equity;

/**
 *
 * @author heungjae
 */
public class EquityBalance extends Equity {
    
    double valAtTrade;
    double valAtCur;
    double proLoss;

    public EquityBalance() {
    }

    
    public EquityBalance(double valAtTrade, double valAtCur, double proLoss) {
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
        this.proLoss = proLoss;
    }

    public EquityBalance(double valAtTrade, double valAtCur, double proLoss, String assetType, String isinCode, double qty, double earningRate) {
        super(assetType, isinCode, qty, earningRate);
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
        this.proLoss = proLoss;
    }

    public double getValAtTrade() {
        return valAtTrade;
    }

    public void setValAtTrade(double valAtTrade) {
        this.valAtTrade = valAtTrade;
    }

    public double getValAtCur() {
        return valAtCur;
    }

    public void setValAtCur(double valAtCur) {
        this.valAtCur = valAtCur;
    }

    public double getProLoss() {
        return proLoss;
    }

    public void setProLoss(double proLoss) {
        this.proLoss = proLoss;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valAtTrade) ^ (Double.doubleToLongBits(this.valAtTrade) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valAtCur) ^ (Double.doubleToLongBits(this.valAtCur) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.proLoss) ^ (Double.doubleToLongBits(this.proLoss) >>> 32));
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
        final EquityBalance other = (EquityBalance) obj;
        if (Double.doubleToLongBits(this.valAtTrade) != Double.doubleToLongBits(other.valAtTrade)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valAtCur) != Double.doubleToLongBits(other.valAtCur)) {
            return false;
        }
        if (Double.doubleToLongBits(this.proLoss) != Double.doubleToLongBits(other.proLoss)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EquityBalance{" + "valAtTrade=" + valAtTrade + ", valAtCur=" + valAtCur + ", proLoss=" + proLoss + '}';
    }
    
    
}
