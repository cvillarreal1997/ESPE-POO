/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

import java.util.ArrayList;
import java.util.List;
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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of adminUserNamePasswordCreation method, of class Admin.
     */
    @Test
    public void testAdminUserNamePasswordCreation() {
        System.out.println("adminUserNamePasswordCreation");
        String masterUsername = "Admin@2018";
        String masterPassword = "GURL7MjeyZBhCDb";
        String usernameAndPasswordString = "prueba1;prueba;\n";
        Admin instance = new Admin(null,null);
        int expResult = 1;
        int result = instance.adminUserNamePasswordCreation(masterUsername, masterPassword, usernameAndPasswordString);
        assertEquals(expResult, result);
    }
    @Test
    public void testAdminUserNamePasswordCreation1() {
        System.out.println("adminUserNamePasswordCreation");
        String masterUsername = "Admin@2018";
        String masterPassword = "GURL7MjeyZBhCDb";
        String usernameAndPasswordString = "dayanna1;dayanna1;\n";
        Admin instance = new Admin(null,null);
        int expResult = 1;
        int result = instance.adminUserNamePasswordCreation(masterUsername, masterPassword, usernameAndPasswordString);
        assertEquals(expResult, result);
    }
    /**
     * Test of searchCredentialData method, of class Admin.
     */
    @Test
    public void testSearchCredentialData() {
        System.out.println("searchCredentialData");
        String username = "prueba1";
        Admin instance = new Admin(null,null);
        List <String>expResult = new ArrayList<>();;
        expResult.add("prueba1");
        expResult.add("prueba");
        List <String >result = instance.searchCredentialData(username);
        String auxString1 = (String) expResult.get(0);
        assertEquals((String) expResult.get(0),(String) result.get(0));
        assertEquals((String) expResult.get(1),(String) result.get(1));
    }

    /**
     * Test of getMasterUsername method, of class Admin.
     */
    @Test
    public void testGetMasterUsername() {
        System.out.println("getMasterUsername");
        Admin instance = new Admin(null,null);
        String expResult = "Admin@2018";
        String result = instance.getMasterUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMasterPassword method, of class Admin.
     */
    @Test
    public void testGetMasterPassword() {
        System.out.println("getMasterPassword");
        Admin instance = new Admin(null,null);
        String expResult = "GURL7MjeyZBhCDb";
        String result = instance.getMasterPassword();
        assertEquals(expResult, result);
    }
     @Test
    public void testGetMasterPassword1() {
        System.out.println("getMasterPassword");
        Admin instance = new Admin(null,null);
        String expResult = "";
        String result = instance.getMasterPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdminUsername method, of class Admin.
     */
    @Test
    public void testSetAdminUsername() {
        System.out.println("setAdminUsername");
        String adminUsername = "prueba";
        Admin instance = new Admin("null","null");
        instance.setAdminUsername(adminUsername);
        String result = instance.getAdminUsername();
        assertEquals(adminUsername, result);
    }

    /**
     * Test of setAdminPassword method, of class Admin.
     */
    @Test
    public void testSetAdminPassword() {
        System.out.println("setAdminUsername");
        String adminPassword = "prueba";
        Admin instance = new Admin("null","null");
        instance.setAdminPassword(adminPassword);
        String result = instance.getAdminPassword();
        assertEquals(adminPassword, result);
    }

    /**
     * Test of getAdminUsername method, of class Admin.
     */
    @Test
    public void testGetAdminUsername() {
        System.out.println("getAdminUsername");
        Admin instance = new Admin("prueba","prueba");
        String expResult = "prueba";
        String result = instance.getAdminUsername();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAdminUsername1() {
        System.out.println("getAdminUsername");
        Admin instance = new Admin("prueba","prueba");
        String expResult = "";
        String result = instance.getAdminUsername();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAdminUsername2() {
        System.out.println("getAdminUsername");
        Admin instance = new Admin("dayana1","dayana");
        String expResult = "dayana";
        String result = instance.getAdminUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAdminPassword method, of class Admin.
     */
    @Test
    public void testGetAdminPassword() {
        System.out.println("getAdminPassword");
        Admin instance = new Admin("prueba","prueba");
        String expResult = "prueba";
        String result = instance.getAdminPassword();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAdminPassword1() {
        System.out.println("getAdminPassword");
        Admin instance = new Admin("prueba1","prueba");
        String expResult = "prueba1";
        String result = instance.getAdminPassword();
        assertEquals(expResult, result);
    }
}
