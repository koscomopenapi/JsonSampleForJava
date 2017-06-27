package org.openapi.b2b.test;

import org.openapi.b2b.balanceList.AccInfo;
import org.openapi.b2b.balanceList.Balance;
import org.openapi.b2b.balanceList.BalanceList;
import org.openapi.b2b.balanceList.BalanceListResponse;
import org.openapi.b2b.balanceList.BalanceListResponseBody;
import org.openapi.b2b.balanceList.CashBalInfo;
import org.openapi.b2b.balanceList.QueryParameter;
import org.openapi.b2b.balanceList.SecuritiesBalInfo;
import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.IsinInfo;
import org.openapi.b2b.common.QueryResult;
import org.openapi.b2b.common.Resp;

import com.google.gson.Gson;

public class BalanceListResp {

	public static void main(String[] args) {
		CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		BalanceListResponseBody balanceListResponseBody = new BalanceListResponseBody();
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAccNo("40113387510");
		queryParameter.setQrAssetType("EQTY");
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		QueryResult queryResult = new QueryResult();
		queryResult.setTotalCnt(1);
		queryResult.setCount(0);
		queryResult.setPage("null");
		
		balanceListResponseBody.setQueryParameter(queryParameter);
		balanceListResponseBody.setQueryResult(queryResult);
		
		BalanceList balanceList = new BalanceList();
		
		Balance balance = new Balance();
		
		AccInfo accInfo = new AccInfo();
		accInfo.setAccNo("40113387510");
		accInfo.setAccName("이지선");
		
		CashBalInfo cashBalInfo = new CashBalInfo();
		cashBalInfo.setCashBalance(3000000);
		cashBalInfo.setMargin(2500000);
		cashBalInfo.setSubstitute(500000000);
		cashBalInfo.setReceivable(0);
		cashBalInfo.setTotCreditAmt(0);
		cashBalInfo.setTotLoanAmt(0);
		cashBalInfo.setValAtCur(5500000);
		cashBalInfo.setCrcyCode(null);
		cashBalInfo.setCashAvWithdraw(500000);
		
		SecuritiesBalInfo securitiesBalInfo = new SecuritiesBalInfo();
		securitiesBalInfo.setAssetType("KSP");
		securitiesBalInfo.setExchange(null);
		securitiesBalInfo.setCrcyCode(null);
		securitiesBalInfo.setLoanCreditType("자기융자");
		securitiesBalInfo.setLoanCreditAmt(3600000);
		securitiesBalInfo.setQty(300);
		securitiesBalInfo.setValAtTrade(9000000);
		securitiesBalInfo.setValAtCur(8700000);
		securitiesBalInfo.setProLoss(-300000);
		securitiesBalInfo.setEarningRate(-0.10);
		securitiesBalInfo.setLastBuyDate("20170621");
		securitiesBalInfo.setMaturity("20170921");
		securitiesBalInfo.setForeignDeposit(0);
		securitiesBalInfo.setWonDeposit(0);
		securitiesBalInfo.setCurrencyRate(0);
		
		IsinInfo isinInfo1= new IsinInfo();
		isinInfo1.setIsinType("표준코드");
		isinInfo1.setIsinCode("KR0065300");
		isinInfo1.setIsinName("삼성생명");
		
		IsinInfo isinInfo2 = new IsinInfo();
		isinInfo2.setIsinType("단축코드");
		isinInfo2.setIsinCode("A06530");
		isinInfo2.setIsinName("삼성생명");
				
		securitiesBalInfo.addIsinInfo(isinInfo1);
		securitiesBalInfo.addIsinInfo(isinInfo2);
		
		balance.setAccInfo(accInfo);
		balance.addCashBalInfo(cashBalInfo);
		balance.addSecuritiesBalInfo(securitiesBalInfo);
		
		balanceList.addBalance(balance);
		
		Resp resp = new Resp();
		resp.setRespCode("200");
		resp.setRespMsg("OK");
		
		BalanceListResponse balanceListResponse = new BalanceListResponse();
		balanceListResponse.setCommonHeader(commonHeader);
		balanceListResponse.setBalanceListResponseBody(balanceListResponseBody);
		balanceListResponse.setBalanceList(balanceList);
		balanceListResponse.setResp(resp);
		
		Gson gson = new Gson(); 
		String request = gson.toJson(balanceListResponse);
		System.out.println(request);
		
		
	}
}
