package org.openapi.b2b.orderDetail;

public class OrderDetailListResponseBody {
	private QueryParameter queryParameter;

	public OrderDetailListResponseBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetailListResponseBody(QueryParameter queryParameter) {
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
		OrderDetailListResponseBody other = (OrderDetailListResponseBody) obj;
		if (queryParameter == null) {
			if (other.queryParameter != null)
				return false;
		} else if (!queryParameter.equals(other.queryParameter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderDetailListResponseBody [queryParameter=" + queryParameter + "]";
	}
	
	
	
}