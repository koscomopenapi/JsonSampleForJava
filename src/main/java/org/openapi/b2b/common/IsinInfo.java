package org.openapi.b2b.common;

public class IsinInfo {

	private String isinType;
	private String isinCode;
	private String isinName;
	public String getIsinType() {
		return isinType;
	}
	public void setIsinType(String isinType) {
		this.isinType = isinType;
	}
	public String getIsinCode() {
		return isinCode;
	}
	public void setIsinCode(String isinCode) {
		this.isinCode = isinCode;
	}
	public String getIsinName() {
		return isinName;
	}
	public void setIsinName(String isinName) {
		this.isinName = isinName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isinCode == null) ? 0 : isinCode.hashCode());
		result = prime * result + ((isinName == null) ? 0 : isinName.hashCode());
		result = prime * result + ((isinType == null) ? 0 : isinType.hashCode());
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
		IsinInfo other = (IsinInfo) obj;
		if (isinCode == null) {
			if (other.isinCode != null)
				return false;
		} else if (!isinCode.equals(other.isinCode))
			return false;
		if (isinName == null) {
			if (other.isinName != null)
				return false;
		} else if (!isinName.equals(other.isinName))
			return false;
		if (isinType == null) {
			if (other.isinType != null)
				return false;
		} else if (!isinType.equals(other.isinType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "IsinInfo [isinType=" + isinType + ", isinCode=" + isinCode + ", isinName=" + isinName + "]";
	}
	
	
}
