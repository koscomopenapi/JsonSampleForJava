package org.openapi.b2b.test;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.CostInfo;
import org.openapi.b2b.common.IsinInfo;
import org.openapi.b2b.common.QueryResult;
import org.openapi.b2b.common.Resp;
import org.openapi.b2b.tradeBook.QueryParameter;
import org.openapi.b2b.tradeBook.TradeBook;
import org.openapi.b2b.tradeBook.TradeBookList;
import org.openapi.b2b.tradeBook.TradeBookListResponse;
import org.openapi.b2b.tradeBook.TradeBookListResponseBody;

import com.google.gson.Gson;

public class TradeBookListResp {

	public static void main(String[] args) {
		CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		TradeBookListResponseBody tradeBookListResponseBody  = new TradeBookListResponseBody();
		
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAccNo("099240776543");
		queryParameter.setQrFromDate("20170621");
		queryParameter.setQrToDate("20170627");
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		QueryResult queryResult = new QueryResult();
		queryResult.setTotalCnt(0);
		queryResult.setCount(0);
		queryResult.setPage("null");
		
		tradeBookListResponseBody.setQueryParameter(queryParameter);
		tradeBookListResponseBody.setQueryResult(queryResult);
		
		TradeBookList tradeBookList = new TradeBookList();
		TradeBook tradeBook = new TradeBook();
		tradeBook.setAccNo("099240776543");
		tradeBook.setAccName("이지선");
		tradeBook.setTransDate("20170625");
		tradeBook.setTransType("BID");
		tradeBook.setChangeAmt(300000);
		tradeBook.setChangeQty(-10.0);
		tradeBook.setQty(270);
		tradeBook.setAmt(3300000);
		tradeBook.setExchange(null);
		tradeBook.setCrcyCode(null);
		tradeBook.setSummary(null);
		
		IsinInfo isinInfo = new IsinInfo();
		isinInfo.setIsinType("표준코드");
		isinInfo.setIsinName("삼성생명");
		isinInfo.setIsinCode("KR0065300");
		
		CostInfo costInfo = new CostInfo();
		costInfo.setCostName(null);
		costInfo.setCost(0);
		
		tradeBook.addIsinInfo(isinInfo);
		tradeBook.addCostInfo(costInfo);
		tradeBookList.addTradeBook(tradeBook);
		
		Resp resp = new Resp();
		resp.setRespCode("200");
		resp.setRespMsg("OK");
		
		TradeBookListResponse tradeBookListResponse = new TradeBookListResponse();
		tradeBookListResponse.setCommonHeader(commonHeader);
		tradeBookListResponse.setTradeBookListResponseBody(tradeBookListResponseBody);
		tradeBookListResponse.setTradeBookList(tradeBookList);
		tradeBookListResponse.setResp(resp);
		
		Gson gson = new Gson();
		String response = gson.toJson(tradeBookListResponse);
		System.out.println(response);
		
		
		
	}
}
