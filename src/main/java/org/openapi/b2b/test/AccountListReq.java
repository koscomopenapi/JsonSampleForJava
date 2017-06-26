package org.openapi.b2b.test;

import org.openapi.b2b.accountList.AccountListRequest;
import org.openapi.b2b.accountList.AccountListRequestBody;
import org.openapi.b2b.accountList.QueryParameter;
import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;

import com.google.gson.Gson;

public class AccountListReq {
	public static void main(String[] args) {
		Partner partner = new Partner();
		partner.setComId("uberple");
		partner.setSrvId("SNEK");
		
		CommonHeaderForRequest commonHeader = new CommonHeaderForRequest();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		AccountListRequestBody accountListRequestBody = new AccountListRequestBody();
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		accountListRequestBody.setQueryParameter(queryParameter);
		
		AccountListRequest accountListRequest = new AccountListRequest();
		accountListRequest.setAccountListRequestBody(accountListRequestBody);
		accountListRequest.setPartner(partner);
		accountListRequest.setCommonHeader(commonHeader);
		
		Gson gson = new Gson();
		String request = gson.toJson(accountListRequest);
		System.out.println(request);
		
	}

}
