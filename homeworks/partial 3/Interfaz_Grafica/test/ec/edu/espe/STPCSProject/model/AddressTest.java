/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

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
public class AddressTest {
    
    public AddressTest() {
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
     * Test of getMainStreet method, of class Address.
     */
    @Test
    public void testGetMainStreet() {
        System.out.println("getMainStreet");
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        String expResult = "Calle 1";
        String result = instance.getMainStreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMainStreet method, of class Address.
     */
    @Test
    public void testSetMainStreet() {
        System.out.println("setMainStreet");
        String mainStreet = "";
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        instance.setMainStreet(mainStreet);
    }

    /**
     * Test of getSecondStreet method, of class Address.
     */
    @Test
    public void testGetSecondStreet() {
        System.out.println("getSecondStreet");
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        String expResult = "Calle 2";
        String result = instance.getSecondStreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSecondStreet method, of class Address.
     */
    @Test
    public void testSetSecondStreet() {
        System.out.println("setSecondStreet");
        String secondStreet = "";
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        instance.setSecondStreet(secondStreet);
    }

    /**
     * Test of getCity method, of class Address.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        String expResult = "San Augustin";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCity1() {
        System.out.println("getCity");
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        String expResult = "Calle 1";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }


    /**
     * Test of setCity method, of class Address.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        instance.setCity(city);
    }

    /**
     * Test of getCountry method, of class Address.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        String expResult = "Estados Unidos";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCountry1() {
        System.out.println("getCountry");
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        String expResult = "San Augustin";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }


    /**
     * Test of setCountry method, of class Address.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        Address instance = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
        instance.setCountry(country);
    }
    
}
