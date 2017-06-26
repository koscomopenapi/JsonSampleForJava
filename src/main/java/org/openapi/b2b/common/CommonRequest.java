package org.openapi.b2b.common;


public class CommonRequest {
	protected String ci;

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
		result = prime * result + ((ci == null) ? 0 : ci.hashCode());
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
		CommonRequest other = (CommonRequest) obj;
		if (ci == null) {
			if (other.ci != null)
				return false;
		} else if (!ci.equals(other.ci))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CommonRequest [ci=" + ci + "]";
	}
	
	
}
