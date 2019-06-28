/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import knuth.NewClass;

/**
 *
 * @author luism
 */
public class NewClassTest {
    
    //NewClass newClass;
    
    public NewClassTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         
         NewClass newClass = new NewClass();
         
         String dado = newClass.hash(0, newClass.aF);
         
         System.out.println(dado);
         
         Assert.assertEquals("A", dado);
         
     }
     
     @Test
     public void hello2() {
         
         NewClass newClass = new NewClass();
         
         String dado = newClass.hash2("R");
         
         System.out.println(dado);
         
         Assert.assertEquals("R", dado);
         
     }
}
