package org.openapi.b2b.tradeBook;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.Resp;

public class TradeBookListResponse {

	private CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
	private TradeBookListResponseBody tradeBookListResponseBody = new TradeBookListResponseBody();
	private TradeBookList tradeBookList = new TradeBookList();
	private Resp resp = new Resp();
	public TradeBookListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TradeBookListResponse(CommonHeaderForResponse commonHeader,
			TradeBookListResponseBody tradeBookListResponseBody, TradeBookList tradeBookList, Resp resp) {
		super();
		this.commonHeader = commonHeader;
		this.tradeBookListResponseBody = tradeBookListResponseBody;
		this.tradeBookList = tradeBookList;
		this.resp = resp;
	}
	public CommonHeaderForResponse getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeaderForResponse commonHeader) {
		this.commonHeader = commonHeader;
	}
	public TradeBookListResponseBody getTradeBookListResponseBody() {
		return tradeBookListResponseBody;
	}
	public void setTradeBookListResponseBody(TradeBookListResponseBody tradeBookListResponseBody) {
		this.tradeBookListResponseBody = tradeBookListResponseBody;
	}
	public TradeBookList getTradeBookList() {
		return tradeBookList;
	}
	public void setTradeBookList(TradeBookList tradeBookList) {
		this.tradeBookList = tradeBookList;
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
		result = prime * result + ((resp == null) ? 0 : resp.hashCode());
		result = prime * result + ((tradeBookList == null) ? 0 : tradeBookList.hashCode());
		result = prime * result + ((tradeBookListResponseBody == null) ? 0 : tradeBookListResponseBody.hashCode());
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
		TradeBookListResponse other = (TradeBookListResponse) obj;
		if (commonHeader == null) {
			if (other.commonHeader != null)
				return false;
		} else if (!commonHeader.equals(other.commonHeader))
			return false;
		if (resp == null) {
			if (other.resp != null)
				return false;
		} else if (!resp.equals(other.resp))
			return false;
		if (tradeBookList == null) {
			if (other.tradeBookList != null)
				return false;
		} else if (!tradeBookList.equals(other.tradeBookList))
			return false;
		if (tradeBookListResponseBody == null) {
			if (other.tradeBookListResponseBody != null)
				return false;
		} else if (!tradeBookListResponseBody.equals(other.tradeBookListResponseBody))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TradeBookListResponse [commonHeader=" + commonHeader + ", tradeBookListResponseBody="
				+ tradeBookListResponseBody + ", tradeBookList=" + tradeBookList + ", resp=" + resp + "]";
	}



}
