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
import org.openapi.common.PlatformFields;
import org.openapi.portfolio.PortfolioRequest;
import org.openapi.portfolio.PortfolioRequestBody;
import org.openapi.portfolio.QueryType;

/**
 *
 * @author heungjae
 */
public class PortfolioReq {

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
        commonHeader.setCertDn("cn=오픈테스트,ou=HTS,ou=대신,ou=증권,o=SignKorea,c=KR");
        commonHeader.setCi("834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22");

        PlatformFields platformField = new PlatformFields();
        platformField.setPortalId("khj932");
        platformField.setApiAccessToken("a308159b-2ab890c8de6");
        platformField.setApiAccessTokenLifetime("600");

        DevInfo devInfo = new DevInfo();
        devInfo.setIpAddr("192168001010");
        devInfo.setMacAddr("7054D27EE247");

        PortfolioRequestBody portfolioRequestBody = new PortfolioRequestBody();
        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("40113387510");
        accInfo.setVtAccNp("123214985324234");
        portfolioRequestBody.setAccInfo(accInfo);
        QueryType queryType = new QueryType();
        queryType.setRspType("RAT");
        queryType.setAssetType("ALL");
        queryType.setCount(0);
        queryType.setPage("null");
        portfolioRequestBody.setQueryType(queryType);

        PortfolioRequest portfolioRequest = new PortfolioRequest();
        portfolioRequest.setPartner(partner);
        portfolioRequest.setCommonHeader(commonHeader);
        portfolioRequest.setPlatformFields(platformField);
        portfolioRequest.setDevInfo(devInfo);
        portfolioRequest.setPortfolioRequestBody(portfolioRequestBody);

        Gson gson = new Gson();
        String request = gson.toJson(portfolioRequest);
        System.out.println(request);
        System.out.println("Total Length = [" + request.length() + "]");
    }

}
