/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.account.RealAccountListRequest;
import org.openapi.common.CommonHeader;

/**
 *
 * @author heungjae
 */
public class RealAccountListReq {

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

        RealAccountListRequest realAccountListRequest = new RealAccountListRequest(commonHeader);
        Gson gson = new Gson();
        String request = gson.toJson(realAccountListRequest);
        System.out.println(request);
        System.out.println("Total Length = [" + request.length() + "]");

    }
    
}
