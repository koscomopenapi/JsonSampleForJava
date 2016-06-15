/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.common;

/**
 *
 * @author heungjae
 */
public class PlatformFields {
    
    String portalId;
    String apiAccessToken;
    String apiAccessTokenLifetime;

    public PlatformFields() {
    }

    public PlatformFields(String portalId, String apiAccessToken, String apiAccessTokenLifetime) {
        this.portalId = portalId;
        this.apiAccessToken = apiAccessToken;
        this.apiAccessTokenLifetime = apiAccessTokenLifetime;
    }

    public String getPortalId() {
        return portalId;
    }

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    public String getApiAccessToken() {
        return apiAccessToken;
    }

    public void setApiAccessToken(String apiAccessToken) {
        this.apiAccessToken = apiAccessToken;
    }

    public String getApiAccessTokenLifetime() {
        return apiAccessTokenLifetime;
    }

    public void setApiAccessTokenLifetime(String apiAccessTokenLifetime) {
        this.apiAccessTokenLifetime = apiAccessTokenLifetime;
    }

    @Override
    public String toString() {
        return "PlatformFields{" + "portalId=" + portalId + ", apiAccessToken=" + apiAccessToken + ", apiAccessTokenLifetime=" + apiAccessTokenLifetime + '}';
    }
    
    
    
}
