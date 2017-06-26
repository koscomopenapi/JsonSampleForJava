package org.openapi.b2b.tradeBook;

import java.util.ArrayList;
import java.util.List;

import org.openapi.b2b.settleList.SettleInfo;

public class TradeBookList {
	
	private ArrayList<TradeBook> tradeBook = new ArrayList<TradeBook>();
	
	public void addTradeBook(TradeBook tradeBook) {
        this.tradeBook.add(tradeBook);
	}

	public TradeBookList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradeBookList(ArrayList<TradeBook> tradeBook) {
		super();
		this.tradeBook = tradeBook;
	}

	public ArrayList<TradeBook> getTradeBook() {
		return tradeBook;
	}

	public void setTradeBook(ArrayList<TradeBook> tradeBook) {
		this.tradeBook = tradeBook;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tradeBook == null) ? 0 : tradeBook.hashCode());
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
		TradeBookList other = (TradeBookList) obj;
		if (tradeBook == null) {
			if (other.tradeBook != null)
				return false;
		} else if (!tradeBook.equals(other.tradeBook))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TradeBookList [tradeBook=" + tradeBook + "]";
	}
	
	

}
