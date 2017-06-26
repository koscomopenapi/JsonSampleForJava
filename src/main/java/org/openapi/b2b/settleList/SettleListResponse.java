package org.openapi.b2b.settleList;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.Resp;

public class SettleListResponse {

	private CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
	private SettleListResponseBody settleListResponseBody = new SettleListResponseBody();
	private SettleList settleList = new SettleList();
	private Resp resp = new Resp();
	public SettleListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SettleListResponse(CommonHeaderForResponse commonHeader, SettleListResponseBody settleListResponseBody,
			SettleList settleList, Resp resp) {
		super();
		this.commonHeader = commonHeader;
		this.settleListResponseBody = settleListResponseBody;
		this.settleList = settleList;
		this.resp = resp;
	}
	public CommonHeaderForResponse getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeaderForResponse commonHeader) {
		this.commonHeader = commonHeader;
	}
	public SettleListResponseBody getSettleListResponseBody() {
		return settleListResponseBody;
	}
	public void setSettleListResponseBody(SettleListResponseBody settleListResponseBody) {
		this.settleListResponseBody = settleListResponseBody;
	}
	public SettleList getSettleList() {
		return settleList;
	}
	public void setSettleList(SettleList settleList) {
		this.settleList = settleList;
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
		result = prime * result + ((settleList == null) ? 0 : settleList.hashCode());
		result = prime * result + ((settleListResponseBody == null) ? 0 : settleListResponseBody.hashCode());
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
		SettleListResponse other = (SettleListResponse) obj;
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
		if (settleList == null) {
			if (other.settleList != null)
				return false;
		} else if (!settleList.equals(other.settleList))
			return false;
		if (settleListResponseBody == null) {
			if (other.settleListResponseBody != null)
				return false;
		} else if (!settleListResponseBody.equals(other.settleListResponseBody))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SettleListResponse [commonHeader=" + commonHeader + ", settleListResponseBody=" + settleListResponseBody
				+ ", settleList=" + settleList + ", resp=" + resp + "]";
	}
	
	
	
}
