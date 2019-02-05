/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.util;

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
public class ValidationsTest {
    
    public ValidationsTest() {
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
     * Test of onlyDigit method, of class Validations.
     */
    @Test
    public void testOnlyDigit() {
        System.out.println("onlyDigit");
        String digit = "";
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.onlyDigit(digit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationOfIdentifyCard method, of class Validations.
     */
    @Test
    public void testValidationOfIdentifyCard() {
        System.out.println("validationOfIdentifyCard");
        String identifyCard = "";
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.validationOfIdentifyCard(identifyCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationRuc method, of class Validations.
     */
    @Test
    public void testValidationRuc() {
        System.out.println("validationRuc");
        String RUC = "";
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.validationRuc(RUC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationMonth method, of class Validations.
     */
    @Test
    public void testValidationMonth_int() {
        System.out.println("validationMonth");
        int num = 0;
        Validations instance = new Validations();
        instance.validationMonth(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationDay method, of class Validations.
     */
    @Test
    public void testValidationDay_int() {
        System.out.println("validationDay");
        int num = 0;
        Validations instance = new Validations();
        instance.validationDay(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationAge method, of class Validations.
     */
    @Test
    public void testValidationAge() {
        System.out.println("validationAge");
        int num = 0;
        Validations instance = new Validations();
        instance.validationAge(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationPhoneNumber method, of class Validations.
     */
    @Test
    public void testValidationPhoneNumber() {
        System.out.println("validationPhoneNumber");
        String phoneNumber = "";
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.validationPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationPhoneNumber2 method, of class Validations.
     */
    @Test
    public void testValidationPhoneNumber2() {
        System.out.println("validationPhoneNumber2");
        String phoneNumber2 = "";
        Validations instance = new Validations();
        boolean expResult = false;
        boolean result = instance.validationPhoneNumber2(phoneNumber2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberScanInt method, of class Validations.
     */
    @Test
    public void testNumberScanInt() {
        System.out.println("numberScanInt");
        Validations instance = new Validations();
        int expResult = 0;
        int result = instance.numberScanInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberScanFloat method, of class Validations.
     */
    @Test
    public void testNumberScanFloat() {
        System.out.println("numberScanFloat");
        Validations instance = new Validations();
        float expResult = 0.0F;
        float result = instance.numberScanFloat();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationDay method, of class Validations.
     */
    @Test
    public void testValidationDay_0args() {
        System.out.println("validationDay");
        Validations instance = new Validations();
        int expResult = 0;
        int result = instance.validationDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationMonth method, of class Validations.
     */
    @Test
    public void testValidationMonth_0args() {
        System.out.println("validationMonth");
        Validations instance = new Validations();
        int expResult = 0;
        int result = instance.validationMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validationYear method, of class Validations.
     */
    @Test
    public void testValidationYear() {
        System.out.println("validationYear");
        Validations instance = new Validations();
        int expResult = 0;
        int result = instance.validationYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
