package org.openapi.b2b.test;

import org.openapi.b2b.accountList.Account;
import org.openapi.b2b.accountList.AccountList;
import org.openapi.b2b.accountList.AccountListResponse;
import org.openapi.b2b.accountList.AccountListResponseBody;
import org.openapi.b2b.accountList.QueryParameter;
import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.QueryResult;
import org.openapi.b2b.common.Resp;

import com.google.gson.Gson;

public class AccountListResp {

	public static void main(String[] args) {
		CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		AccountListResponseBody accountListResponseBody = new AccountListResponseBody();
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setCount(0);
		queryParameter.setPage(null);
		QueryResult queryResult = new QueryResult();
		queryResult.setTotalCnt(2);
		queryResult.setCount(0);
		queryResult.setPage("null");
		
		accountListResponseBody.setQueryParameter(queryParameter);
		accountListResponseBody.setQueryResult(queryResult);
		
		AccountList accountList = new AccountList();
		Account account1 = new Account();
		account1.setAccNo("40113387510");
		account1.setAccName("이지선");
		account1.setVirtualAccNo("123214985324234");
		account1.setContractStatus("0");
		
		Account account2 = new Account();
		account2.setAccNo("40113387523");
		account2.setAccName("이지선");
		account2.setVirtualAccNo("123214985324894");
		account2.setContractStatus("0");
		
		accountList.addAccount(account1);
		accountList.addAccount(account2);
				
		Resp resp = new Resp();
		resp.setRespCode("200");
		resp.setRespMsg("OK");
		
		AccountListResponse accountListResponse = new AccountListResponse();
		accountListResponse.setCommonHeader(commonHeader);
		accountListResponse.setAccountList(accountList);
		accountListResponse.setAccountListResponseBody(accountListResponseBody);
		accountListResponse.setResp(resp);
		
		Gson gson = new Gson();
		String request = gson.toJson(accountListResponse);
		System.out.println(request);		
		
	}
}
