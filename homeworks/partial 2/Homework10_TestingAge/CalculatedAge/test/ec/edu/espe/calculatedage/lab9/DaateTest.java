
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import static com.oracle.nio.BufferSecrets.instance;
import java.io.IOException;
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
public class DaateTest {
    
   
    @Test
    public void testCalculatedaño() throws Exception {
        System.out.println("Calculateda\u00f1o");
        String nameperson = "";
        int age = 1997;
        int mes = -9;
        int day = 6;
        Daate instance = new Daate();
        
        
        String expResult = ";1997;9;6;21";
        String result = instance.Calculatedaño(nameperson, age, mes, day);
        assertEquals(expResult, result);
        
        
        
        
        
        
        System.out.println("Calculateda\u00f1o");
        nameperson = "";
        age = 2038;
        mes = 9;
        day = 6;
        expResult = ";1997;9;6;21";
        result = instance.Calculatedaño(nameperson, age, mes, day);
        assertEquals(expResult, result);
        
        
               System.out.println("Calculateda\u00f1o");
        nameperson = "";
        age = 1997;
        mes = 32;
        day = 6;
        expResult = ";1997;9;6;21";
        result = instance.Calculatedaño(nameperson, age, mes, day);
        assertEquals(expResult, result);
        
        
        
         System.out.println("Calculateda\u00f1o");
        nameperson = "";
        age = 1997;
        mes = 9;
        day = 6;
        expResult = ";1997;9;6;21";
        result = instance.Calculatedaño(nameperson, age, mes, day);
        assertEquals(expResult, result);
        
        
        
        
    }

    /**
     * Test of Pregunta method, of class Daate.
     */


    /**
     * Test of yearbisiest method, of class Daate.
     */
    @Test
    public void testYearbisiest() {
        System.out.println("yearbisiest");
        int age = 2000;
        Daate instance = new Daate();
        boolean expResult = true;
        boolean result = instance.yearbisiest(age);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testfloats() throws IOException{
        Daate instance = new Daate();
        String nameperson = "";
        int age = 32000;
        int mes = 9;
        int day = 6;
        String expResult = ";1997;9;6;21";
        String result = instance.Calculatedaño(nameperson, age, mes, day);
        assertEquals(expResult, result);
        
        
    }
       @Test
    public void test2() throws IOException{
        Daate instance = new Daate();
        String nameperson = "";
        int age = 2013;
        int mes = 35;
        int day = 6;
        String expResult = ";1997;9;6;21";
        String result = instance.Calculatedaño(nameperson, age, mes, day);
        assertEquals(expResult, result);
        
        
    }
    
}
