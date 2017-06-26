package org.openapi.b2b.accountList;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.Resp;

public class AccountListResponse {

	private CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
	private AccountListResponseBody accountListResponseBody = new AccountListResponseBody();
	private AccountList accountList = new AccountList();
	private Resp resp = new Resp();
	public AccountListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountListResponse(CommonHeaderForResponse commonHeader, AccountListResponseBody accountListResponseBody,
			AccountList accountList, Resp resp) {
		super();
		this.commonHeader = commonHeader;
		this.accountListResponseBody = accountListResponseBody;
		this.accountList = accountList;
		this.resp = resp;
	}
	public CommonHeaderForResponse getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeaderForResponse commonHeader) {
		this.commonHeader = commonHeader;
	}
	public AccountListResponseBody getAccountListResponseBody() {
		return accountListResponseBody;
	}
	public void setAccountListResponseBody(AccountListResponseBody accountListResponseBody) {
		this.accountListResponseBody = accountListResponseBody;
	}
	public AccountList getAccountList() {
		return accountList;
	}
	public void setAccountList(AccountList accountList) {
		this.accountList = accountList;
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
		result = prime * result + ((accountList == null) ? 0 : accountList.hashCode());
		result = prime * result + ((accountListResponseBody == null) ? 0 : accountListResponseBody.hashCode());
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
		AccountListResponse other = (AccountListResponse) obj;
		if (accountList == null) {
			if (other.accountList != null)
				return false;
		} else if (!accountList.equals(other.accountList))
			return false;
		if (accountListResponseBody == null) {
			if (other.accountListResponseBody != null)
				return false;
		} else if (!accountListResponseBody.equals(other.accountListResponseBody))
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
		return "AccountListResponse [commonHeader=" + commonHeader + ", accountListResponseBody="
				+ accountListResponseBody + ", accountList=" + accountList + ", resp=" + resp + "]";
	}
	
	


}
