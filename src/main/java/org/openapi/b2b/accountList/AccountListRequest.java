package org.openapi.b2b.accountList;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;

public class AccountListRequest{
	
	private Partner partner;
	private CommonHeaderForRequest commonHeader;
	private AccountListRequestBody accountListRequestBody;
	
	public AccountListRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountListRequest(Partner partner, CommonHeaderForRequest commonHeader,
			AccountListRequestBody accountListRequestBody) {
		super();
		this.partner = partner;
		this.commonHeader = commonHeader;
		this.accountListRequestBody = accountListRequestBody;
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
	public AccountListRequestBody getAccountListRequestBody() {
		return accountListRequestBody;
	}
	public void setAccountListRequestBody(AccountListRequestBody accountListRequestBody) {
		this.accountListRequestBody = accountListRequestBody;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountListRequestBody == null) ? 0 : accountListRequestBody.hashCode());
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
		AccountListRequest other = (AccountListRequest) obj;
		if (accountListRequestBody == null) {
			if (other.accountListRequestBody != null)
				return false;
		} else if (!accountListRequestBody.equals(other.accountListRequestBody))
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
		return "AccountListRequest [partner=" + partner + ", commonHeader=" + commonHeader + ", accountListRequestBody="
				+ accountListRequestBody + "]";
	}
	
}
