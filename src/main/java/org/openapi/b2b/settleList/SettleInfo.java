package org.openapi.b2b.settleList;

import java.util.ArrayList;

import org.openapi.b2b.balanceList.Balance;
import org.openapi.b2b.common.CostInfo;
import org.openapi.b2b.common.IsinInfo;



public class SettleInfo {
	private String accNo;
	private String accName;
	private String sellBuyType;
	private String exchange;
	private String crcyCode;
	private double settQty;
	private double settAmt;
	private String tradeType;
	private String loanCreditDate;
	private double loanCreditAmt;
	private String settDate;
	private double costTotal;
	private ArrayList<IsinInfo> isinInfo = new ArrayList<IsinInfo>();
	private ArrayList<CostInfo> costInfo = new ArrayList<CostInfo>();
	
	public void addIsinInfo(IsinInfo isinInfo) {
        this.isinInfo.add(isinInfo);
	}
	public void addCostInfo(CostInfo costInfo) {
        this.costInfo.add(costInfo);
	}
	
	public SettleInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SettleInfo(String accNo, String accName, String sellBuyType, String exchange, String crcyCode,
			double settQty, double settAmt, String tradeType, String loanCreditDate, double loanCreditAmt,
			String settDate, double costTotal, ArrayList<IsinInfo> isinInfo, ArrayList<CostInfo> costInfo) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.sellBuyType = sellBuyType;
		this.exchange = exchange;
		this.crcyCode = crcyCode;
		this.settQty = settQty;
		this.settAmt = settAmt;
		this.tradeType = tradeType;
		this.loanCreditDate = loanCreditDate;
		this.loanCreditAmt = loanCreditAmt;
		this.settDate = settDate;
		this.costTotal = costTotal;
		this.isinInfo = isinInfo;
		this.costInfo = costInfo;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getSellBuyType() {
		return sellBuyType;
	}
	public void setSellBuyType(String sellBuyType) {
		this.sellBuyType = sellBuyType;
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
	public double getSettQty() {
		return settQty;
	}
	public void setSettQty(double settQty) {
		this.settQty = settQty;
	}
	public double getSettAmt() {
		return settAmt;
	}
	public void setSettAmt(double settAmt) {
		this.settAmt = settAmt;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getLoanCreditDate() {
		return loanCreditDate;
	}
	public void setLoanCreditDate(String loanCreditDate) {
		this.loanCreditDate = loanCreditDate;
	}
	public double getLoanCreditAmt() {
		return loanCreditAmt;
	}
	public void setLoanCreditAmt(double loanCreditAmt) {
		this.loanCreditAmt = loanCreditAmt;
	}
	public String getSettDate() {
		return settDate;
	}
	public void setSettDate(String settDate) {
		this.settDate = settDate;
	}
	public double getCostTotal() {
		return costTotal;
	}
	public void setCostTotal(double costTotal) {
		this.costTotal = costTotal;
	}
	public ArrayList<IsinInfo> getIsinInfo() {
		return isinInfo;
	}
	public void setIsinInfo(ArrayList<IsinInfo> isinInfo) {
		this.isinInfo = isinInfo;
	}
	public ArrayList<CostInfo> getCostInfo() {
		return costInfo;
	}
	public void setCostInfo(ArrayList<CostInfo> costInfo) {
		this.costInfo = costInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accName == null) ? 0 : accName.hashCode());
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		result = prime * result + ((costInfo == null) ? 0 : costInfo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(costTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((crcyCode == null) ? 0 : crcyCode.hashCode());
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		result = prime * result + ((isinInfo == null) ? 0 : isinInfo.hashCode());
		temp = Double.doubleToLongBits(loanCreditAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((loanCreditDate == null) ? 0 : loanCreditDate.hashCode());
		result = prime * result + ((sellBuyType == null) ? 0 : sellBuyType.hashCode());
		temp = Double.doubleToLongBits(settAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((settDate == null) ? 0 : settDate.hashCode());
		temp = Double.doubleToLongBits(settQty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tradeType == null) ? 0 : tradeType.hashCode());
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
		SettleInfo other = (SettleInfo) obj;
		if (accName == null) {
			if (other.accName != null)
				return false;
		} else if (!accName.equals(other.accName))
			return false;
		if (accNo == null) {
			if (other.accNo != null)
				return false;
		} else if (!accNo.equals(other.accNo))
			return false;
		if (costInfo == null) {
			if (other.costInfo != null)
				return false;
		} else if (!costInfo.equals(other.costInfo))
			return false;
		if (Double.doubleToLongBits(costTotal) != Double.doubleToLongBits(other.costTotal))
			return false;
		if (crcyCode == null) {
			if (other.crcyCode != null)
				return false;
		} else if (!crcyCode.equals(other.crcyCode))
			return false;
		if (exchange == null) {
			if (other.exchange != null)
				return false;
		} else if (!exchange.equals(other.exchange))
			return false;
		if (isinInfo == null) {
			if (other.isinInfo != null)
				return false;
		} else if (!isinInfo.equals(other.isinInfo))
			return false;
		if (Double.doubleToLongBits(loanCreditAmt) != Double.doubleToLongBits(other.loanCreditAmt))
			return false;
		if (loanCreditDate == null) {
			if (other.loanCreditDate != null)
				return false;
		} else if (!loanCreditDate.equals(other.loanCreditDate))
			return false;
		if (sellBuyType == null) {
			if (other.sellBuyType != null)
				return false;
		} else if (!sellBuyType.equals(other.sellBuyType))
			return false;
		if (Double.doubleToLongBits(settAmt) != Double.doubleToLongBits(other.settAmt))
			return false;
		if (settDate == null) {
			if (other.settDate != null)
				return false;
		} else if (!settDate.equals(other.settDate))
			return false;
		if (Double.doubleToLongBits(settQty) != Double.doubleToLongBits(other.settQty))
			return false;
		if (tradeType == null) {
			if (other.tradeType != null)
				return false;
		} else if (!tradeType.equals(other.tradeType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SettleInfo [accNo=" + accNo + ", accName=" + accName + ", sellBuyType=" + sellBuyType + ", exchange="
				+ exchange + ", crcyCode=" + crcyCode + ", settQty=" + settQty + ", settAmt=" + settAmt + ", tradeType="
				+ tradeType + ", loanCreditDate=" + loanCreditDate + ", loanCreditAmt=" + loanCreditAmt + ", settDate="
				+ settDate + ", costTotal=" + costTotal + ", isinInfo=" + isinInfo + ", costInfo=" + costInfo + "]";
	}
	
	
}