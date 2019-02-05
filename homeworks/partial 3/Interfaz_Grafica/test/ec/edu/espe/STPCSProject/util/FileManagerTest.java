/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.util;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JDIsmael
 */
public class FileManagerTest {
    
    public FileManagerTest() {
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
     * Test of createFile method, of class FileManager.
     */
    @Test
    public void testCreateFile() {
        System.out.println("createFile");
        File name = null;
        FileManager.createFile(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeFile method, of class FileManager.
     */
    @Test
    public void testWriteFile() {
        System.out.println("writeFile");
        File name = null;
        String string = "";
        FileManager.writeFile(name, string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFile method, of class FileManager.
     */
    @Test
    public void testReadFile() {
        System.out.println("readFile");
        File name = null;
        FileManager.readFile(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchInFile method, of class FileManager.
     */
    @Test
    public void testSearchInFile() {
        System.out.println("searchInFile");
        File name = null;
        String searchPerson = "";
        String expResult = "";
        String result = FileManager.searchInFile(name, searchPerson);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyFile method, of class FileManager.
     */
    @Test
    public void testModifyFile() {
        System.out.println("modifyFile");
        File fNew = null;
        String idString = "";
        String InputString = "";
        int expResult = 0;
        int result = FileManager.modifyFile(fNew, idString, InputString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FileManager.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String name = "";
        FileManager instance = new FileManager();
        instance.delete(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDataSplit1() {
        System.out.println("dataSplit");
        String aux = "dario,1719314179,selva alegre,22";
        String[] expResult = null;
        String[] result = FileManager.dataSplit(aux);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testDataSplit2() {
        System.out.println("dataSplit");
        String aux = ";;;;;;;;;;";
        String[] expResult = null;
        String[] result = FileManager.dataSplit(aux);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testDataSplit3() {
        System.out.println("dataSplit");
        String aux = ";/;/;/;/";
        String[] expResult = {"/","/","/","/"};
        String[] result = FileManager.dataSplit(aux);
        assertArrayEquals(expResult, result);
    }
}
