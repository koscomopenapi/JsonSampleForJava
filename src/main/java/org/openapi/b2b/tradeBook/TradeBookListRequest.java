package org.openapi.b2b.tradeBook;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;

public class TradeBookListRequest{

	private Partner partner;
	private CommonHeaderForRequest commonHeader;
	private TradeBookListRequestBody tradeBookListRequestBody;
	public TradeBookListRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TradeBookListRequest(Partner partner, CommonHeaderForRequest commonHeader,
			TradeBookListRequestBody tradeBookListRequestBody) {
		super();
		this.partner = partner;
		this.commonHeader = commonHeader;
		this.tradeBookListRequestBody = tradeBookListRequestBody;
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
	public TradeBookListRequestBody getTradeBookListRequestBody() {
		return tradeBookListRequestBody;
	}
	public void setTradeBookListRequestBody(TradeBookListRequestBody tradeBookListRequestBody) {
		this.tradeBookListRequestBody = tradeBookListRequestBody;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commonHeader == null) ? 0 : commonHeader.hashCode());
		result = prime * result + ((partner == null) ? 0 : partner.hashCode());
		result = prime * result + ((tradeBookListRequestBody == null) ? 0 : tradeBookListRequestBody.hashCode());
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
		TradeBookListRequest other = (TradeBookListRequest) obj;
		if (commonHeader == null) {
			if (other.commonHeader != null)
				return false;
		} else if (!commonHeader.equals(other.commonHeader))
			return false;
		if (partner == null) {
			if (other.partner != null)
				return false;
		} else if (!partner.equals(other.partner))
			return false;
		if (tradeBookListRequestBody == null) {
			if (other.tradeBookListRequestBody != null)
				return false;
		} else if (!tradeBookListRequestBody.equals(other.tradeBookListRequestBody))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TradeBookListRequest [partner=" + partner + ", commonHeader=" + commonHeader
				+ ", tradeBookListRequestBody=" + tradeBookListRequestBody + "]";
	}
	
	
}
