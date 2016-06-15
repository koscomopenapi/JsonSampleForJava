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
import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;

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
        commonHeader.setCertDn("cn=오픈테스트,ou=HTS,ou=대신,ou=증권,o=SignKorea,c=KR");
        commonHeader.setCi("834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22");
        
        PlatformFields platformField = new PlatformFields();
        platformField.setPortalId("khj932");
        platformField.setApiAccessToken("a308159b-2ab890c8de6");
        platformField.setApiAccessTokenLifetime("600");

        VirtualAccountList virtualAccountList = new VirtualAccountList();
        VirtualAccount virtualAccount = new VirtualAccount();
        virtualAccount.setTrCode("ISS");
        virtualAccount.setRealAccNo("40113387510");
        virtualAccount.setVtAccNo("123214985324234");
        virtualAccount.setVtAccAlias("유가증권투자용");
        
        virtualAccountList.addVirtualAccount(virtualAccount);

        VirtualAccountRequest virtualAccountRequest = new VirtualAccountRequest();
        virtualAccountRequest.setCommonHeader(commonHeader);
        virtualAccountRequest.setPlatformFields(platformField);
        virtualAccountRequest.setVirtualAccountList(virtualAccountList);

        Gson gson = new Gson();
        String response = gson.toJson(virtualAccountRequest);
        System.out.println(response);
        System.out.println("Total Length = [" + response.length() + "]");
    }

}
