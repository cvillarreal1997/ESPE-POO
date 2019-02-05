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
public class DateTest {
    
    public DateTest() {
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
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Date1 instance = new Date1(10,10,10);
        int expResult = 10;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDay method, of class Date.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 0;
        Date1 instance = new Date1(0,0,0);
        instance.setDay(day);
        int result = instance.getDay();
        assertEquals(day, result);
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Date1 instance = new Date1(10,10,10);
        int expResult = 10;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMonth method, of class Date.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 10;
        Date1 instance = new Date1(0,0,0);
        instance.setMonth(month);
        int result = instance.getMonth();
        assertEquals(month, result);
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Date1 instance = new Date1(10,10,2000);
        int expResult = 2000;
        int result = instance.getYear();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setYear method, of class Date.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        Date1 instance = new Date1(0,0,0);
        instance.setYear(year);
        int result = instance.getYear();
        assertEquals(year, result);
    }

    /**
     * Test of getActualYear method, of class Date.
     */
    @Test
    public void testGetActualYear() {
        System.out.println("getActualYear");
        Date1 instance = new Date1(0,0,0);
        int expResult = 2018;
        int result = instance.getActualYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getActualMonth method, of class Date.
     */
    @Test
    public void testGetActualMonth() {
        System.out.println("getActualMonth");
        Date1 instance = new Date1(0,0,0);
        int expResult = 11;
        int result = instance.getActualMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getActualDay method, of class Date.
     */
    @Test
    public void testGetActualDay() {
        System.out.println("getActualDay");
        Date1 instance = new Date1(0,0,0);
        int expResult   = 13;
        int result = instance.getActualDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonthsArray method, of class Date.
     */
    @Test
    public void testGetMonthsArray() {
        System.out.println("getMonthsArray");
        Date1 instance = new Date1(0,0,0);
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
        ArrayList<Integer> result = instance.getMonthsArray();
        assertEquals(expResult, result);
    }
    
}
