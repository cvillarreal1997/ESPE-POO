/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class AgeDateTest {
    
    public AgeDateTest() {
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
     * Test of ageCalc method, of class AgeDate.
     */
    @Test
    public void testAgeCalc() {
        System.out.println("ageCalc");
        int dayOfBirth = 0;
        int monthOfBirth = 0;
        int yearOfBirth = 0;
        AgeDate instance = new AgeDate();
        Date1 expResult = new Date1(0,0,0);
        Date1 result = instance.ageCalc(dayOfBirth, monthOfBirth, yearOfBirth);
        assertEquals(expResult.getYear(), result.getYear());
        assertEquals(expResult.getMonth(), result.getMonth());
        assertEquals(expResult.getDay(), result.getDay());
        
    }
//Continuar con las pruebas de las fechas
    /**
     * Test of getList method, of class AgeDate.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        AgeDate instance = new AgeDate();
        ArrayList<Integer> expResult = new ArrayList<Integer>() {{
        add(31);
        add(29);
        add(31);
        add(30);
        add(31);
        add(30);
        add(31);
        add(31);
        add(30);
        add(31);
        add(30);
        add(31);
    }};
        ArrayList result = instance.getList();
        assertEquals(expResult, result);
    }

    /**
     * Test of negativeValidation method, of class AgeDate.
     */
    @Test
    public void testNegativeValidation() {
        System.out.println("negativeValidation");
        int date = -12;
        AgeDate instance = new AgeDate();
        int expResult = 1;
        int result = instance.negativeValidation(date);
        assertEquals(expResult, result);
    }
     @Test
    public void testNegativeValidation1() {
        System.out.println("negativeValidation");
        int date = 12;
        AgeDate instance = new AgeDate();
        int expResult = 0;
        int result = instance.negativeValidation(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of leapValidation method, of class AgeDate.
     */
    //Hacer mas pruebas con el leap Validation
    @Test
    public void testLeapValidation() {
        System.out.println("leapValidation");
        Date1 date = new Date1(29,02,2008);
        AgeDate instance = new AgeDate();
        int expResult = 1;
        int result = instance.leapValidation(date);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testLeapValidation1() {
        System.out.println("leapValidation");
        Date1 date = new Date1(28,02,2008);
        AgeDate instance = new AgeDate();
        int expResult = 1;
        int result = instance.leapValidation(date);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of outOfBoundariesValidation method, of class AgeDate.
     */
    //Hacer mas pruebas con la validacion de fuera de los limites
    @Test
    public void testOutOfBoundariesValidation() {
        System.out.println("outOfBoundariesValidation");
        int date = 10;
        String caso = "month";
        int month = 10;
        AgeDate instance = new AgeDate();
        int expResult = 0;
        int result = instance.outOfBoundariesValidation(date, caso, month);
        assertEquals(expResult, result);
    }
    @Test
    public void testOutOfBoundariesValidation1() {
        System.out.println("outOfBoundariesValidation");
        int date = 10;
        String caso = "month";
        int month = 13;
        AgeDate instance = new AgeDate();
        int expResult = 0;
        int result = instance.outOfBoundariesValidation(date, caso, month);
        assertEquals(expResult, result);
    }  
    @Test
    public void testOutOfBoundariesValidation2() {
        System.out.println("outOfBoundariesValidation");
        int date = 10;
        String caso = "day";
        int month = 10;
        AgeDate instance = new AgeDate();
        int expResult = 0;
        int result = instance.outOfBoundariesValidation(date, caso, month);
        assertEquals(expResult, result);
    }
}









