package org.openapi.b2b.orderDetail;

import java.util.ArrayList;

import org.openapi.b2b.common.IsinInfo;

public class OrderDetail {
	private String accNo;
	private String accName;
	private String modifyType;
	private String cancelType;
	private String orderNo;
	private String orgOrderNo;
	private String sellBuyType;
	private String orderType;
	private String exchange;
	private String crcyCode;
	private double orderQty;
	private double orderPrice;
	private double execSumQty;
	private String orderExecType;
	private String cmsnType;
	private int settDays;
	private double buyQtyUnit;
	private double sellQtyUnit;
	private String orderTime;
	private String orderRejectReason;
	private ArrayList<IsinInfo> isinInfo = new ArrayList<IsinInfo>();
	private ArrayList<ExecList> execList = new ArrayList<ExecList>();
	
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetail(String accNo, String accName, String modifyType, String cancelType, String orderNo,
			String orgOrderNo, String sellBuyType, String orderType, String exchange, String crcyCode, double orderQty,
			double orderPrice, double execSumQty, String orderExecType, String cmsnType, int settDays,
			double buyQtyUnit, double sellQtyUnit, String orderTime, String orderRejectReason,
			ArrayList<IsinInfo> isinInfo, ArrayList<ExecList> execList) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.modifyType = modifyType;
		this.cancelType = cancelType;
		this.orderNo = orderNo;
		this.orgOrderNo = orgOrderNo;
		this.sellBuyType = sellBuyType;
		this.orderType = orderType;
		this.exchange = exchange;
		this.crcyCode = crcyCode;
		this.orderQty = orderQty;
		this.orderPrice = orderPrice;
		this.execSumQty = execSumQty;
		this.orderExecType = orderExecType;
		this.cmsnType = cmsnType;
		this.settDays = settDays;
		this.buyQtyUnit = buyQtyUnit;
		this.sellQtyUnit = sellQtyUnit;
		this.orderTime = orderTime;
		this.orderRejectReason = orderRejectReason;
		this.isinInfo = isinInfo;
		this.execList = execList;
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
	public String getModifyType() {
		return modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}
	public String getCancelType() {
		return cancelType;
	}
	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrgOrderNo() {
		return orgOrderNo;
	}
	public void setOrgOrderNo(String orgOrderNo) {
		this.orgOrderNo = orgOrderNo;
	}
	public String getSellBuyType() {
		return sellBuyType;
	}
	public void setSellBuyType(String sellBuyType) {
		this.sellBuyType = sellBuyType;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
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
	public double getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(double orderQty) {
		this.orderQty = orderQty;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public double getExecSumQty() {
		return execSumQty;
	}
	public void setExecSumQty(double execSumQty) {
		this.execSumQty = execSumQty;
	}
	public String getOrderExecType() {
		return orderExecType;
	}
	public void setOrderExecType(String orderExecType) {
		this.orderExecType = orderExecType;
	}
	public String getCmsnType() {
		return cmsnType;
	}
	public void setCmsnType(String cmsnType) {
		this.cmsnType = cmsnType;
	}
	public int getSettDays() {
		return settDays;
	}
	public void setSettDays(int settDays) {
		this.settDays = settDays;
	}
	public double getBuyQtyUnit() {
		return buyQtyUnit;
	}
	public void setBuyQtyUnit(double buyQtyUnit) {
		this.buyQtyUnit = buyQtyUnit;
	}
	public double getSellQtyUnit() {
		return sellQtyUnit;
	}
	public void setSellQtyUnit(double sellQtyUnit) {
		this.sellQtyUnit = sellQtyUnit;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderRejectReason() {
		return orderRejectReason;
	}
	public void setOrderRejectReason(String orderRejectReason) {
		this.orderRejectReason = orderRejectReason;
	}
	public ArrayList<IsinInfo> getIsinInfo() {
		return isinInfo;
	}
	public void setIsinInfo(ArrayList<IsinInfo> isinInfo) {
		this.isinInfo = isinInfo;
	}
	public ArrayList<ExecList> getExecList() {
		return execList;
	}
	public void setExecList(ArrayList<ExecList> execList) {
		this.execList = execList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accName == null) ? 0 : accName.hashCode());
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(buyQtyUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cancelType == null) ? 0 : cancelType.hashCode());
		result = prime * result + ((cmsnType == null) ? 0 : cmsnType.hashCode());
		result = prime * result + ((crcyCode == null) ? 0 : crcyCode.hashCode());
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		result = prime * result + ((execList == null) ? 0 : execList.hashCode());
		temp = Double.doubleToLongBits(execSumQty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((isinInfo == null) ? 0 : isinInfo.hashCode());
		result = prime * result + ((modifyType == null) ? 0 : modifyType.hashCode());
		result = prime * result + ((orderExecType == null) ? 0 : orderExecType.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		temp = Double.doubleToLongBits(orderPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(orderQty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((orderRejectReason == null) ? 0 : orderRejectReason.hashCode());
		result = prime * result + ((orderTime == null) ? 0 : orderTime.hashCode());
		result = prime * result + ((orderType == null) ? 0 : orderType.hashCode());
		result = prime * result + ((orgOrderNo == null) ? 0 : orgOrderNo.hashCode());
		result = prime * result + ((sellBuyType == null) ? 0 : sellBuyType.hashCode());
		temp = Double.doubleToLongBits(sellQtyUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + settDays;
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
		OrderDetail other = (OrderDetail) obj;
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
		if (Double.doubleToLongBits(buyQtyUnit) != Double.doubleToLongBits(other.buyQtyUnit))
			return false;
		if (cancelType == null) {
			if (other.cancelType != null)
				return false;
		} else if (!cancelType.equals(other.cancelType))
			return false;
		if (cmsnType == null) {
			if (other.cmsnType != null)
				return false;
		} else if (!cmsnType.equals(other.cmsnType))
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
		if (execList == null) {
			if (other.execList != null)
				return false;
		} else if (!execList.equals(other.execList))
			return false;
		if (Double.doubleToLongBits(execSumQty) != Double.doubleToLongBits(other.execSumQty))
			return false;
		if (isinInfo == null) {
			if (other.isinInfo != null)
				return false;
		} else if (!isinInfo.equals(other.isinInfo))
			return false;
		if (modifyType == null) {
			if (other.modifyType != null)
				return false;
		} else if (!modifyType.equals(other.modifyType))
			return false;
		if (orderExecType == null) {
			if (other.orderExecType != null)
				return false;
		} else if (!orderExecType.equals(other.orderExecType))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (Double.doubleToLongBits(orderPrice) != Double.doubleToLongBits(other.orderPrice))
			return false;
		if (Double.doubleToLongBits(orderQty) != Double.doubleToLongBits(other.orderQty))
			return false;
		if (orderRejectReason == null) {
			if (other.orderRejectReason != null)
				return false;
		} else if (!orderRejectReason.equals(other.orderRejectReason))
			return false;
		if (orderTime == null) {
			if (other.orderTime != null)
				return false;
		} else if (!orderTime.equals(other.orderTime))
			return false;
		if (orderType == null) {
			if (other.orderType != null)
				return false;
		} else if (!orderType.equals(other.orderType))
			return false;
		if (orgOrderNo == null) {
			if (other.orgOrderNo != null)
				return false;
		} else if (!orgOrderNo.equals(other.orgOrderNo))
			return false;
		if (sellBuyType == null) {
			if (other.sellBuyType != null)
				return false;
		} else if (!sellBuyType.equals(other.sellBuyType))
			return false;
		if (Double.doubleToLongBits(sellQtyUnit) != Double.doubleToLongBits(other.sellQtyUnit))
			return false;
		if (settDays != other.settDays)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderDetail [accNo=" + accNo + ", accName=" + accName + ", modifyType=" + modifyType + ", cancelType="
				+ cancelType + ", orderNo=" + orderNo + ", orgOrderNo=" + orgOrderNo + ", sellBuyType=" + sellBuyType
				+ ", orderType=" + orderType + ", exchange=" + exchange + ", crcyCode=" + crcyCode + ", orderQty="
				+ orderQty + ", orderPrice=" + orderPrice + ", execSumQty=" + execSumQty + ", orderExecType="
				+ orderExecType + ", cmsnType=" + cmsnType + ", settDays=" + settDays + ", buyQtyUnit=" + buyQtyUnit
				+ ", sellQtyUnit=" + sellQtyUnit + ", orderTime=" + orderTime + ", orderRejectReason="
				+ orderRejectReason + ", isinInfo=" + isinInfo + ", execList=" + execList + "]";
	}
	
	
	

}