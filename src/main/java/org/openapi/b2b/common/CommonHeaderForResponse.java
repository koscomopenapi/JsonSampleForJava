package org.openapi.b2b.common;

public class CommonHeaderForResponse {

	private String reqIdPlatform;
	private String reqIdConsumer;
	private String certDn;
	private String ci;
	public String getReqIdPlatform() {
		return reqIdPlatform;
	}
	public void setReqIdPlatform(String reqIdPlatform) {
		this.reqIdPlatform = reqIdPlatform;
	}
	public String getReqIdConsumer() {
		return reqIdConsumer;
	}
	public void setReqIdConsumer(String reqIdConsumer) {
		this.reqIdConsumer = reqIdConsumer;
	}
	public String getCertDn() {
		return certDn;
	}
	public void setCertDn(String certDn) {
		this.certDn = certDn;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certDn == null) ? 0 : certDn.hashCode());
		result = prime * result + ((ci == null) ? 0 : ci.hashCode());
		result = prime * result + ((reqIdConsumer == null) ? 0 : reqIdConsumer.hashCode());
		result = prime * result + ((reqIdPlatform == null) ? 0 : reqIdPlatform.hashCode());
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
		CommonHeaderForResponse other = (CommonHeaderForResponse) obj;
		if (certDn == null) {
			if (other.certDn != null)
				return false;
		} else if (!certDn.equals(other.certDn))
			return false;
		if (ci == null) {
			if (other.ci != null)
				return false;
		} else if (!ci.equals(other.ci))
			return false;
		if (reqIdConsumer == null) {
			if (other.reqIdConsumer != null)
				return false;
		} else if (!reqIdConsumer.equals(other.reqIdConsumer))
			return false;
		if (reqIdPlatform == null) {
			if (other.reqIdPlatform != null)
				return false;
		} else if (!reqIdPlatform.equals(other.reqIdPlatform))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CommonHeaderForResponse [reqIdPlatform=" + reqIdPlatform + ", reqIdConsumer=" + reqIdConsumer
				+ ", certDn=" + certDn + ", ci=" + ci + "]";
	}
	
	
}
