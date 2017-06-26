package org.openapi.b2b.settleList;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;

public class SettleListRequest {
	private Partner partner;
	private CommonHeaderForRequest commonHeader;
	private SettleListRequestBody settleListRequestBody;
	public SettleListRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SettleListRequest(Partner partner, CommonHeaderForRequest commonHeader,
			SettleListRequestBody settleListRequestBody) {
		super();
		this.partner = partner;
		this.commonHeader = commonHeader;
		this.settleListRequestBody = settleListRequestBody;
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
	public SettleListRequestBody getSettleListRequestBody() {
		return settleListRequestBody;
	}
	public void setSettleListRequestBody(SettleListRequestBody settleListRequestBody) {
		this.settleListRequestBody = settleListRequestBody;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commonHeader == null) ? 0 : commonHeader.hashCode());
		result = prime * result + ((partner == null) ? 0 : partner.hashCode());
		result = prime * result + ((settleListRequestBody == null) ? 0 : settleListRequestBody.hashCode());
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
		SettleListRequest other = (SettleListRequest) obj;
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
		if (settleListRequestBody == null) {
			if (other.settleListRequestBody != null)
				return false;
		} else if (!settleListRequestBody.equals(other.settleListRequestBody))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SettleListRequest [partner=" + partner + ", commonHeader=" + commonHeader + ", settleListRequestBody="
				+ settleListRequestBody + "]";
	}
	
	

}
