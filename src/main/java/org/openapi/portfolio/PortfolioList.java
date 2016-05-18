/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.portfolio;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class PortfolioList {

    ArrayList<Object> portfolio = new ArrayList();

    public PortfolioList() {
    }

    public ArrayList<Object> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(ArrayList<Object> portfolio) {
        this.portfolio = portfolio;
    }

    public void addPortfolio(Object objet) {
        portfolio.add(objet);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.portfolio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PortfolioList other = (PortfolioList) obj;
        if (!Objects.equals(this.portfolio, other.portfolio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PortfolioList{" + "portfolio=" + portfolio + '}';
    }

}
