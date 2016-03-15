/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import java.util.ArrayList;

/**
 *
 * @author heungjae
 */
public class PortfolioList {
    
    ArrayList <Object> portfolio = new ArrayList();

    public PortfolioList() {
    }
    
    public void addPortfolio(Object objet) {
        portfolio.add(objet);
    } 
}
