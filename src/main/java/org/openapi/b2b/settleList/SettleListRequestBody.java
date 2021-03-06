package org.openapi.b2b.settleList;

import org.openapi.b2b.common.QueryResult;

public class SettleListRequestBody {
	private QueryParameter queryParameter;
	private QueryResult queryResult;
	public SettleListRequestBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SettleListRequestBody(QueryParameter queryParameter, QueryResult queryResult) {
		super();
		this.queryParameter = queryParameter;
		this.queryResult = queryResult;
	}
	public QueryParameter getQueryParameter() {
		return queryParameter;
	}
	public void setQueryParameter(QueryParameter queryParameter) {
		this.queryParameter = queryParameter;
	}
	public QueryResult getQueryResult() {
		return queryResult;
	}
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((queryParameter == null) ? 0 : queryParameter.hashCode());
		result = prime * result + ((queryResult == null) ? 0 : queryResult.hashCode());
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
		SettleListRequestBody other = (SettleListRequestBody) obj;
		if (queryParameter == null) {
			if (other.queryParameter != null)
				return false;
		} else if (!queryParameter.equals(other.queryParameter))
			return false;
		if (queryResult == null) {
			if (other.queryResult != null)
				return false;
		} else if (!queryResult.equals(other.queryResult))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SettleListRequestBody [queryParameter=" + queryParameter + ", queryResult=" + queryResult + "]";
	}
	
	
}