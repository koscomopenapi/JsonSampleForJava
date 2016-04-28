/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import java.util.Objects;
import org.openapi.portfolio.asset.Fund;

/**
 *
 * @author heungjae
 */
public class FundBalance extends Fund {
    double valAtTrade;
    double valAtCur;
    double proLoss;
    String firstDateBuy;
    String lastDateBuy;

    public FundBalance() {
    }

    public FundBalance(double valAtTrade, double valAtCur, double proLoss, String firstDateBuy, String lastDateBuy) {
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
        this.proLoss = proLoss;
        this.firstDateBuy = firstDateBuy;
        this.lastDateBuy = lastDateBuy;
    }

    public FundBalance(double valAtTrade, double valAtCur, double proLoss, String firstDateBuy, String lastDateBuy, String fundCode, String fundName, double qty, double earningRate, String maturity) {
        super(fundCode, fundName, qty, earningRate, maturity);
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
        this.proLoss = proLoss;
        this.firstDateBuy = firstDateBuy;
        this.lastDateBuy = lastDateBuy;
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

    public String getFirstDateBuy() {
        return firstDateBuy;
    }

    public void setFirstDateBuy(String firstDateBuy) {
        this.firstDateBuy = firstDateBuy;
    }

    public String getLastDateBuy() {
        return lastDateBuy;
    }

    public void setLastDateBuy(String lastDateBuy) {
        this.lastDateBuy = lastDateBuy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valAtTrade) ^ (Double.doubleToLongBits(this.valAtTrade) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valAtCur) ^ (Double.doubleToLongBits(this.valAtCur) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.proLoss) ^ (Double.doubleToLongBits(this.proLoss) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.firstDateBuy);
        hash = 89 * hash + Objects.hashCode(this.lastDateBuy);
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
        final FundBalance other = (FundBalance) obj;
        if (Double.doubleToLongBits(this.valAtTrade) != Double.doubleToLongBits(other.valAtTrade)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valAtCur) != Double.doubleToLongBits(other.valAtCur)) {
            return false;
        }
        if (Double.doubleToLongBits(this.proLoss) != Double.doubleToLongBits(other.proLoss)) {
            return false;
        }
        if (!Objects.equals(this.firstDateBuy, other.firstDateBuy)) {
            return false;
        }
        if (!Objects.equals(this.lastDateBuy, other.lastDateBuy)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FundBalance{" + "valAtTrade=" + valAtTrade + ", valatCur=" + valAtCur + ", proLoss=" + proLoss + ", firstDateBuy=" + firstDateBuy + ", lastDateBuy=" + lastDateBuy + '}';
    }
    
    
}
