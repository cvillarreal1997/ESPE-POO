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
public class InventoryTest {
    
    public InventoryTest() {
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
     * Test of getMaterial method, of class Inventory.
     */
    @Test
    public void testGetMaterial() {
        System.out.println("getMaterial");
        Inventory instance = new Inventory();
        Material expResult = null;
        Material result = instance.getMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaterial method, of class Inventory.
     */
    @Test
    public void testSetMaterial() {
        System.out.println("setMaterial");
        Material material = null;
        Inventory instance = new Inventory();
        instance.setMaterial(material);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Inventory.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Inventory instance = new Inventory();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Inventory.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Inventory instance = new Inventory();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlaceCode method, of class Inventory.
     */
    @Test
    public void testGetPlaceCode() {
        System.out.println("getPlaceCode");
        Inventory instance = new Inventory();
        int expResult = 0;
        int result = instance.getPlaceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlaceCode method, of class Inventory.
     */
    @Test
    public void testSetPlaceCode() {
        System.out.println("setPlaceCode");
        int placeCode = 0;
        Inventory instance = new Inventory();
        instance.setPlaceCode(placeCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Inventory.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Inventory instance = new Inventory();
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Inventory.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Inventory instance = new Inventory();
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inventoryNewInput method, of class Inventory.
     */
    @Test
    public void testInventoryNewInput() {
        System.out.println("inventoryNewInput");
        String IDCode = "";
        String name = "";
        String typeOfMaterial = "";
        int placeCode = 0;
        int quantity = 0;
        Inventory instance = new Inventory();
        String expResult = "";
        String result = instance.inventoryNewInput(IDCode, name, typeOfMaterial, placeCode, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dataInput method, of class Inventory.
     */
    @Test
    public void testDataInput() {
        System.out.println("dataInput");
        Inventory instance = new Inventory();
        ArrayList expResult = null;
        ArrayList result = instance.dataInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchInInventory method, of class Inventory.
     */
    @Test
    public void testSearchInInventory() {
        System.out.println("searchInInventory");
        String IDCode = "";
        Inventory instance = new Inventory();
        String expResult = "";
        String result = instance.searchInInventory(IDCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printInventory method, of class Inventory.
     */
    @Test
    public void testPrintInventory() {
        System.out.println("printInventory");
        Inventory instance = new Inventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyInventory method, of class Inventory.
     */
    @Test
    public void testModifyInventory() {
        System.out.println("modifyInventory");
        String IDCode = "";
        Inventory instance = new Inventory();
        String expResult = "";
        String result = instance.modifyInventory(IDCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
