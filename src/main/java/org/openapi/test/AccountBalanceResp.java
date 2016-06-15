/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.balance.BalanceList;
import org.openapi.balance.BalanceResponse;
import org.openapi.balance.BalanceResponseBody;
import org.openapi.balance.EquityBalance;
import org.openapi.balance.FundBalance;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.PlatformFields;
import org.openapi.common.Response;
import org.openapi.portfolio.QueryType;
import org.openapi.portfolio.asset.EquityList;
import org.openapi.portfolio.asset.FundList;
import org.openapi.transaction.QueryResult;

/**
 *
 * @author heungjae
 */
public class AccountBalanceResp {

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

        BalanceResponseBody balanceResponseBody = new BalanceResponseBody();
        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("40113387510");
        accInfo.setVtAccNp("123214985324234");
        balanceResponseBody.setAccInfo(accInfo);

        QueryType queryType = new QueryType();
        queryType.setRspType("RAT");
        queryType.setAssetType("ALL");
        queryType.setPage("null");
        balanceResponseBody.setQueryType(queryType);

        QueryResult queryResult = new QueryResult();
        queryResult.setTotalCnt(1);
        queryResult.setCount(1);
        queryResult.setPage("null");
        balanceResponseBody.setQueryResult(queryResult);

        EquityList equityList = new EquityList();
        EquityBalance equityBalance = new EquityBalance();
        equityBalance.setAssetType("KSP");
        equityBalance.setIsinCode("KR7005930003");
        equityBalance.setQty(10);
        equityBalance.setValAtTrade(16500000);
        equityBalance.setValAtCur(21000000);
        equityBalance.setProLoss(4500000);
        equityBalance.setEarningRate(27.7);
        equityList.addAsset(equityBalance);

        FundList fundList = new FundList();
        FundBalance fundBalance = new FundBalance();
        fundBalance.setFundCode("KRF059035146");
        fundBalance.setFundName("피델리티펀드-글로벌배당주펀드 (A-ACC-USD)");
        fundBalance.setValAtTrade(9200000);
        fundBalance.setValAtCur(9200000);
        fundBalance.setProLoss(0);
        fundBalance.setFirstDateBuy("2016-01-03");
        fundBalance.setLastDateBuy("2016-01-03");
        fundBalance.setMaturity("9999-99-99");
        fundBalance.setEarningRate(0);
        fundList.addAsset(fundBalance);

        BalanceList balanceList = new BalanceList();
        balanceList.addBalance(equityList);
        balanceList.addBalance(fundList);

        ///////////////////////
        // Resp
        ///////
        Response resp = new Response();
        resp.setRespCode("200");
        resp.setRespMsg("OK");

        BalanceResponse balanceResponse = new BalanceResponse();
        balanceResponse.setCommonHeader(commonHeader);
        balanceResponse.setPlatformFields(platformField);
        balanceResponse.setBalanceResponseBody(balanceResponseBody);
        balanceResponse.setBalanceList(balanceList);
        balanceResponse.setResp(resp);

        Gson gson = new Gson();
        String request = gson.toJson(balanceResponse);
        System.out.println(request);
        System.out.println("Total Length = [" + request.length() + "]");
    }

}
