/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Thina Mzosindiso Nontwabaza : 
 * Student no: 219189153
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Siphesonke Notsela
 * Student No. 219076235
 */
public class CountTest {
 
    public Count password1;
    public Count password2;
    public Count password3;
    

    private Count count1;
    private Count count2;
    private Count count3;
    private static Count account1;  
    private static Count account2;  
    private static Count account3;  
    public CountTest() {
    }
    
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
      //Method test Identity
    @Test
    public void testIdentity(){
        assertSame(password2, password3);
    }
    
    @BeforeEach
    public void setUp() {
        count1 = new Count();
        count2 = new Count();
        count3 = count1;
    }
    @BeforeEach
    public void setUp(){
        password1 = new Count();
        password2 = new Count();
        password2 = password3;
         
    }
    
    @Test
    public void testEquality (){
       assertEquals(account2, account3); 
    }
      //Method test Equality
    @Test
    public void testEquality(){
        assertEquals(password2, password3);
        
        
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
    //Method failed
    @Test
    public void TestPassword(){
        System.out.println("Your password");
        fail("The test case is a prototype");
        
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
      
    //Method is disabled
    @Test
    @Disabled
    public void testTime(){
        System.out.println("Timeout");
        
    }
    
    

    /**
     * Test of setLoginName method, of class Account.
     */
    @Test

    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
        assertFalse(false);
    }
    public void testDivision(){
        int number1 = 10;
        int number2 = 5;
        double expected = 2.0;
        double result = Count.division(number1, number2);
        assertEquals(expected, result);
    }
    public void testMultiplication(){
        int number1 = 7;
        int number2 = 7;
        int expected = 49;
        int result = Count.multiplication(number1, number2);
        assertEquals(expected, result);
    }
    public void testAddition(){
        int number1 = 11;
        int number2 = 9;
        int expected = 20;
        int result = Count.addition(number1, number2);
        assertEquals(expected, result);
    }
    public void testSubtraction(){
        int number1 = 15;
        int number2 = 5;
        int expected = 10;
        int result = Count.subtraction(number1, number2);
        assertEquals(expected, result);
    }
    
    public void testEquality(){
    assertEquals(count3, count1);
    }
    
    public void testIdentity(){
    assertSame(count2, count1);
    }
    
    public void failingTest(){
    fail("Failing Test");
    assertEquals(count2, count3);

    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testSetLoginName() { 
      System.out.println("setLonginName");
        String expResult = "XPhoenix";
        account1.setLoginName("XPhoenix");
        String result = account1.getLoginName();
        assertSame(expResult, result);
    }
    
    @Test
    @Timeout(value=300, unit=TimeUnit.MILLISECONDS)
    public void testWithTimeout(){
    final int factorialOf = 1 + (int) (3000 * Math.random());
        System.out.println("computing "+ factorialOf +" !");
    }
    @Test
    @Disabled("Disabling")
    public void testDisable(){
        System.out.println("This will not run");
    }
}
