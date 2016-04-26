/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.test;

import com.google.gson.Gson;
import org.openapi.balance.BalanceRequestBox;

/**
 *
 * @author heungjae
 */
public class AccountBalanceRespService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jsonMsg = "{\"balanceRequest\":{\"partner\":{\"comId\":\"uberple\",\"srvId\":\"SNEK\"},\"commonHeader\":{\"reqIdPlatform\":\"P0001-ABC-0001\",\"reqIdConsumer\":\"Uberple-00001\",\"certDn\":\"cn\\u003d김흥재_0000033643,ou\\u003dKOSCOM,ou\\u003dLicensedCA,o\\u003dSignKorea,c\\u003dKR\",\"ci\":\"834f889833602f174a706138f19778a2dc6eee0f834f889833602f174a706138f19778a2dc6eee0feee0f22\"},\"DevInfo\":{\"ipAddr\":\"192168001010\",\"macAddr\":\"7054D27EE247\"},\"portfolioRequestBody\":{\"accInfo\":{\"realAccNo\":\"001-01-992323232\",\"vtAccNo\":\"123214985324234\"},\"queryType\":{\"assetType\":\"ALL\",\"rspType\":\"RAT\"}}}}\n" +
"";
        Gson gson = new Gson();
        BalanceRequestBox accountBalanceRequestBox = gson.fromJson(jsonMsg,BalanceRequestBox.class);
        System.out.println(accountBalanceRequestBox.getBalanceRequest().getPortfolioRequestBody().getAccInfo());
        System.out.println(accountBalanceRequestBox.getBalanceRequest().getCommonHeader().getCertDn());
    }
    
}
