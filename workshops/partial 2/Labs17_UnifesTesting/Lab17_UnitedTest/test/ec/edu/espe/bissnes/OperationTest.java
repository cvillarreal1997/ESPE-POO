/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bissnes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Villarreal
 */
public class OperationTest {
    
    public OperationTest() {
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
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        short addend1 = 5;
        short addend2 = 6;
        Operation instance = new Operation();
        short expResult = 11;
        short result = instance.add(addend1, addend2);
        assertEquals(expResult, result);
       
       
    }
    @Test
    public  void  AddSimpleCaseso(){
        short operan1 = 1;
        short operan2 =2;
        short expectresult=3;
        Operation operation = new Operation();
        short actualresult=operation.add(operan1, operan2);
        assertEquals(expectresult,actualresult);
        System.out.println("suceeded "+operan1+"+"+operan2);
        
        
        operan1=12;
        operan2=15;
        expectresult=27;
        actualresult=operation.add(operan1, operan2);
        assertEquals(expectresult,actualresult);
        System.out.println("suceeded "+operan1+"+"+operan2);
        
        operan1=0;
        operan2=5;
        expectresult=5;
        actualresult=operation.add(operan1, operan2);
        assertEquals(expectresult,actualresult);
        System.out.println("suceeded "+operan1+"+"+operan2);
        
        operan1=0;
        operan2=-8;
        expectresult=-8;
        actualresult=operation.add(operan1, operan2);
        assertEquals(expectresult,actualresult);
        System.out.println("suceeded "+operan1+"+"+operan2);
        
        
        
        
    }
        @Test
        
        
    public  void  wrongCases(){
        short operan1 = 32000;
        short operan2 =32000;
        int expectresult=64000;
        Operation operation = new Operation();
        short actualresult=operation.add(operan1, operan2);
        assertEquals(expectresult,actualresult);
        System.out.println("suceeded "+operan1+"+"+operan2);
    }
    
}
