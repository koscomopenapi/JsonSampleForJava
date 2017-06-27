package org.openapi.b2b.test;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;
import org.openapi.b2b.tradeBook.QueryParameter;
import org.openapi.b2b.tradeBook.TradeBookListRequest;
import org.openapi.b2b.tradeBook.TradeBookListRequestBody;

import com.google.gson.Gson;

public class TradeBookListReq {
	public static void main(String[] args) {
		Partner partner = new Partner();
		partner.setComId("uberple");
		partner.setSrvId("SNEK");
		
		CommonHeaderForRequest commonHeader = new CommonHeaderForRequest();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		TradeBookListRequestBody tradeBookListRequestBody = new TradeBookListRequestBody();
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAccNo("099240776543");
		queryParameter.setQrFromDate("20170621");
		queryParameter.setQrToDate("20170627");
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		tradeBookListRequestBody.setQueryParameter(queryParameter);
		
		TradeBookListRequest tradeBookListRequest = new TradeBookListRequest();
		tradeBookListRequest.setCommonHeader(commonHeader);
		tradeBookListRequest.setPartner(partner);
		tradeBookListRequest.setTradeBookListRequestBody(tradeBookListRequestBody);
		
		Gson gson = new Gson();
		String request = gson.toJson(tradeBookListRequest);
		System.out.println(request);
		
	}

}
