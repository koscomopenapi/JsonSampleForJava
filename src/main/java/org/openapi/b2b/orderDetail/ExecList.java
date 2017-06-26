package org.openapi.b2b.orderDetail;

public class ExecList {
	private double execQty;
	private double execPrice;
	private int execNo;
	private String execTime;
	
	public ExecList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExecList(double execQty, double execPrice, int execNo, String execTime) {
		super();
		this.execQty = execQty;
		this.execPrice = execPrice;
		this.execNo = execNo;
		this.execTime = execTime;
	}
	public double getExecQty() {
		return execQty;
	}
	public void setExecQty(double execQty) {
		this.execQty = execQty;
	}
	public double getExecPrice() {
		return execPrice;
	}
	public void setExecPrice(double execPrice) {
		this.execPrice = execPrice;
	}
	public int getExecNo() {
		return execNo;
	}
	public void setExecNo(int execNo) {
		this.execNo = execNo;
	}
	public String getExecTime() {
		return execTime;
	}
	public void setExecTime(String execTime) {
		this.execTime = execTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + execNo;
		long temp;
		temp = Double.doubleToLongBits(execPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(execQty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((execTime == null) ? 0 : execTime.hashCode());
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
		ExecList other = (ExecList) obj;
		if (execNo != other.execNo)
			return false;
		if (Double.doubleToLongBits(execPrice) != Double.doubleToLongBits(other.execPrice))
			return false;
		if (Double.doubleToLongBits(execQty) != Double.doubleToLongBits(other.execQty))
			return false;
		if (execTime == null) {
			if (other.execTime != null)
				return false;
		} else if (!execTime.equals(other.execTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ExecList [execQty=" + execQty + ", execPrice=" + execPrice + ", execNo=" + execNo + ", execTime="
				+ execTime + "]";
	}
	
	
}