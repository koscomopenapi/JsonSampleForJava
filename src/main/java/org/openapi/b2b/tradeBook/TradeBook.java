package org.openapi.b2b.tradeBook;

import java.util.ArrayList;
import java.util.List;

import org.openapi.b2b.common.CostInfo;
import org.openapi.b2b.common.IsinInfo;

public class TradeBook {
	private List<IsinInfo> isinInfo = new ArrayList<IsinInfo>();
	private List<CostInfo> costInfo = new ArrayList<CostInfo>();
	
	private String accNo;
	private String accName;
	private String transDate;
	private String transType;
	private double changeAmt;
	
	private double changeQty;	
	private double qty;
	private double amt;
	private String exchange;
	private String crcyCode;
	
	private String subject;
	private String summary;
	
	public void addIsinInfo(IsinInfo isinInfo) {
        this.isinInfo.add(isinInfo);
	}

	public void addCostInfo(CostInfo costInfo) {
        this.costInfo.add(costInfo);
	}

	
	public TradeBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TradeBook(List<IsinInfo> isinInfo, List<CostInfo> costInfo, String accNo, String accName, String transDate,
			String transType, double changeAmt, double changeQty, double qty, double amt, String exchange,
			String crcyCode, String subject, String summary) {
		super();
		this.isinInfo = isinInfo;
		this.costInfo = costInfo;
		this.accNo = accNo;
		this.accName = accName;
		this.transDate = transDate;
		this.transType = transType;
		this.changeAmt = changeAmt;
		this.changeQty = changeQty;
		this.qty = qty;
		this.amt = amt;
		this.exchange = exchange;
		this.crcyCode = crcyCode;
		this.subject = subject;
		this.summary = summary;
	}
	public List<IsinInfo> getisinInfo() {
		return isinInfo;
	}
	public void setisinInfo(List<IsinInfo> isinInfo) {
		this.isinInfo = isinInfo;
	}
	public List<CostInfo> getCostInfo() {
		return costInfo;
	}
	public void setCostInfo(List<CostInfo> costInfo) {
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
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public double getChangeAmt() {
		return changeAmt;
	}
	public void setChangeAmt(double changeAmt) {
		this.changeAmt = changeAmt;
	}
	public double getChangeQty() {
		return changeQty;
	}
	public void setChangeQty(double changeQty) {
		this.changeQty = changeQty;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accName == null) ? 0 : accName.hashCode());
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(changeAmt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(changeQty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((costInfo == null) ? 0 : costInfo.hashCode());
		result = prime * result + ((crcyCode == null) ? 0 : crcyCode.hashCode());
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		result = prime * result + ((isinInfo == null) ? 0 : isinInfo.hashCode());
		temp = Double.doubleToLongBits(qty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		result = prime * result + ((transDate == null) ? 0 : transDate.hashCode());
		result = prime * result + ((transType == null) ? 0 : transType.hashCode());
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
		TradeBook other = (TradeBook) obj;
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
		if (Double.doubleToLongBits(amt) != Double.doubleToLongBits(other.amt))
			return false;
		if (Double.doubleToLongBits(changeAmt) != Double.doubleToLongBits(other.changeAmt))
			return false;
		if (Double.doubleToLongBits(changeQty) != Double.doubleToLongBits(other.changeQty))
			return false;
		if (costInfo == null) {
			if (other.costInfo != null)
				return false;
		} else if (!costInfo.equals(other.costInfo))
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
		if (Double.doubleToLongBits(qty) != Double.doubleToLongBits(other.qty))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		if (transDate == null) {
			if (other.transDate != null)
				return false;
		} else if (!transDate.equals(other.transDate))
			return false;
		if (transType == null) {
			if (other.transType != null)
				return false;
		} else if (!transType.equals(other.transType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TradeBook [isinInfo=" + isinInfo + ", costInfo=" + costInfo + ", accNo=" + accNo + ", accName="
				+ accName + ", transDate=" + transDate + ", transType=" + transType + ", changeAmt=" + changeAmt
				+ ", changeQty=" + changeQty + ", qty=" + qty + ", amt=" + amt + ", exchange=" + exchange
				+ ", crcyCode=" + crcyCode + ", subject=" + subject + ", summary=" + summary + "]";
	}
	
	

}