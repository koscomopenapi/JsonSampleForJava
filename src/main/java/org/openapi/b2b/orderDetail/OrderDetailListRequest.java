package org.openapi.b2b.orderDetail;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;

public class OrderDetailListRequest {

	private Partner partner;
	private CommonHeaderForRequest commonHeader;
	private OrderDetailListRequestBody orderDetailRequestBody;
	public OrderDetailListRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetailListRequest(Partner partner, CommonHeaderForRequest commonHeader,
			OrderDetailListRequestBody orderDetailRequestBody) {
		super();
		this.partner = partner;
		this.commonHeader = commonHeader;
		this.orderDetailRequestBody = orderDetailRequestBody;
	}
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
	}
	public CommonHeaderForRequest getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeaderForRequest commonHeader) {
		this.commonHeader = commonHeader;
	}
	public OrderDetailListRequestBody getOrderDetailRequestBody() {
		return orderDetailRequestBody;
	}
	public void setOrderDetailRequestBody(OrderDetailListRequestBody orderDetailRequestBody) {
		this.orderDetailRequestBody = orderDetailRequestBody;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commonHeader == null) ? 0 : commonHeader.hashCode());
		result = prime * result + ((orderDetailRequestBody == null) ? 0 : orderDetailRequestBody.hashCode());
		result = prime * result + ((partner == null) ? 0 : partner.hashCode());
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
		OrderDetailListRequest other = (OrderDetailListRequest) obj;
		if (commonHeader == null) {
			if (other.commonHeader != null)
				return false;
		} else if (!commonHeader.equals(other.commonHeader))
			return false;
		if (orderDetailRequestBody == null) {
			if (other.orderDetailRequestBody != null)
				return false;
		} else if (!orderDetailRequestBody.equals(other.orderDetailRequestBody))
			return false;
		if (partner == null) {
			if (other.partner != null)
				return false;
		} else if (!partner.equals(other.partner))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderDetailListRequest [partner=" + partner + ", commonHeader=" + commonHeader
				+ ", orderDetailRequestBody=" + orderDetailRequestBody + "]";
	}

	
	

}
