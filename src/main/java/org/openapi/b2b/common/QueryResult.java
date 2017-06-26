package org.openapi.b2b.common;


public class QueryResult{
	private int totalCnt;
	private int count;
	private String page;
	public int getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
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
		result = prime * result + totalCnt;
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
		QueryResult other = (QueryResult) obj;
		if (count != other.count)
			return false;
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		if (totalCnt != other.totalCnt)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QueryResult [totalCnt=" + totalCnt + ", count=" + count + ", page=" + page + "]";
	}
	
	
}