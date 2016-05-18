/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;
import org.openapi.transaction.QueryParameter;
import org.openapi.transaction.TransactionHistoryRequest;
import org.openapi.transaction.TransactionHistoryRequestBody;

/**
 *
 * @author heungjae
 */
public class TransactionHistoryReq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Partner partner = new Partner();
        partner.setComId("uberple");
        partner.setSrvId("SNEK");

        CommonHeader commonHeader = new CommonHeader();
        commonHeader.setReqIdPlatform("P0001-ABC-0001");
        commonHeader.setReqIdConsumer("Uberple-00001");
        commonHeader.setCertDn("cn=김흥재_0000033643,ou=KOSCOM,ou=LicensedCA,o=SignKorea,c=KR");
        commonHeader.setCi("834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22");

        DevInfo devInfo = new DevInfo();
        devInfo.setIpAddr("192168001010");
        devInfo.setMacAddr("7054D27EE247");

        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("001-01-992323232");
        accInfo.setVtAccNp("123214985324234");

        QueryParameter queryParameter = new QueryParameter();
        queryParameter.setFromDate("2016-01-03");
        queryParameter.setToDate("2016-03-01");
        queryParameter.setIsinCode("KR7005930003");
        queryParameter.setSide("BID");
        queryParameter.setCount(50);
        queryParameter.setPage(0);

        TransactionHistoryRequestBody transactionHistoryRequestBody = new TransactionHistoryRequestBody();
        transactionHistoryRequestBody.setQueryParameter(queryParameter);

        TransactionHistoryRequest TransactionHistoryRequest = new TransactionHistoryRequest();
        TransactionHistoryRequest.setPartner(partner);
        TransactionHistoryRequest.setDevInfo(devInfo);
        TransactionHistoryRequest.setCommonHeader(commonHeader);
        TransactionHistoryRequest.setAccInfo(accInfo);
        TransactionHistoryRequest.setBody(transactionHistoryRequestBody);

        Gson gson = new Gson();
        String request = gson.toJson(TransactionHistoryRequest);
        System.out.println(request);
        System.out.println("Total Length = [" + request.length() + "]");
    }

}
