package org.openapi.b2b.common;

public class CostInfo {

	private String costName;
	private double cost;
	public String getCostName() {
		return costName;
	}
	public void setCostName(String costName) {
		this.costName = costName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((costName == null) ? 0 : costName.hashCode());
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
		CostInfo other = (CostInfo) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (costName == null) {
			if (other.costName != null)
				return false;
		} else if (!costName.equals(other.costName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CostInfo [costName=" + costName + ", cost=" + cost + "]";
	}
	
	
}
