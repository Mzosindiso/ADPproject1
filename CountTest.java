/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

<<<<<<< HEAD
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Chulumanco Nkwindana 219390983
 */
public class CountTest {
    private Count count1;
    private Count count2;
    private Count count3;
    
       

    @BeforeEach
    public void setUp() {
        count1= new Count();
        count2=new Count();
        count3=count3;
    }
    
    @Test
   public void testIdentity(){
    assertSame(count1, count3);}
    
    @Test
    public void testEquality(){
    assertEquals(count1,count3);}
    
    @Test
   (value = 500, unit = TimeUnit.MILLISECONDS)
    public void TestTimeout(){
    };
    
    @Test
    public void testDisable(){
    System.out.println("The test has be disabled");}
    
            
    
   
    @Test
    public void testtNum1() {
        System.out.println("getNum1");
        Count instance = new Count();
        String expResult=" ";
        int result = instance.getNum1();
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
/*Test of setNum1 methobd of class Count*/
    @Test
    public void testSetNum1(){
    System.out.println("setNum1");
    String num1="";
    Count instance = new Count();
    instance.setNum1(num1);
    fail("The case test is prototype");}
    
    @Test
    public void testToString(){
    System.out.println("toString");
    Count instance = new Count();
    String expResult="";
    String result =  instance.toString();
    assertEquals(expResult, result);
    fail ("The case test s prototype");}

   

  
     





}



=======
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
        fail("The test case is a prototype.");
    }
    
}
>>>>>>> master
