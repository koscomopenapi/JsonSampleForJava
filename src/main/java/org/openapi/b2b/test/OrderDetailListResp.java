package org.openapi.b2b.test;

import org.openapi.b2b.common.CommonHeaderForResponse;
import org.openapi.b2b.common.IsinInfo;
import org.openapi.b2b.common.QueryResult;
import org.openapi.b2b.common.Resp;
import org.openapi.b2b.orderDetail.ExecList;
import org.openapi.b2b.orderDetail.OrderDetail;
import org.openapi.b2b.orderDetail.OrderDetailList;
import org.openapi.b2b.orderDetail.OrderDetailListResponse;
import org.openapi.b2b.orderDetail.OrderDetailListResponseBody;
import org.openapi.b2b.orderDetail.QueryParameter;

import com.google.gson.Gson;

public class OrderDetailListResp {
	public static void main(String[] args) {
		CommonHeaderForResponse commonHeader = new CommonHeaderForResponse();
		commonHeader.setReqIdPlatform("P0001-ABC-0001");
		commonHeader.setReqIdConsumer("Uberple-00001");
		commonHeader.setCertDn(null);
		commonHeader.setCi(null);
		
		OrderDetailListResponseBody orderDetailListResponseBody = new OrderDetailListResponseBody();
		
		QueryParameter queryParameter = new QueryParameter();
		queryParameter.setQrAssetType("EQTY");
		queryParameter.setQrSellBuyType("0");
		queryParameter.setQrAccNo("099240776543");
		queryParameter.setQrOrderDate("20170627");
		queryParameter.setQrIsinCode("KR0065300");
		queryParameter.setQrOrderNo(null);
		queryParameter.setCount(0);
		queryParameter.setPage("null");
		
		QueryResult queryResult = new QueryResult();
		queryResult.setTotalCnt(1);
		queryResult.setCount(0);
		queryResult.setPage("null");
		
		orderDetailListResponseBody.setQueryParameter(queryParameter);
		orderDetailListResponseBody.setQueryResult(queryResult);
		
		OrderDetailList orderDetailList = new OrderDetailList();
		
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setAccNo("099240776543");
		orderDetail.setAccName("이지선");
		orderDetail.setModifyType("0");
		orderDetail.setCancelType("0");
		orderDetail.setOrderNo(null);
		orderDetail.setOrgOrderNo(null);
		orderDetail.setSellBuyType("1");
		orderDetail.setOrderType(null);
		orderDetail.setExchange(null);
		orderDetail.setCrcyCode("USD");
		orderDetail.setOrderQty(300);
		orderDetail.setOrderPrice(116000);
		orderDetail.setExecSumQty(300);
		orderDetail.setOrderExecType(null);
		orderDetail.setCmsnType(null);
		orderDetail.setSettDays(1);
		orderDetail.setBuyQtyUnit(10);
		orderDetail.setSellQtyUnit(10);
		orderDetail.setOrderTime("2017062711125423");
		orderDetail.setOrderRejectReason(null);
		
		IsinInfo inIsinInfo = new IsinInfo();
		inIsinInfo.setIsinType("표준코드");
		inIsinInfo.setIsinCode("KR0065300");
		inIsinInfo.setIsinName("삼성생명");
		
		ExecList execList = new ExecList();
		execList.setExecQty(300);
		execList.setExecPrice(115500);
		execList.setExecNo(0);
		execList.setExecTime("2017062711125423");
		
		orderDetail.addIsinInfo(inIsinInfo);
		orderDetail.addExecList(execList);
		
		orderDetailList.addOrderDetail(orderDetail);
		
		Resp resp = new Resp();
		resp.setRespCode("200");
		resp.setRespMsg("OK");
		
		OrderDetailListResponse orderDetailListResponse = new OrderDetailListResponse();
		orderDetailListResponse.setCommonHeader(commonHeader);
		orderDetailListResponse.setorderDetailListResponseBody(orderDetailListResponseBody);
		orderDetailListResponse.setOrderDetailList(orderDetailList);
		orderDetailListResponse.setResp(resp);
		
		Gson gson = new Gson();
		String response = gson.toJson(orderDetailListResponse);
		System.out.println(response);
		
		
		
	}

}
