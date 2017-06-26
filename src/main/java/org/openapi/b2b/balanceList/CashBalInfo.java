package org.openapi.b2b.balanceList;

public class CashBalInfo {
	private double cashBalance;
	private double margin;
	private double substitute;
	private double receivable;
	private double totCreditAmt;
	private double totLoanAmt;
	private double valAtCur;
	private String crcyCode;
	private double cashAvWithdraw;
	
	public CashBalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CashBalInfo(double cashBalance, double margin, double substitute, double receivable, double totCreditAmt,
			double totLoanAmt, double valAtCur, String crcyCode, double cashAvWithdraw) {
		super();
		this.cashBalance = cashBalance;
		this.margin = margin;
		this.substitute = substitute;
		this.receivable = receivable;
		this.totCreditAmt = totCreditAmt;
		this.totLoanAmt = totLoanAmt;
		this.valAtCur = valAtCur;
		this.crcyCode = crcyCode;
		this.cashAvWithdraw = cashAvWithdraw;
	}
	public double getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(double cashBalance) {
		this.cashBalance = cashBalance;
	}
	public double getMargin() {
		return margin;
	}
	public void setMargin(double margin) {
		this.margin = margin;
	}
	public double getSubstitute() {
		return substitute;
	}
	public void setSubstitute(double substitute) {
		this.substitute = substitute;
	}
	public double getReceivable() {
		return receivable;
	}
	public void setReceivable(double receivable) {
		this.receivable = receivable;
	}
	public double getTotCreditAmt() {
		return totCreditAmt;
	}
	public void setTotCreditAmt(double totCreditAmt) {
		this.totCreditAmt = totCreditAmt;
	}
	public double getTotLoanAmt() {
		return totLoanAmt;
	}
	public void setTotLoanAmt(double totLoanAmt) {
		this.totLoanAmt = totLoanAmt;
	}
	public double getValAtCur() {
		return valAtCur;
	}
	public void setValAtCur(double valAtCur) {
		this.valAtCur = valAtCur;
	}
	public String getCrcyCode() {
		return crcyCode;
	}
	public void setCrcyCode(String crcyCode) {
		this.crcyCode = crcyCode;
	}
	public double getCashAvWithdraw() {
		return cashAvWithdraw;
	}
	public void setCashAvWithdraw(double cashAvWithdraw) {
		this.cashAvWithdraw = cashAvWithdraw;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cashAvWithdraw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cashBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((crcyCode == null) ? 0 : crcyCode.hashCode());
		temp = Double.doubleToLongBits(margin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(receivable);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(substitute);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totCreditAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totLoanAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valAtCur);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CashBalInfo other = (CashBalInfo) obj;
		if (Double.doubleToLongBits(cashAvWithdraw) != Double.doubleToLongBits(other.cashAvWithdraw))
			return false;
		if (Double.doubleToLongBits(cashBalance) != Double.doubleToLongBits(other.cashBalance))
			return false;
		if (crcyCode == null) {
			if (other.crcyCode != null)
				return false;
		} else if (!crcyCode.equals(other.crcyCode))
			return false;
		if (Double.doubleToLongBits(margin) != Double.doubleToLongBits(other.margin))
			return false;
		if (Double.doubleToLongBits(receivable) != Double.doubleToLongBits(other.receivable))
			return false;
		if (Double.doubleToLongBits(substitute) != Double.doubleToLongBits(other.substitute))
			return false;
		if (Double.doubleToLongBits(totCreditAmt) != Double.doubleToLongBits(other.totCreditAmt))
			return false;
		if (Double.doubleToLongBits(totLoanAmt) != Double.doubleToLongBits(other.totLoanAmt))
			return false;
		if (Double.doubleToLongBits(valAtCur) != Double.doubleToLongBits(other.valAtCur))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CashBalInfo [cashBalance=" + cashBalance + ", margin=" + margin + ", substitute=" + substitute
				+ ", receivable=" + receivable + ", totCreditAmt=" + totCreditAmt + ", totLoanAmt=" + totLoanAmt
				+ ", valAtCur=" + valAtCur + ", crcyCode=" + crcyCode + ", cashAvWithdraw=" + cashAvWithdraw + "]";
	}
	
	
}