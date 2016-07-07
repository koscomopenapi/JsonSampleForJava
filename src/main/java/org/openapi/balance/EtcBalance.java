/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import org.openapi.portfolio.asset.Etc;

/**
 *
 * @author heungjae
 */
public class EtcBalance extends Etc {
    double valAtTrade;
    double valAtCur;
    String tradeType;

    public EtcBalance() {
    }

    
    public EtcBalance(double valAtTrade, double valAtCur, String tradeType) {
        this.valAtTrade = valAtTrade;
        this.valAtCur = valAtCur;
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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    @Override
    public String toString() {
        return "EtcBalance{" + "valAtTrade=" + valAtTrade + ", valAtCur=" + valAtCur + ", tradeType=" + tradeType + '}';
    }

 
    
}
