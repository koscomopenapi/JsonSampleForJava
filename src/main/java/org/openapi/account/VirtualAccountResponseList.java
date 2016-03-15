/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openapi.account;

import java.util.ArrayList;

/**
 *
 * @author heungjae
 */
public class VirtualAccountResponseList {
    
    ArrayList <VirtualAccountAck> virtualAccount = new ArrayList();

    public VirtualAccountResponseList() {
    }
    
    public void addVirtualAccount(VirtualAccountAck virtualAccountResponse) {
        virtualAccount.add(virtualAccountResponse);
    }
}
