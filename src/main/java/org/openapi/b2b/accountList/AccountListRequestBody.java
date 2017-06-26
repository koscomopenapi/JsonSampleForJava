package org.openapi.b2b.accountList;


public class AccountListRequestBody{
	private QueryParameter queryParameter;

	public AccountListRequestBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountListRequestBody(QueryParameter queryParameter) {
		super();
		this.queryParameter = queryParameter;
	}

	public QueryParameter getQueryParameter() {
		return queryParameter;
	}

	public void setQueryParameter(QueryParameter queryParameter) {
		this.queryParameter = queryParameter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((queryParameter == null) ? 0 : queryParameter.hashCode());
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
		AccountListRequestBody other = (AccountListRequestBody) obj;
		if (queryParameter == null) {
			if (other.queryParameter != null)
				return false;
		} else if (!queryParameter.equals(other.queryParameter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountListRequestBody [queryParameter=" + queryParameter + "]";
	}
	
}