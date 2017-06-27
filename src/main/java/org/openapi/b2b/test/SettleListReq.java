package org.openapi.b2b.test;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;
import org.openapi.b2b.settleList.QueryParameter;
import org.openapi.b2b.settleList.SettleListRequest;
import org.openapi.b2b.settleList.SettleListRequestBody;

import com.google.gson.Gson;

public class SettleListReq {

	public static void main(String[] args) {
		Partner partner = new Partner();
		partner.setComId("uberple");
		partner.setSrvId("SNEK");
		
		CommonHeaderForRequest commonHeader = new CommonHeaderForRequest();
		commonHeader.setReqIdConsumer("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		SettleListRequestBody settleListRequestBody = new SettleListRequestBody();
		
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAssetType("EQTY");
		queryParameter.setQrSellBuyType("0");
		queryParameter.setQrAccNo("099240776543");
		queryParameter.setQrOrderDate("20170627");
		queryParameter.setQrIsinCode("KR0065300");
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		settleListRequestBody.setQueryParameter(queryParameter);
		
		SettleListRequest settleListRequest = new SettleListRequest();
		settleListRequest.setPartner(partner);
		settleListRequest.setCommonHeader(commonHeader);
		settleListRequest.setSettleListRequestBody(settleListRequestBody);
		
		Gson gson = new Gson();
		String request = gson.toJson(settleListRequest);
		System.out.println(request);
		
	}
}
