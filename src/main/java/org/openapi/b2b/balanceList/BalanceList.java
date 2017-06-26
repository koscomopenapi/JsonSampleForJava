package org.openapi.b2b.balanceList;

import java.util.ArrayList;

import org.openapi.b2b.accountList.Account;

public class BalanceList {
	ArrayList<Balance> balance = new ArrayList<Balance>();
	
	 public void addBalance(Balance balance) {
	        this.balance.add(balance);
	 }
	

	public BalanceList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BalanceList(ArrayList<Balance> balance) {
		super();
		this.balance = balance;
	}

	public ArrayList<Balance> getBalance() {
		return balance;
	}

	public void setBalance(ArrayList<Balance> balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
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
		BalanceList other = (BalanceList) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BalanceList [balance=" + balance + "]";
	}
	
	
}