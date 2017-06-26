package org.openapi.b2b.settleList;

public class QueryParameter {
	private String qrAssetType;
	private String qrSellBuyType;
	private String qrAccNo;
	private String qrOrderDate;
	private String qrIsinCode;
	private int count;
	private String page;
	public QueryParameter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryParameter(String qrAssetType, String qrSellBuyType, String qrAccNo, String qrOrderDate,
			String qrIsinCode, int count, String page) {
		super();
		this.qrAssetType = qrAssetType;
		this.qrSellBuyType = qrSellBuyType;
		this.qrAccNo = qrAccNo;
		this.qrOrderDate = qrOrderDate;
		this.qrIsinCode = qrIsinCode;
		this.count = count;
		this.page = page;
	}
	public String getQrAssetType() {
		return qrAssetType;
	}
	public void setQrAssetType(String qrAssetType) {
		this.qrAssetType = qrAssetType;
	}
	public String getQrSellBuyType() {
		return qrSellBuyType;
	}
	public void setQrSellBuyType(String qrSellBuyType) {
		this.qrSellBuyType = qrSellBuyType;
	}
	public String getQrAccNo() {
		return qrAccNo;
	}
	public void setQrAccNo(String qrAccNo) {
		this.qrAccNo = qrAccNo;
	}
	public String getQrOrderDate() {
		return qrOrderDate;
	}
	public void setQrOrderDate(String qrOrderDate) {
		this.qrOrderDate = qrOrderDate;
	}
	public String getQrIsinCode() {
		return qrIsinCode;
	}
	public void setQrIsinCode(String qrIsinCode) {
		this.qrIsinCode = qrIsinCode;
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
		result = prime * result + ((qrIsinCode == null) ? 0 : qrIsinCode.hashCode());
		result = prime * result + ((qrOrderDate == null) ? 0 : qrOrderDate.hashCode());
		result = prime * result + ((qrSellBuyType == null) ? 0 : qrSellBuyType.hashCode());
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
		if (qrIsinCode == null) {
			if (other.qrIsinCode != null)
				return false;
		} else if (!qrIsinCode.equals(other.qrIsinCode))
			return false;
		if (qrOrderDate == null) {
			if (other.qrOrderDate != null)
				return false;
		} else if (!qrOrderDate.equals(other.qrOrderDate))
			return false;
		if (qrSellBuyType == null) {
			if (other.qrSellBuyType != null)
				return false;
		} else if (!qrSellBuyType.equals(other.qrSellBuyType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QueryParameter [qrAssetType=" + qrAssetType + ", qrSellBuyType=" + qrSellBuyType + ", qrAccNo="
				+ qrAccNo + ", qrOrderDate=" + qrOrderDate + ", qrIsinCode=" + qrIsinCode + ", count=" + count
				+ ", page=" + page + "]";
	}

	
}