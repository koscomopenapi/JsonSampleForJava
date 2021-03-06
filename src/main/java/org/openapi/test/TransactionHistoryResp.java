/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;
import org.openapi.common.Response;
import org.openapi.transaction.QueryParams;
import org.openapi.transaction.QueryResult;
import org.openapi.transaction.TransList;
import org.openapi.transaction.Transaction;
import org.openapi.transaction.TransactionHistoryResponse;
import org.openapi.transaction.TransactionHistoryResponseBody;

/**
 *
 * @author heungjae
 */
public class TransactionHistoryResp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // CommonHeader
        ///////////////
        CommonHeader commonHeader = new CommonHeader();
        commonHeader.setReqIdPlatform("P0001-ABC-0001");
        commonHeader.setReqIdConsumer("Uberple-00001");
        commonHeader.setCertDn("cn=김흥재_0000033643,ou=KOSCOM,ou=LicensedCA,o=SignKorea,c=KR");
        commonHeader.setCi("834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22");

        PlatformFields platformField = new PlatformFields();
        platformField.setPortalId("khj932");
        platformField.setApiAccessToken("a308159b-2ab890c8de6");
        platformField.setApiAccessTokenLifetime("600");

        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("40113387510");
        accInfo.setVtAccNp("123214985324234");

        QueryResult queryResult = new QueryResult();
        queryResult.setTotalCnt(1);
        queryResult.setCount(1);
        queryResult.setPage("P12231112");

        QueryParams queryParameter = new QueryParams();
        queryParameter.setFromDate("20160103");
        queryParameter.setToDate("20160303");
        queryParameter.setIsinCode("KR7005930003");
        queryParameter.setSide("BID");
        queryParameter.setCount(0);
        queryParameter.setPage("null");

        TransactionHistoryResponseBody transactionHistoryResponseBody = new TransactionHistoryResponseBody();
        transactionHistoryResponseBody.setAccInfo(accInfo);
        transactionHistoryResponseBody.setQueryParameter(queryParameter);
        transactionHistoryResponseBody.setQueryResult(queryResult);

        TransList transactionList = new TransList();

        for (int idx = 1; idx < 6; idx++) {
            Transaction transaction = new Transaction();
            String isinCodeString = String.format("%04d", idx);
            transaction.setIsinCode("KR700593" + isinCodeString);
            String dateTail = String.format("%02d", idx);
            transaction.setTransDate("201602" + dateTail);
            transaction.setTransType("BID");
            transaction.setChangeAmt(1500000);
            transaction.setChangeQty(1);
            transaction.setQty(idx);
            transactionList.addTransaction(transaction);
        }

        ///////////////////////
        // Resp
        ///////
        Response resp = new Response();
        resp.setRespCode("200");
        resp.setRespMsg("OK");

        TransactionHistoryResponse transactionHistoryResponse = new TransactionHistoryResponse();
        transactionHistoryResponse.setCommonHeader(commonHeader);
        transactionHistoryResponse.setPlatformFields(platformField);
        transactionHistoryResponse.setTransactionHistoryResponseBody(transactionHistoryResponseBody);
        transactionHistoryResponse.setTransList(transactionList);

        Gson gson = new Gson();
        String response = gson.toJson(transactionHistoryResponse);
        System.out.println(response);
        System.out.println("Total Length = [" + response.length() + "]");
    }

}
