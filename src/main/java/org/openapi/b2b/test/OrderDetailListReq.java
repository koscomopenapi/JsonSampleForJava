package org.openapi.b2b.test;

import org.openapi.b2b.common.CommonHeaderForRequest;
import org.openapi.b2b.common.Partner;
import org.openapi.b2b.orderDetail.OrderDetailListRequest;
import org.openapi.b2b.orderDetail.OrderDetailListRequestBody;
import org.openapi.b2b.orderDetail.QueryParameter;

import com.google.gson.Gson;

public class OrderDetailListReq {
	public static void main(String[] args) {
		Partner partner = new Partner();
		partner.setComId("uberple");
		partner.setSrvId("SNEK");
		
		CommonHeaderForRequest commonHeader = new CommonHeaderForRequest();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		OrderDetailListRequestBody orderDetailListRequestBody = new OrderDetailListRequestBody();
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAssetType("EQTY");
		queryParameter.setQrSellBuyType("0");
		queryParameter.setQrAccNo("099240776543");
		queryParameter.setQrOrderDate("20170627");
		queryParameter.setQrIsinCode("KR0065300");
		queryParameter.setQrOrderNo(null);
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		orderDetailListRequestBody.setQueryParameter(queryParameter);
		
		OrderDetailListRequest orderDetailListRequest = new OrderDetailListRequest();
		
		orderDetailListRequest.setPartner(partner);
		orderDetailListRequest.setCommonHeader(commonHeader);
		orderDetailListRequest.setorderDetailListRequestBody(orderDetailListRequestBody);
		
		Gson gson = new Gson();
		String request = gson.toJson(orderDetailListRequest);
		System.out.println(request);		
		
	}
}
