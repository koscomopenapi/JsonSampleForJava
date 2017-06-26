package org.openapi.b2b.orderDetail;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.Resp;

public class OrderDetailListResponse {

	private CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
	private OrderDetailListResponseBody orderDetailResponseBody = new OrderDetailListResponseBody();
	private OrderDetailList orderDetailList = new OrderDetailList();
	private Resp resp = new Resp();
	public OrderDetailListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetailListResponse(CommonHeaderForResponse commonHeader,
			OrderDetailListResponseBody orderDetailResponseBody, OrderDetailList orderDetailList, Resp resp) {
		super();
		this.commonHeader = commonHeader;
		this.orderDetailResponseBody = orderDetailResponseBody;
		this.orderDetailList = orderDetailList;
		this.resp = resp;
	}
	public CommonHeaderForResponse getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeaderForResponse commonHeader) {
		this.commonHeader = commonHeader;
	}
	public OrderDetailListResponseBody getOrderDetailResponseBody() {
		return orderDetailResponseBody;
	}
	public void setOrderDetailResponseBody(OrderDetailListResponseBody orderDetailResponseBody) {
		this.orderDetailResponseBody = orderDetailResponseBody;
	}
	public OrderDetailList getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(OrderDetailList orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	public Resp getResp() {
		return resp;
	}
	public void setResp(Resp resp) {
		this.resp = resp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commonHeader == null) ? 0 : commonHeader.hashCode());
		result = prime * result + ((orderDetailList == null) ? 0 : orderDetailList.hashCode());
		result = prime * result + ((orderDetailResponseBody == null) ? 0 : orderDetailResponseBody.hashCode());
		result = prime * result + ((resp == null) ? 0 : resp.hashCode());
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
		OrderDetailListResponse other = (OrderDetailListResponse) obj;
		if (commonHeader == null) {
			if (other.commonHeader != null)
				return false;
		} else if (!commonHeader.equals(other.commonHeader))
			return false;
		if (orderDetailList == null) {
			if (other.orderDetailList != null)
				return false;
		} else if (!orderDetailList.equals(other.orderDetailList))
			return false;
		if (orderDetailResponseBody == null) {
			if (other.orderDetailResponseBody != null)
				return false;
		} else if (!orderDetailResponseBody.equals(other.orderDetailResponseBody))
			return false;
		if (resp == null) {
			if (other.resp != null)
				return false;
		} else if (!resp.equals(other.resp))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderDetailListResponse [commonHeader=" + commonHeader + ", orderDetailResponseBody="
				+ orderDetailResponseBody + ", orderDetailList=" + orderDetailList + ", resp=" + resp + "]";
	}
	
	
}
