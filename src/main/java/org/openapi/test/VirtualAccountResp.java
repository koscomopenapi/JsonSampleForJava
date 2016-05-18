/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.account.VirtualAccountAck;
import org.openapi.account.VirtualAccountResponse;
import org.openapi.account.VirtualAccountResponseList;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;

/**
 *
 * @author heungjae
 */
public class VirtualAccountResp {

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

        VirtualAccountResponseList virtualAccountResponseList = new VirtualAccountResponseList();
        VirtualAccountAck virtualAccountAck = new VirtualAccountAck();
        virtualAccountAck.setTrCode("REQ");
        virtualAccountAck.setRealAccNo("001-99-23122221");
        virtualAccountAck.setVtAccNo("0929923212342");
        virtualAccountAck.setVtAccAlias("유가증권투자용");
        virtualAccountAck.setStatus("SUCCESS");
        virtualAccountAck.setMessage("처리성공");

        virtualAccountResponseList.addVirtualAccount(virtualAccountAck);

        ///////////////////////
        // Resp
        ///////
        Response resp = new Response();
        resp.setRespCode("200");
        resp.setRespMsg("OK");
        
        
        VirtualAccountResponse virtualAccountResponse = new VirtualAccountResponse();
        virtualAccountResponse.setCommonHeader(commonHeader);
        virtualAccountResponse.setBody(virtualAccountResponseList);
        virtualAccountResponse.setResp(resp);

        Gson gson = new Gson();
        String response = gson.toJson(virtualAccountResponse);
        System.out.println(response);
        System.out.println("Total Length = [" + response.length() + "]");
    }

}
