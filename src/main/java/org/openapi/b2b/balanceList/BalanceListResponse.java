package org.openapi.b2b.balanceList;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.Resp;

public class BalanceListResponse {

	private CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
	private BalanceListResponseBody balanceListResponseBody = new BalanceListResponseBody();
	private BalanceList balanceList = new BalanceList();
	private Resp resp = new Resp();
	
	
	public BalanceListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BalanceListResponse(CommonHeaderForResponse commonHeader, BalanceListResponseBody balanceListResponseBody,
			BalanceList balanceList, Resp resp) {
		super();
		this.commonHeader = commonHeader;
		this.balanceListResponseBody = balanceListResponseBody;
		this.balanceList = balanceList;
		this.resp = resp;
	}


	public CommonHeaderForResponse getCommonHeader() {
		return commonHeader;
	}


	public void setCommonHeader(CommonHeaderForResponse commonHeader) {
		this.commonHeader = commonHeader;
	}


	public BalanceListResponseBody getBalanceListResponseBody() {
		return balanceListResponseBody;
	}


	public void setBalanceListResponseBody(BalanceListResponseBody balanceListResponseBody) {
		this.balanceListResponseBody = balanceListResponseBody;
	}


	public BalanceList getBalanceList() {
		return balanceList;
	}


	public void setBalanceList(BalanceList balanceList) {
		this.balanceList = balanceList;
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
		result = prime * result + ((balanceList == null) ? 0 : balanceList.hashCode());
		result = prime * result + ((balanceListResponseBody == null) ? 0 : balanceListResponseBody.hashCode());
		result = prime * result + ((commonHeader == null) ? 0 : commonHeader.hashCode());
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
		BalanceListResponse other = (BalanceListResponse) obj;
		if (balanceList == null) {
			if (other.balanceList != null)
				return false;
		} else if (!balanceList.equals(other.balanceList))
			return false;
		if (balanceListResponseBody == null) {
			if (other.balanceListResponseBody != null)
				return false;
		} else if (!balanceListResponseBody.equals(other.balanceListResponseBody))
			return false;
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
		return true;
	}


	@Override
	public String toString() {
		return "BalanceListResponse [commonHeader=" + commonHeader + ", balanceListResponseBody="
				+ balanceListResponseBody + ", balanceList=" + balanceList + ", resp=" + resp + "]";
	}
	
	
	
	
}
