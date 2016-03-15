/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.balance.BalanceRequest;
import org.openapi.balance.BalanceRequestBox;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;
import org.openapi.symbol.InterestSymbolListRequest;
import org.openapi.symbol.InterestSymbolListRequestBox;

/**
 *
 * @author heungjae
 */
public class InterestSymbolListReq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Partner partner = new Partner();
        partner.setComId("uberple");
        partner.setSrvId("SNEK");
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // CommonHeader
        ///////////////
        CommonHeader commonHeader = new CommonHeader();
        commonHeader.setReqIdPlatform("P0001-ABC-0001");
        commonHeader.setReqIdConsumer("Uberple-00001");
        commonHeader.setCertDn("cn=김흥재_0000033643,ou=KOSCOM,ou=LicensedCA,o=SignKorea,c=KR");
        commonHeader.setCi("834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22");

        DevInfo devInfo = new DevInfo();
        devInfo.setIpAddr("192168001010");
        devInfo.setMacAddr("7054D27EE247");
        
        InterestSymbolListRequest interestSymbolListRequest = new InterestSymbolListRequest();
        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("001-01-992323232");
        accInfo.setVtAccNp("123214985324234");
       
        interestSymbolListRequest.setPartner(partner);
        interestSymbolListRequest.setCommonHeader(commonHeader);
        interestSymbolListRequest.setDevInfo(devInfo);
        interestSymbolListRequest.setAccInfo(accInfo);
        
        InterestSymbolListRequestBox interestSymbolListRequestBox = new InterestSymbolListRequestBox(interestSymbolListRequest);
        
        Gson gson = new Gson();
        String request = gson.toJson(interestSymbolListRequestBox);
        System.out.println(request);
        System.out.println("Total Length = [" + request.length() + "]");
    }
    
}
