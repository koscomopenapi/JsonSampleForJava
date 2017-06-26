package org.openapi.b2b.common;


public class Partner {
	private String comId;
	private String srvId;
	public String getComId() {
		return comId;
	}
	public void setComId(String comId) {
		this.comId = comId;
	}
	public String getSrvId() {
		return srvId;
	}
	public void setSrvId(String srvId) {
		this.srvId = srvId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comId == null) ? 0 : comId.hashCode());
		result = prime * result + ((srvId == null) ? 0 : srvId.hashCode());
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
		Partner other = (Partner) obj;
		if (comId == null) {
			if (other.comId != null)
				return false;
		} else if (!comId.equals(other.comId))
			return false;
		if (srvId == null) {
			if (other.srvId != null)
				return false;
		} else if (!srvId.equals(other.srvId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Partner [comId=" + comId + ", srvId=" + srvId + "]";
	}
	
	
}
