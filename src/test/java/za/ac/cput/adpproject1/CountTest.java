/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Siphesonke Notsela
 * Student No. 219076235
 */
public class CountTest {
    
    private static Count account1;  
    private static Count account2;  
    private static Count account3;  
    
    @BeforeAll
    public static void setUp() {
        account1 = new Count();
        account2 = account1;
        account3 = account2;
    }
    
    @Test
    public void testIdentity (){
       assertSame(account1, account3); 
    }
    
    
    @Test
    public void testEquality (){
       assertEquals(account2, account3); 
    }

    /**
     * Test of setInGameName method, of class Account.
     */
    @Test
    public void testSetInGameName() {
        System.out.println("setInGameName");
        String expResult = "CipherX";
        account1.setInGameName("CipherX");
        String result = account1.getInGameName();
        assertSame(expResult, result);
        fail("The test will fail.");
    }

    /**
     * Test of setGamerId method, of class Account.
     */
    @Test
    @Disabled
    public void testSetGamerId() {
        System.out.println("setGamerId");
        String expResult = "204890";
        account2.setGamerId("204890");
        String result = account2.getGamerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLoginName method, of class Account.
     */
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testSetLoginName() { 
      System.out.println("setLonginName");
        String expResult = "XPhoenix";
        account1.setLoginName("XPhoenix");
        String result = account1.getLoginName();
        assertSame(expResult, result);
    }
    
}
