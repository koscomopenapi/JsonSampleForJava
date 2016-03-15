/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

/**
 *
 * @author heungjae
 */
public class EtcBalance {
    double valAtTrade;
    double valAtCur;

    public EtcBalance() {
    }

    public EtcBalance(double valAtTrade, double valAtCur) {
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valAtTrade) ^ (Double.doubleToLongBits(this.valAtTrade) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valAtCur) ^ (Double.doubleToLongBits(this.valAtCur) >>> 32));
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
        final EtcBalance other = (EtcBalance) obj;
        if (Double.doubleToLongBits(this.valAtTrade) != Double.doubleToLongBits(other.valAtTrade)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valAtCur) != Double.doubleToLongBits(other.valAtCur)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EtcBalance{" + "valAtTrade=" + valAtTrade + ", valAtCur=" + valAtCur + '}';
    }
    
    
}
