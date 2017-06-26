package org.openapi.b2b.accountList;

public class QueryParameter{
	private int count;
	private String page;
	
	
	public QueryParameter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryParameter(int count, String page) {
		super();
		this.count = count;
		this.page = page;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((page == null) ? 0 : page.hashCode());
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
		QueryParameter other = (QueryParameter) obj;
		if (count != other.count)
			return false;
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QueryParameter [count=" + count + ", page=" + page + "]";
	}
	
	
}