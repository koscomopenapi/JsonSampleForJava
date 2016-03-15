/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.account.VirtualAccount;
import org.openapi.account.VirtualAccountList;
import org.openapi.account.VirtualAccountRequest;
import org.openapi.account.VirtualAccountRequestBox;
import org.openapi.common.CommonHeader;

/**
 *
 * @author heungjae
 */
public class VirtualAccountReq {

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

        VirtualAccountList virtualAccountList = new VirtualAccountList();
        
        VirtualAccount virtualAccount = new VirtualAccount();
        virtualAccount.setTrCode("REQ");
        virtualAccount.setRealAccNo("001-99-23122221");
        virtualAccount.setVtAccNo("null");
        virtualAccount.setVtAccAlias("유가증권투자용");
        
        virtualAccountList.addVirtualAccount(virtualAccount);

        VirtualAccountRequest virtualAccountRequest = new VirtualAccountRequest();
        virtualAccountRequest.setCommonHeader(commonHeader);
        virtualAccountRequest.setBody(virtualAccountList);

        VirtualAccountRequestBox virtualAccountRequestBox = new VirtualAccountRequestBox(virtualAccountRequest);
        
        
        Gson gson = new Gson();
        String response = gson.toJson(virtualAccountRequestBox);
        System.out.println(response);
        System.out.println("Total Length = [" + response.length() + "]");
    }

}
