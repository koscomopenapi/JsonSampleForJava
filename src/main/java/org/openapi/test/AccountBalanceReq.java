/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.balance.BalanceRequest;
import org.openapi.balance.PortfolioRequestBody;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.DevInfo;
import org.openapi.common.Partner;
import org.openapi.portfolio.QueryType;

/**
 *
 * @author heungjae
 */
public class AccountBalanceReq {

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

        BalanceRequest accountBalanceRequest = new BalanceRequest();
        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("001-01-992323232");
        accInfo.setVtAccNp("123214985324234");

        QueryType queryType = new QueryType();
        queryType.setRspType("RAT");
        queryType.setAssetType("ALL");
        queryType.setPage("null");

        PortfolioRequestBody portfolioRequestBody = new PortfolioRequestBody();
        portfolioRequestBody.setAccInfo(accInfo);
        portfolioRequestBody.setQueryType(queryType);
        accountBalanceRequest.setPartner(partner);
        accountBalanceRequest.setCommonHeader(commonHeader);
        accountBalanceRequest.setDevInfo(devInfo);
        accountBalanceRequest.setPortfolioRequestBody(portfolioRequestBody);

        Gson gson = new Gson();
        String request = gson.toJson(accountBalanceRequest);
        System.out.println(request);
        System.out.println("Total Length = [" + request.length() + "]");
    }

}
