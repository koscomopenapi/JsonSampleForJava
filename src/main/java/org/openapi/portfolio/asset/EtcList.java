/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio.asset;

import java.util.ArrayList;

/**
 *
 * @author heungjae
 */
public class EtcList {
    
    ArrayList<Etc> etcList = new ArrayList();

    public EtcList() {
    }

    public void addAsset(Etc etc) {
        etcList.add(etc);
    }   
}
