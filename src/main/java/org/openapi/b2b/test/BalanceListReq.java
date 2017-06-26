package org.openapi.b2b.test;

import org.openapi.b2b.balanceList.QueryParameter;
import org.openapi.b2b.balanceList.BalanceListRequest;
import org.openapi.b2b.balanceList.BalanceListRequestBody;
import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;

import com.google.gson.Gson;

public class BalanceListReq {

	public static void main(String[] args) {
		Partner partner = new Partner();
		partner.setComId("uberple");
		partner.setSrvId("SNEK");
		
		CommonHeaderForRequest commonHeader = new CommonHeaderForRequest();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		BalanceListRequestBody balanceListRequestBody = new BalanceListRequestBody();
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAccNo("40113387510");
		queryParameter.setQrAssetType("EQTY");
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		balanceListRequestBody.setQueryParameter(queryParameter);
		
		BalanceListRequest balanceListRequest = new BalanceListRequest();
		balanceListRequest.setBalanceListRequestBody(balanceListRequestBody);
		balanceListRequest.setCommonHeader(commonHeader);
		balanceListRequest.setPartner(partner);
		
		Gson gson = new Gson();
		String request = gson.toJson(balanceListRequest);
		System.out.println(request);
		
	}
}
