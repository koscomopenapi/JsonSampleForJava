package org.openapi.b2b.orderDetail;

import java.util.ArrayList;

import org.openapi.b2b.balanceList.Balance;

public class OrderDetailList {
	ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>();
	
	public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetail.add(orderDetail);
	}

	public OrderDetailList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetailList(ArrayList<OrderDetail> orderDetail) {
		super();
		this.orderDetail = orderDetail;
	}

	public ArrayList<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(ArrayList<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderDetail == null) ? 0 : orderDetail.hashCode());
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
		OrderDetailList other = (OrderDetailList) obj;
		if (orderDetail == null) {
			if (other.orderDetail != null)
				return false;
		} else if (!orderDetail.equals(other.orderDetail))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderDetailList [orderDetail=" + orderDetail + "]";
	}
	
	
}