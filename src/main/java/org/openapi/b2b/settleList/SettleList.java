package org.openapi.b2b.settleList;

import java.util.ArrayList;

import org.openapi.b2b.accountList.Account;

public class SettleList {
	ArrayList<SettleInfo> settleInfo = new ArrayList<SettleInfo>();
	
	public void addSettleInfo(SettleInfo settleInfo) {
        this.settleInfo.add(settleInfo);
	}

	public SettleList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SettleList(ArrayList<SettleInfo> settleInfo) {
		super();
		this.settleInfo = settleInfo;
	}

	public ArrayList<SettleInfo> getSettleInfo() {
		return settleInfo;
	}

	public void setSettleInfo(ArrayList<SettleInfo> settleInfo) {
		this.settleInfo = settleInfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((settleInfo == null) ? 0 : settleInfo.hashCode());
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
		SettleList other = (SettleList) obj;
		if (settleInfo == null) {
			if (other.settleInfo != null)
				return false;
		} else if (!settleInfo.equals(other.settleInfo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SettleList [settleInfo=" + settleInfo + "]";
	}
	
	
}