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
public class BalanceSummary {
    double cashBalance;
    double d1;
    double d2;
    double substitute;
    double receivable;
    double subsMargin;
    double loanCredit;
    double valAtTrade;
    double valueAtCur;
    double proLoss;
    double totalAccVal;
    double cashAvWithdraw;

    public BalanceSummary() {
    }

    public BalanceSummary(double cashBalance, double d1, double d2, double substiture, double receivable, double subsMargin, double loanCredit, double valAtTrade, double valueAtCur, double proLoss, double totalAccVal, double cashAvWithdraw) {
        this.cashBalance = cashBalance;
        this.d1 = d1;
        this.d2 = d2;
        this.substitute = substiture;
        this.receivable = receivable;
        this.subsMargin = subsMargin;
        this.loanCredit = loanCredit;
        this.valAtTrade = valAtTrade;
        this.valueAtCur = valueAtCur;
        this.proLoss = proLoss;
        this.totalAccVal = totalAccVal;
        this.cashAvWithdraw = cashAvWithdraw;
    }

    public double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(double cashBalance) {
        this.cashBalance = cashBalance;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getSubstiture() {
        return substitute;
    }

    public void setSubstiture(double substiture) {
        this.substitute = substiture;
    }

    public double getReceivable() {
        return receivable;
    }

    public void setReceivable(double receivable) {
        this.receivable = receivable;
    }

    public double getSubsMargin() {
        return subsMargin;
    }

    public void setSubsMargin(double subsMargin) {
        this.subsMargin = subsMargin;
    }

    public double getLoanCredit() {
        return loanCredit;
    }

    public void setLoanCredit(double loanCredit) {
        this.loanCredit = loanCredit;
    }

    public double getValAtTrade() {
        return valAtTrade;
    }

    public void setValAtTrade(double valAtTrade) {
        this.valAtTrade = valAtTrade;
    }

    public double getValueAtCur() {
        return valueAtCur;
    }

    public void setValueAtCur(double valueAtCur) {
        this.valueAtCur = valueAtCur;
    }

    public double getProLoss() {
        return proLoss;
    }

    public void setProLoss(double proLoss) {
        this.proLoss = proLoss;
    }

    public double getTotalAccVal() {
        return totalAccVal;
    }

    public void setTotalAccVal(double totalAccVal) {
        this.totalAccVal = totalAccVal;
    }

    public double getCashAvWithdraw() {
        return cashAvWithdraw;
    }

    public void setCashAvWithdraw(double cashAvWithdraw) {
        this.cashAvWithdraw = cashAvWithdraw;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.cashBalance) ^ (Double.doubleToLongBits(this.cashBalance) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.d1) ^ (Double.doubleToLongBits(this.d1) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.d2) ^ (Double.doubleToLongBits(this.d2) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.substitute) ^ (Double.doubleToLongBits(this.substitute) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.receivable) ^ (Double.doubleToLongBits(this.receivable) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.subsMargin) ^ (Double.doubleToLongBits(this.subsMargin) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.loanCredit) ^ (Double.doubleToLongBits(this.loanCredit) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.valAtTrade) ^ (Double.doubleToLongBits(this.valAtTrade) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.valueAtCur) ^ (Double.doubleToLongBits(this.valueAtCur) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.proLoss) ^ (Double.doubleToLongBits(this.proLoss) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalAccVal) ^ (Double.doubleToLongBits(this.totalAccVal) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.cashAvWithdraw) ^ (Double.doubleToLongBits(this.cashAvWithdraw) >>> 32));
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
        final BalanceSummary other = (BalanceSummary) obj;
        if (Double.doubleToLongBits(this.cashBalance) != Double.doubleToLongBits(other.cashBalance)) {
            return false;
        }
        if (Double.doubleToLongBits(this.d1) != Double.doubleToLongBits(other.d1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.d2) != Double.doubleToLongBits(other.d2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.substitute) != Double.doubleToLongBits(other.substitute)) {
            return false;
        }
        if (Double.doubleToLongBits(this.receivable) != Double.doubleToLongBits(other.receivable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.subsMargin) != Double.doubleToLongBits(other.subsMargin)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loanCredit) != Double.doubleToLongBits(other.loanCredit)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valAtTrade) != Double.doubleToLongBits(other.valAtTrade)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valueAtCur) != Double.doubleToLongBits(other.valueAtCur)) {
            return false;
        }
        if (Double.doubleToLongBits(this.proLoss) != Double.doubleToLongBits(other.proLoss)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalAccVal) != Double.doubleToLongBits(other.totalAccVal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cashAvWithdraw) != Double.doubleToLongBits(other.cashAvWithdraw)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BalanceSummary{" + "cashBalance=" + cashBalance + ", d1=" + d1 + ", d2=" + d2 + ", substiture=" + substitute + ", receivable=" + receivable + ", subsMargin=" + subsMargin + ", loanCredit=" + loanCredit + ", valAtTrade=" + valAtTrade + ", valueAtCur=" + valueAtCur + ", proLoss=" + proLoss + ", totalAccVal=" + totalAccVal + ", cashAvWithdraw=" + cashAvWithdraw + '}';
    }

    
    
}
