package org.openapi.b2b.accountList;

import java.util.ArrayList;

public class AccountList {
	ArrayList<Account> account = new ArrayList<Account>();
	
	public AccountList() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public AccountList(ArrayList<Account> account) {
		super();
		this.account = account;
	}

	public void addAccount(Account account) {
        this.account.add(account);
	}
	
	public ArrayList<Account> getAccount() {
		return account;
	}


	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountList other = (AccountList) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		return result;
	}


	@Override
	public String toString() {
		return "AccountList [account=" + account + "]";
	}
	
	
	
}
