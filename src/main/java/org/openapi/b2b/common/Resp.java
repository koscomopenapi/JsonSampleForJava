package org.openapi.b2b.common;

public class Resp {
	private String respCode="200";
	private String respMsg="OK";
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((respCode == null) ? 0 : respCode.hashCode());
		result = prime * result + ((respMsg == null) ? 0 : respMsg.hashCode());
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
		Resp other = (Resp) obj;
		if (respCode == null) {
			if (other.respCode != null)
				return false;
		} else if (!respCode.equals(other.respCode))
			return false;
		if (respMsg == null) {
			if (other.respMsg != null)
				return false;
		} else if (!respMsg.equals(other.respMsg))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Resp [respCode=" + respCode + ", respMsg=" + respMsg + "]";
	}

	
}
