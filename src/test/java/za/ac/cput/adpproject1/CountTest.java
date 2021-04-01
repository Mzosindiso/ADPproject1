/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Thina Mzosindiso Nontwabaza : 219189153
 */
public class CountTest {
 
    public Count password1;
    public Count password2;
    public Count password3;
    
    
    @BeforeEach
    public void setUp(){
        password1 = new Count();
        password2 = new Count();
        password3 = password2;
         
    }
    @Test
    public void testEquality(){
        assertEquals(password2, password3);
        
        
    }
    @Test
    public void testIdentity(){
        assertSame(password2, password3);
        
    }
    
    
}
