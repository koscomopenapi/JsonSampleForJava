/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio.asset;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class EquityList {
    
    ArrayList<Equity> equityList = new ArrayList();

    public EquityList() {
    }

    public void addAsset(Equity equity) {
        equityList.add(equity);
    }   
}
