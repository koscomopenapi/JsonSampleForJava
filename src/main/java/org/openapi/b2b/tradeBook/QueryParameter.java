package org.openapi.b2b.tradeBook;

public class QueryParameter{
	private String qrAccNo;
	private String qrFromDate;
	private String qrToDate;
	private int count;
	private String page;
	public QueryParameter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryParameter(String qrAccNo, String qrFromDate, String qrToDate, int count, String page) {
		super();
		this.qrAccNo = qrAccNo;
		this.qrFromDate = qrFromDate;
		this.qrToDate = qrToDate;
		this.count = count;
		this.page = page;
	}
	public String getQrAccNo() {
		return qrAccNo;
	}
	public void setQrAccNo(String qrAccNo) {
		this.qrAccNo = qrAccNo;
	}
	public String getQrFromDate() {
		return qrFromDate;
	}
	public void setQrFromDate(String qrFromDate) {
		this.qrFromDate = qrFromDate;
	}
	public String getQrToDate() {
		return qrToDate;
	}
	public void setQrToDate(String qrToDate) {
		this.qrToDate = qrToDate;
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
		result = prime * result + ((qrAccNo == null) ? 0 : qrAccNo.hashCode());
		result = prime * result + ((qrFromDate == null) ? 0 : qrFromDate.hashCode());
		result = prime * result + ((qrToDate == null) ? 0 : qrToDate.hashCode());
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
		if (qrAccNo == null) {
			if (other.qrAccNo != null)
				return false;
		} else if (!qrAccNo.equals(other.qrAccNo))
			return false;
		if (qrFromDate == null) {
			if (other.qrFromDate != null)
				return false;
		} else if (!qrFromDate.equals(other.qrFromDate))
			return false;
		if (qrToDate == null) {
			if (other.qrToDate != null)
				return false;
		} else if (!qrToDate.equals(other.qrToDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QueryParameter [qrAccNo=" + qrAccNo + ", qrFromDate=" + qrFromDate + ", qrToDate=" + qrToDate
				+ ", count=" + count + ", page=" + page + "]";
	}
	
	
}