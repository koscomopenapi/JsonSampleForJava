/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openapi.portfolio.asset.FundList;

/**
 *
 * @author heungjae
 */
public class PortfolioRespParserTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mesg = "{\"commonHeader\":{\"reqIdPlatform\":\"P0001-ABC-0001\",\"reqIdConsumer\":\"Uberple-00001\",\"certDn\":\"cn\\u003d오픈테스트,ou\\u003dHTS,ou\\u003d대신,ou\\u003d증권,o\\u003dSignKorea,c\\u003dKR\",\"ci\":\"834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22\"},\"platformFields\":{\"portalId\":\"khj932\",\"apiAccessToken\":\"a308159b-2ab890c8de6\",\"apiAccessTokenLifetime\":\"600\"},\"portfolioResponseBody\":{\"accInfo\":{\"realAccNo\":\"40113387510\",\"vtAccNo\":\"123214985324234\"},\"queryType\":{\"assetType\":\"ALL\",\"rspType\":\"RAT\",\"count\":0,\"page\":\"null\"},\"queryResult\":{\"totalCnt\":3,\"count\":3,\"page\":\"\"}},\"portfolioList\":{\"portfolio\":[{\"cash\":{\"amt\":20000.0}},{\"equityList\":[{\"assetType\":\"KSP\",\"isinCode\":\"KR7005930003\",\"qty\":10.0,\"earningRate\":-15.0}]},{\"fundList\":[{\"fundCode\":\"K5F045049908\",\"fundName\":\"Eastspring Investments Japan Dynamic Equity Fund Class\",\"qty\":200.0,\"earningRate\":12.3,\"maturity\":\"9999-99-99\"}]}]},\"resp\":{\"respCode\":\"200\",\"respMsg\":\"OK\"}}";
  
        Gson gson = new Gson();
        
        JsonParser parser = new JsonParser();
        JsonObject data = parser.parse(mesg).getAsJsonObject().getAsJsonObject("portfolioList");
        JsonArray array = data.getAsJsonArray("portfolio");
        for (JsonElement je1 : array) {
            if (je1.getAsJsonObject().get("fundList") != null) {
                //FundList fundList = je1.getAsJsonObject().get("fundList");
            }
        }
        
    
    }
    
}
