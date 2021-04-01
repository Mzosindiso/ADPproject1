/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mzura
 */
public class CountTest {
    
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
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
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
}
