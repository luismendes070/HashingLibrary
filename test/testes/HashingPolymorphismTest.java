package testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import knuth.HashingNumeroNatural;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author luism
 */
public class HashingPolymorphismTest {
    
    HashingNumeroNatural hashing = new HashingNumeroNatural();
    
    public HashingNumeroNatural[] vetor;

    public HashingPolymorphismTest() {
        this.vetor = new HashingNumeroNatural[3];
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
     //@Ignore
     public void numeroNatural() {
         
         int numeroNatural;
         
         numeroNatural = 0;
         
         Assert.assertEquals(hashing.isNome(numeroNatural), true);
         
     }
     
     @Test
     //@Ignore
     public void searchJOneAllPositions() {
         
         int jOne = 1;
         
         Assert.assertEquals(hashing.searchJOneAllPositions(jOne), true);
         
     }
     
     @Test
     public void searchWasUncessfull() {
         
         int j = 2;
         int n = 1;
         
         Assert.assertEquals(hashing.searchWasUncessfull(j, n), true);
         
     }
     
     @Test
     public void stop() {
         
         int j = 2;
         int n = 1;
         int K = 2;
         boolean stop = hashing.stop(hashing.searchWasUncessfull(j,n) && hashing.getKey(j,K));
         
         Assert.assertEquals(stop, true);
         
     }
     
     @Test
     public void increaseJByOne() {
         
         int j = 2;
         int n = 1;
         int K = 2;
         boolean stop = hashing.stop(hashing.searchWasUncessfull(j+1,n) && hashing.getKey(j+1,K));
         
         Assert.assertEquals(stop, true);
         
     }
     
     @Test
     public void sucessFullSearch() {
         
         int j = 2;
         int n = 1;
         int K = 2;
         boolean stop = hashing.stop(hashing.searchWasUncessfull(j,n-1) && hashing.getKey(j,K));
         
         Assert.assertEquals(stop, true);
         
     }
     
     @Test
     public void hashingArray() {
         
         vetor[0] = hashing;
         vetor[1] = hashing;
         vetor[2] = hashing;
         
         int j = 2;
         int n = 1;
         int K = 2;
         boolean stop = hashing.stop(hashing.searchWasUncessfull(j,n-1) && hashing.getKey(j,K));
         
         Assert.assertEquals(stop, true);
         
     }
     
}
