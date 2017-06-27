package org.openapi.b2b.test;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.CostInfo;
import org.openapi.b2b.common.IsinInfo;
import org.openapi.b2b.common.QueryResult;
import org.openapi.b2b.common.Resp;
import org.openapi.b2b.settleList.QueryParameter;
import org.openapi.b2b.settleList.SettleInfo;
import org.openapi.b2b.settleList.SettleList;
import org.openapi.b2b.settleList.SettleListResponse;
import org.openapi.b2b.settleList.SettleListResponseBody;

import com.google.gson.Gson;

public class SettleListResp {
	public static void main(String[] args) {
		CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		SettleListResponseBody settleListResponseBody = new SettleListResponseBody();
		
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAssetType("EQTY");
		queryParameter.setQrSellBuyType("0");
		queryParameter.setQrAccNo("099240776543");
		queryParameter.setQrOrderDate("20170627");
		queryParameter.setQrIsinCode("KR0065300");
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		QueryResult queryResult = new QueryResult();
		queryResult.setTotalCnt(1);
		queryResult.setCount(0);
		queryResult.setPage("null");
		
		settleListResponseBody.setQueryParameter(queryParameter);
		settleListResponseBody.setQueryResult(queryResult);
		
		SettleList settleList = new SettleList();
		
		SettleInfo settleInfo = new SettleInfo();
		settleInfo.setAccNo("099240776543");
		settleInfo.setAccName("이지선");
		settleInfo.setSellBuyType("1");
		settleInfo.setExchange("USD");
		settleInfo.setCrcyCode(null);
		settleInfo.setSettQty(300);
		settleInfo.setSettAmt(9000000);
		settleInfo.setTradeType(null);
		settleInfo.setLoanCreditAmt(360000);
		settleInfo.setLoanCreditDate("20170621");
		settleInfo.setSettDate("20170627");
		settleInfo.setCostTotal(0);
		
		IsinInfo isinInfo = new IsinInfo();
		isinInfo.setIsinType("표준코드");
		isinInfo.setIsinCode("KR0065300");
		isinInfo.setIsinName("삼성생명");
		
		CostInfo costInfo = new CostInfo();
		costInfo.setCostName(null);
		costInfo.setCost(0);
		
		settleInfo.addIsinInfo(isinInfo);
		settleInfo.addCostInfo(costInfo);
		
		settleList.addSettleInfo(settleInfo);
		
		Resp resp = new Resp();
		resp.setRespCode("200");
		resp.setRespMsg("OK");
		
		SettleListResponse settleListResponse = new SettleListResponse();
		settleListResponse.setCommonHeader(commonHeader);
		settleListResponse.setSettleListResponseBody(settleListResponseBody);
		settleListResponse.setSettleList(settleList);
		settleListResponse.setResp(resp);
		
		Gson gson = new Gson();
		String response = gson.toJson(settleListResponse);
		System.out.println(response);
		
		
	}

}
