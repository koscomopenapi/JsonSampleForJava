package org.openapi.b2b.balanceList;

import java.util.ArrayList;

public class Balance {
	private AccInfo accInfo = new AccInfo();
	private ArrayList<CashBalInfo> cachBalInfo = new ArrayList<CashBalInfo>();
	private ArrayList<SecuritiesBalInfo> securitiesBalInfo = new ArrayList<SecuritiesBalInfo>();
	
	 public void addCashBalInfo(CashBalInfo cachBalInfo) {
	        this.cachBalInfo.add(cachBalInfo);
	 }
	 public void addSecuritiesBalInfo(SecuritiesBalInfo securitiesBalInfo) {
	        this.securitiesBalInfo.add(securitiesBalInfo);
	 }
	
	public Balance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Balance(AccInfo accInfo, ArrayList<CashBalInfo> cachBalInfo,
			ArrayList<SecuritiesBalInfo> securitiesBalInfo) {
		super();
		this.accInfo = accInfo;
		this.cachBalInfo = cachBalInfo;
		this.securitiesBalInfo = securitiesBalInfo;
	}
	public AccInfo getAccInfo() {
		return accInfo;
	}
	public void setAccInfo(AccInfo accInfo) {
		this.accInfo = accInfo;
	}
	public ArrayList<CashBalInfo> getCachBalInfo() {
		return cachBalInfo;
	}
	public void setCachBalInfo(ArrayList<CashBalInfo> cachBalInfo) {
		this.cachBalInfo = cachBalInfo;
	}
	public ArrayList<SecuritiesBalInfo> getSecuritiesBalInfo() {
		return securitiesBalInfo;
	}
	public void setSecuritiesBalInfo(ArrayList<SecuritiesBalInfo> securitiesBalInfo) {
		this.securitiesBalInfo = securitiesBalInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accInfo == null) ? 0 : accInfo.hashCode());
		result = prime * result + ((cachBalInfo == null) ? 0 : cachBalInfo.hashCode());
		result = prime * result + ((securitiesBalInfo == null) ? 0 : securitiesBalInfo.hashCode());
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
		Balance other = (Balance) obj;
		if (accInfo == null) {
			if (other.accInfo != null)
				return false;
		} else if (!accInfo.equals(other.accInfo))
			return false;
		if (cachBalInfo == null) {
			if (other.cachBalInfo != null)
				return false;
		} else if (!cachBalInfo.equals(other.cachBalInfo))
			return false;
		if (securitiesBalInfo == null) {
			if (other.securitiesBalInfo != null)
				return false;
		} else if (!securitiesBalInfo.equals(other.securitiesBalInfo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Balance [accInfo=" + accInfo + ", cachBalInfo=" + cachBalInfo + ", securitiesBalInfo="
				+ securitiesBalInfo + "]";
	}
	
	
}
