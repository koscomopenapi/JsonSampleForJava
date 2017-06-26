package org.openapi.b2b.accountList;

public class Account {
	private String accNo;
	private String accName;
	private String virtualAccNo;
	private String contractStatus;
	
	public Account() {
		
	}
		
	public Account(String accNo, String accName, String virtualAccNo, String contractStatus) {
		this.accNo = accNo;
		this.accName = accName;
		this.virtualAccNo = virtualAccNo;
		this.contractStatus = contractStatus;
	}

	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getVirtualAccNo() {
		return virtualAccNo;
	}
	public void setVirtualAccNo(String virtualAccNo) {
		this.virtualAccNo = virtualAccNo;
	}
	public String getContractStatus() {
		return contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accName == null) ? 0 : accName.hashCode());
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		result = prime * result + ((contractStatus == null) ? 0 : contractStatus.hashCode());
		result = prime * result + ((virtualAccNo == null) ? 0 : virtualAccNo.hashCode());
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
		Account other = (Account) obj;
		if (accName == null) {
			if (other.accName != null)
				return false;
		} else if (!accName.equals(other.accName))
			return false;
		if (accNo == null) {
			if (other.accNo != null)
				return false;
		} else if (!accNo.equals(other.accNo))
			return false;
		if (contractStatus == null) {
			if (other.contractStatus != null)
				return false;
		} else if (!contractStatus.equals(other.contractStatus))
			return false;
		if (virtualAccNo == null) {
			if (other.virtualAccNo != null)
				return false;
		} else if (!virtualAccNo.equals(other.virtualAccNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", virtualAccNo=" + virtualAccNo
				+ ", contractStatus=" + contractStatus + "]";
	}
	
}
