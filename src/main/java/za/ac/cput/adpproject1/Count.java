/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

/**
 *
 * @author Siphesonke Notsela 219076235
 *
 */
public class Count {
    
private String inGameName, gamerId, loginName;

    public void setInGameName(String inGameName) {
        this.inGameName = inGameName;
    }

    public void setGamerId(String gamerId) {
        this.gamerId = gamerId;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getInGameName() {
        return inGameName;
    }

    public String getGamerId() {
        return gamerId;
    }

    public String getLoginName() {
        return loginName;
    }

    @Override
    public String toString() {
        return "Account{" + "inGameName=" + inGameName + ", gamerId=" + gamerId + ", loginName=" + loginName + '}';
    }
    
}


