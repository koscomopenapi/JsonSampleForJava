/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import java.util.ArrayList;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;
import org.openapi.symbol.Group;
import org.openapi.symbol.GroupList;
import org.openapi.symbol.InterestSymbolListResponse;
import org.openapi.symbol.InterestSymbolListResponseBody;
/**
 *
 * @author heungjae
 */
public class InterestSymbolListResp {

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

        /////////////////////////////////////////////////////
        // AccInfo
        //////////
        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("XXX-XX-XXXXXXX");
        accInfo.setVtAccNp("XXX-XX-XXXXXXXXXX-XX-XXXXXXX");

        //////////////////////////////////////////////////////////
        //grouplist
        ///////////
        Group group = new Group();
        group.setGroupName("급등후보주1");
        group.setModifyDate("20160103");
        ArrayList isinCode = new ArrayList();

        for (int idx = 0; idx < 4; idx++) {
            String isinCodeString = String.format("%04d", idx);
            isinCode.add("KR700593" + isinCodeString);
        }
        group.setIsinList(isinCode);
        ////////////////////////////////////////////////////////
        //grouplist#2
        /////////////
        Group group2 = new Group();
        group2.setGroupName("상한가예상주2");
        group2.setModifyDate("20160105");
        ArrayList isinList2 = new ArrayList();

        for (int idx = 0; idx < 5; idx++) {
            String isinCodeString = String.format("%04d", idx);
            isinList2.add("KR700773" + isinCodeString);
        }
        group2.setIsinList(isinList2);
        ////////////////////////////////////////////////////////
        GroupList groupList = new GroupList();
        groupList.addInterestSymbolGroup(group);
        groupList.addInterestSymbolGroup(group2);
        ///////////////////////
        // Resp
        ///////
        Response resp = new Response();
        resp.setRespCode("200");
        resp.setRespMsg("OK");

        ////////////////////////////////
        // interestInstrumentResponse
        /////////////////////////////
        InterestSymbolListResponse interestSymbolListResponse = new InterestSymbolListResponse();
        InterestSymbolListResponseBody interestSymbolListResponseBody = new InterestSymbolListResponseBody();
        
        interestSymbolListResponseBody.setAccInfo(accInfo);
        interestSymbolListResponseBody.setGroupList(groupList);
        interestSymbolListResponseBody.setResp(resp);
        interestSymbolListResponse.setInterestSymbolListResponseBody(interestSymbolListResponseBody);
        
        
        Gson gson = new Gson();
        String response = gson.toJson(interestSymbolListResponse);
        System.out.println(response);
        System.out.println("Total Length = [" + response.length() + "]");

    }

}
