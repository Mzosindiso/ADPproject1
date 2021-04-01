/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author mzura
 */
public class CountTest {
    
    private Count count1;
    private Count count2;
    private Count count3;
    public CountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        count1 = new Count();
        count2 = new Count();
        count3 = count1;
    }
    
    @AfterEach
    public void tearDown() {
    }

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
