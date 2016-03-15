/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.balance.EquityBalance;
import org.openapi.balance.FundBalance;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;
import org.openapi.portfolio.PortfolioList;
import org.openapi.portfolio.PortfolioResponse;
import org.openapi.portfolio.PortfolioResponseBody;
import org.openapi.portfolio.PortfolioResponseBox;
import org.openapi.portfolio.QueryType;
import org.openapi.portfolio.asset.EquityList;
import org.openapi.portfolio.asset.FundList;

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
        commonHeader.setCertDn("cn=김흥재_0000033643,ou=KOSCOM,ou=LicensedCA,o=SignKorea,c=KR");
        commonHeader.setCi("834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22");

        PortfolioResponseBody portfolioResponseBody = new PortfolioResponseBody();
        AccInfo accInfo = new AccInfo();
        accInfo.setRealAccNo("001-01-992323232");
        accInfo.setVtAccNp("123214985324234");
        portfolioResponseBody.setAccInfo(accInfo);
        QueryType queryType = new QueryType();
        queryType.setRspType("RAT");
        queryType.setAssetType("ALL");
        portfolioResponseBody.setQueryType(queryType);

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
        fundBalance.setValatCur(9200000);
        fundBalance.setProLoss(0);
        fundBalance.setFirstDateBuy("2016-01-03");
        fundBalance.setLastDateBuy("2016-01-03");
        fundBalance.setMaturity("9999-99-99");
        fundBalance.setEarningRate(0);
        fundList.addAsset(fundBalance);

        PortfolioList portfolioList = new PortfolioList();
        portfolioList.addPortfolio(equityList);
        portfolioList.addPortfolio(fundList);

        ///////////////////////
        // Resp
        ///////
        Response resp = new Response();
        resp.setRespCode("200");
        resp.setRespMsg("OK");

        PortfolioResponse portfolioResponse = new PortfolioResponse();
        portfolioResponse.setCommonHeader(commonHeader);
        portfolioResponse.setBody(portfolioResponseBody);
        portfolioResponse.setPortfolio(portfolioList);
        portfolioResponse.setResp(resp);
        PortfolioResponseBox portfolioResponseBox = new PortfolioResponseBox(portfolioResponse);

        Gson gson = new Gson();
        String request = gson.toJson(portfolioResponseBox);
        System.out.println(request);
        System.out.println("Total Length = [" + request.length() + "]");
    }

}
