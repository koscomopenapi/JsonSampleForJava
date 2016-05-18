/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.account.AccountList;
import org.openapi.account.Account;
import org.openapi.account.RealAccountListResponse;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class RealAccountListResp {

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

        AccountList accList = new AccountList();

        for (int idx = 0; idx < 3; idx++) {
            Account account = new Account();
            String subAccountNo = String.format("%04d", idx);
            account.setAccNo("1239" + subAccountNo);
            account.setAccType("BRK");
            accList.addAccount(account);
        }

        ///////////////////////
        // Resp
        ///////
        Response resp = new Response();
        resp.setRespCode("200");
        resp.setRespMsg("OK");

        RealAccountListResponse realAccountListResponse = new RealAccountListResponse();
        realAccountListResponse.setCommonHeader(commonHeader);
        realAccountListResponse.setAccList(accList);
        realAccountListResponse.setResp(resp);

        Gson gson = new Gson();
        String response = gson.toJson(realAccountListResponse);
        System.out.println(response);
        System.out.println("Total Length = [" + response.length() + "]");
    }

}
