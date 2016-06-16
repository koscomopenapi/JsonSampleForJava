/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.balance;

import java.util.Objects;

/**
 *
 * @author heungjae
 */
public class Summary {
    BalanceSummary summary;

    public Summary() {
    }

    public Summary(BalanceSummary summary) {
        this.summary = summary;
    }

    public BalanceSummary getSummary() {
        return summary;
    }

    public void setSummary(BalanceSummary summary) {
        this.summary = summary;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.summary);
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
        final Summary other = (Summary) obj;
        if (!Objects.equals(this.summary, other.summary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Summary{" + "summary=" + summary + '}';
    }
    
}
