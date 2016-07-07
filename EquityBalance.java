/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import java.util.Objects;
import org.openapi.portfolio.asset.Equity;

/**
 *
 * @author heungjae
 */
public class EquityBalance extends Equity {
    
    double valAtTrade;
    double valAtCur;
    double proLoss;
    String tradeType;

    public EquityBalance() {
    }

    public EquityBalance(double valAtTrade, double valAtCur, double proLoss, String tradeType) {
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
        this.proLoss = proLoss;
        this.tradeType = tradeType;
    }

    public EquityBalance(double valAtTrade, double valAtCur, double proLoss, String tradeType, String assetType, String isinCode, double qty, double earningRate) {
        super(assetType, isinCode, qty, earningRate);
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
        this.proLoss = proLoss;
        this.tradeType = tradeType;
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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valAtTrade) ^ (Double.doubleToLongBits(this.valAtTrade) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valAtCur) ^ (Double.doubleToLongBits(this.valAtCur) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.proLoss) ^ (Double.doubleToLongBits(this.proLoss) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.tradeType);
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
        if (!Objects.equals(this.tradeType, other.tradeType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EquityBalance{" + "valAtTrade=" + valAtTrade + ", valAtCur=" + valAtCur + ", proLoss=" + proLoss + ", tradeType=" + tradeType + '}';
    }


    
}
