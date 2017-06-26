package org.openapi.b2b.balanceList;

public class QueryParameter {
	private String qrAssetType;
	private String qrAccNo;
	private int count;
	private String page;
	
	public QueryParameter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryParameter(String qrAssetType, String qrAccNo, int count, String page) {
		super();
		this.qrAssetType = qrAssetType;
		this.qrAccNo = qrAccNo;
		this.count = count;
		this.page = page;
	}
	public String getQrAssetType() {
		return qrAssetType;
	}
	public void setQrAssetType(String qrAssetType) {
		this.qrAssetType = qrAssetType;
	}
	public String getQrAccNo() {
		return qrAccNo;
	}
	public void setQrAccNo(String qrAccNo) {
		this.qrAccNo = qrAccNo;
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
		result = prime * result + ((qrAssetType == null) ? 0 : qrAssetType.hashCode());
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
		if (qrAssetType == null) {
			if (other.qrAssetType != null)
				return false;
		} else if (!qrAssetType.equals(other.qrAssetType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QueryParameter [qrAssetType=" + qrAssetType + ", qrAccNo=" + qrAccNo + ", count=" + count + ", page="
				+ page + "]";
	}
	
	

}