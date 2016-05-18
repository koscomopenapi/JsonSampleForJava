/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.common.AccInfo;
import org.openapi.common.CommonHeader;
import org.openapi.common.Response;
import org.openapi.portfolio.PortfolioResponse;
import org.openapi.portfolio.QueryType;
import org.openapi.portfolio.asset.Equity;
import org.openapi.portfolio.asset.Fund;
import org.openapi.portfolio.asset.EquityList;
import org.openapi.portfolio.asset.FundList;
import org.openapi.portfolio.PortfolioList;
import org.openapi.portfolio.PortfolioResponseBody;

/**
 *
 * @author heungjae
 */
public class PortfolioResp {

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
        queryType.setCount(0);
        queryType.setPage("null");
        portfolioResponseBody.setQueryType(queryType);

        Equity equity = new Equity();
        equity.setAssetType("KSP");
        equity.setIsinCode("KR7005930003");
        equity.setQty(10.0);
        equity.setEarningRate(-15.0);

        Fund fund = new Fund();
        fund.setFundCode("K5F045049908");
        fund.setFundName("Eastspring Investments Japan Dynamic Equity Fund Class");
        fund.setQty(200.0);
        fund.setEarningRate(12.3);
        fund.setMaturity("9999-99-99");

        FundList fundList = new FundList();
        fundList.addAsset(fund);

        EquityList equityList = new EquityList();
        equityList.addAsset(equity);

//        EtcList etcList = new EtcList();
//        etcList.addPortfolio(etc);

        PortfolioList portfolio = new PortfolioList();
        portfolio.addPortfolio(equityList);
        portfolio.addPortfolio(fundList);
        

        ///////////////////////
        // Resp
        ///////
        Response resp = new Response();
        resp.setRespCode("200");
        resp.setRespMsg("OK");

        PortfolioResponse portfolioResponse = new PortfolioResponse();
        portfolioResponse.setCommonHeader(commonHeader);
        portfolioResponse.setPortfolioRequestBody(portfolioResponseBody);
        portfolioResponse.setPortfolioList(portfolio);
        portfolioResponse.setResp(resp);

        Gson gson = new Gson();
        String response = gson.toJson(portfolioResponse);
        System.out.println(response);
        System.out.println("Total Length = [" + response.length() + "]");
    }

}
