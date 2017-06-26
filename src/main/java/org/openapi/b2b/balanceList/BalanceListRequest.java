package org.openapi.b2b.balanceList;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;

public class BalanceListRequest {

	private Partner partner;
	private CommonHeaderForRequest commonHeader;
	private BalanceListRequestBody balanceListRequestBody;
	public BalanceListRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BalanceListRequest(Partner partner, CommonHeaderForRequest commonHeader,
			BalanceListRequestBody balanceListRequestBody) {
		super();
		this.partner = partner;
		this.commonHeader = commonHeader;
		this.balanceListRequestBody = balanceListRequestBody;
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
	public BalanceListRequestBody getBalanceListRequestBody() {
		return balanceListRequestBody;
	}
	public void setBalanceListRequestBody(BalanceListRequestBody balanceListRequestBody) {
		this.balanceListRequestBody = balanceListRequestBody;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balanceListRequestBody == null) ? 0 : balanceListRequestBody.hashCode());
		result = prime * result + ((commonHeader == null) ? 0 : commonHeader.hashCode());
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
		BalanceListRequest other = (BalanceListRequest) obj;
		if (balanceListRequestBody == null) {
			if (other.balanceListRequestBody != null)
				return false;
		} else if (!balanceListRequestBody.equals(other.balanceListRequestBody))
			return false;
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
		return true;
	}
	@Override
	public String toString() {
		return "BalanceListRequest [partner=" + partner + ", commonHeader=" + commonHeader + ", balanceListRequestBody="
				+ balanceListRequestBody + "]";
	}
	

}
