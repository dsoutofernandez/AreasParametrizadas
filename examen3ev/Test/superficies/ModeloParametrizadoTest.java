/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Dani
 */

@RunWith(Parameterized.class)
public class ModeloParametrizadoTest {
    // TODO review the generated test code and remove the default call to fail.

    
    private double result;
    private Modelo mod = new Modelo();
    
    
   @Before
   public void initialize() {
   
   
   }

    public ModeloParametrizadoTest(Modelo mod,double result) {
      this.mod = mod;
      this.result = result;
   }

 

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
          {new Modelo(2, 2, "square"), 4},
          {new Modelo(3, 1, "triangle"), 1.5},
          {new Modelo(3, 1, "rectangle"), 3},
          {new Modelo(3, "circle"), 5}
      
         
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " +result);
      assertEquals(result, mod.Evaluation(mod.getOpType()),0.1);
   }
}
