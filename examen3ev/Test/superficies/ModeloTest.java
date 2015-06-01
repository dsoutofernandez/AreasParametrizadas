/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dsoutofernandez
 */
public class ModeloTest {
    
    public ModeloTest() {
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

    /**
     * Test of getOpType method, of class Modelo.
     */
   /* @Test
    public void testGetOpType() {
        System.out.println("getOpType");
        Modelo instance = new Modelo();
        String expResult = "";
        String result = instance.getOpType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setOpType method, of class Modelo.
     */
    /*@Test
    public void testSetOpType() {
        System.out.println("setOpType");
        String OpType = "";
        Modelo instance = new Modelo();
        instance.setOpType(OpType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of Evaluation method, of class Modelo.
     */
    @Test
    public void testCuadrado() {
        //System.out.println("Evaluation");
        String OpType = "square";
        Modelo mod = new Modelo();
        mod.sideLength=4;
        
        float expResult = 16;
        float result = mod.Evaluation(OpType);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRectangulo() {
        //System.out.println("Evaluation");
        String OpType = "rectangle";
        Modelo mod = new Modelo();
        mod.sideLength =4;
        mod.sideHeight=2;
                
        
        float expResult = 8;
        float result = mod.Evaluation(OpType);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testTriangulo() {
        //System.out.println("Evaluation");
        String OpType = "triangle";
        Modelo mod = new Modelo();
        mod.baseLength =3;
        mod.height =2;
                
        
        float expResult = 3;
        float result = mod.Evaluation(OpType);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
    @Test
    public void testCirculo() {
        //System.out.println("Evaluation");
        String OpType = "circle";
        Modelo mod = new Modelo();
        mod.radius=5;
                
        
        float expResult = 78;
        float result = mod.Evaluation(OpType);
        assertEquals(expResult, result, 0.9);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
