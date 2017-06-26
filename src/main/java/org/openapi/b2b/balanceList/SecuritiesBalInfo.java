package org.openapi.b2b.balanceList;

import java.util.ArrayList;

import org.openapi.b2b.common.IsinInfo;

public class SecuritiesBalInfo {
	private String assetType;
	private String exchange;
	private String crcyCode;
	private String loanCreditType;
	private double loanCreditAmt;
	private double qty;
	private double valAtTrade;
	private double valAtCur;
	private double proLoss;
	private double earningRate;
	private String lastBuyDate;
	private String maturity;
	private double foreignDeposit;
	private double wonDeposit;
	private double currencyRate;
	private ArrayList<IsinInfo> isinInfo = new ArrayList<IsinInfo>();
	public SecuritiesBalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 public void addIsinInfo(IsinInfo isinInfo) {
	        this.isinInfo.add(isinInfo);
	 }
	
	public SecuritiesBalInfo(String assetType, String exchange, String crcyCode, String loanCreditType,
			double loanCreditAmt, double qty, double valAtTrade, double valAtCur, double proLoss, double earningRate,
			String lastBuyDate, String maturity, double foreignDeposit, double wonDeposit, double currencyRate,
			ArrayList<IsinInfo> isinInfo) {
		super();
		this.assetType = assetType;
		this.exchange = exchange;
		this.crcyCode = crcyCode;
		this.loanCreditType = loanCreditType;
		this.loanCreditAmt = loanCreditAmt;
		this.qty = qty;
		this.valAtTrade = valAtTrade;
		this.valAtCur = valAtCur;
		this.proLoss = proLoss;
		this.earningRate = earningRate;
		this.lastBuyDate = lastBuyDate;
		this.maturity = maturity;
		this.foreignDeposit = foreignDeposit;
		this.wonDeposit = wonDeposit;
		this.currencyRate = currencyRate;
		this.isinInfo = isinInfo;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getCrcyCode() {
		return crcyCode;
	}
	public void setCrcyCode(String crcyCode) {
		this.crcyCode = crcyCode;
	}
	public String getLoanCreditType() {
		return loanCreditType;
	}
	public void setLoanCreditType(String loanCreditType) {
		this.loanCreditType = loanCreditType;
	}
	public double getLoanCreditAmt() {
		return loanCreditAmt;
	}
	public void setLoanCreditAmt(double loanCreditAmt) {
		this.loanCreditAmt = loanCreditAmt;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
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
	public double getEarningRate() {
		return earningRate;
	}
	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	public String getLastBuyDate() {
		return lastBuyDate;
	}
	public void setLastBuyDate(String lastBuyDate) {
		this.lastBuyDate = lastBuyDate;
	}
	public String getMaturity() {
		return maturity;
	}
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}
	public double getForeignDeposit() {
		return foreignDeposit;
	}
	public void setForeignDeposit(double foreignDeposit) {
		this.foreignDeposit = foreignDeposit;
	}
	public double getWonDeposit() {
		return wonDeposit;
	}
	public void setWonDeposit(double wonDeposit) {
		this.wonDeposit = wonDeposit;
	}
	public double getCurrencyRate() {
		return currencyRate;
	}
	public void setCurrencyRate(double currencyRate) {
		this.currencyRate = currencyRate;
	}
	public ArrayList<IsinInfo> getIsinInfo() {
		return isinInfo;
	}
	public void setIsinInfo(ArrayList<IsinInfo> isinInfo) {
		this.isinInfo = isinInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assetType == null) ? 0 : assetType.hashCode());
		result = prime * result + ((crcyCode == null) ? 0 : crcyCode.hashCode());
		long temp;
		temp = Double.doubleToLongBits(currencyRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(earningRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		temp = Double.doubleToLongBits(foreignDeposit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((isinInfo == null) ? 0 : isinInfo.hashCode());
		result = prime * result + ((lastBuyDate == null) ? 0 : lastBuyDate.hashCode());
		temp = Double.doubleToLongBits(loanCreditAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((loanCreditType == null) ? 0 : loanCreditType.hashCode());
		result = prime * result + ((maturity == null) ? 0 : maturity.hashCode());
		temp = Double.doubleToLongBits(proLoss);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(qty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valAtCur);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valAtTrade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(wonDeposit);
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
		SecuritiesBalInfo other = (SecuritiesBalInfo) obj;
		if (assetType == null) {
			if (other.assetType != null)
				return false;
		} else if (!assetType.equals(other.assetType))
			return false;
		if (crcyCode == null) {
			if (other.crcyCode != null)
				return false;
		} else if (!crcyCode.equals(other.crcyCode))
			return false;
		if (Double.doubleToLongBits(currencyRate) != Double.doubleToLongBits(other.currencyRate))
			return false;
		if (Double.doubleToLongBits(earningRate) != Double.doubleToLongBits(other.earningRate))
			return false;
		if (exchange == null) {
			if (other.exchange != null)
				return false;
		} else if (!exchange.equals(other.exchange))
			return false;
		if (Double.doubleToLongBits(foreignDeposit) != Double.doubleToLongBits(other.foreignDeposit))
			return false;
		if (isinInfo == null) {
			if (other.isinInfo != null)
				return false;
		} else if (!isinInfo.equals(other.isinInfo))
			return false;
		if (lastBuyDate == null) {
			if (other.lastBuyDate != null)
				return false;
		} else if (!lastBuyDate.equals(other.lastBuyDate))
			return false;
		if (Double.doubleToLongBits(loanCreditAmt) != Double.doubleToLongBits(other.loanCreditAmt))
			return false;
		if (loanCreditType == null) {
			if (other.loanCreditType != null)
				return false;
		} else if (!loanCreditType.equals(other.loanCreditType))
			return false;
		if (maturity == null) {
			if (other.maturity != null)
				return false;
		} else if (!maturity.equals(other.maturity))
			return false;
		if (Double.doubleToLongBits(proLoss) != Double.doubleToLongBits(other.proLoss))
			return false;
		if (Double.doubleToLongBits(qty) != Double.doubleToLongBits(other.qty))
			return false;
		if (Double.doubleToLongBits(valAtCur) != Double.doubleToLongBits(other.valAtCur))
			return false;
		if (Double.doubleToLongBits(valAtTrade) != Double.doubleToLongBits(other.valAtTrade))
			return false;
		if (Double.doubleToLongBits(wonDeposit) != Double.doubleToLongBits(other.wonDeposit))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SecuritiesBalInfo [assetType=" + assetType + ", exchange=" + exchange + ", crcyCode=" + crcyCode
				+ ", loanCreditType=" + loanCreditType + ", loanCreditAmt=" + loanCreditAmt + ", qty=" + qty
				+ ", valAtTrade=" + valAtTrade + ", valAtCur=" + valAtCur + ", proLoss=" + proLoss + ", earningRate="
				+ earningRate + ", lastBuyDate=" + lastBuyDate + ", maturity=" + maturity + ", foreignDeposit="
				+ foreignDeposit + ", wonDeposit=" + wonDeposit + ", currencyRate=" + currencyRate + ", isinInfo="
				+ isinInfo + "]";
	}
	
	
}