/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author alira
 */
public class NoteNGTest {
    
    public NoteNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getNoteId method, of class Note.
     */
    @Test
    public void testGetNoteId() {
        System.out.println("getNoteId");
        Note instance = new Note();
        Integer expResult = null;
        Integer result = instance.getNoteId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoteId method, of class Note.
     */
    @Test
    public void testSetNoteId() {
        System.out.println("setNoteId");
        Integer noteId = null;
        Note instance = new Note();
        instance.setNoteId(noteId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Note.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Note instance = new Note();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Note.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Note instance = new Note();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContents method, of class Note.
     */
    @Test
    public void testGetContents() {
        System.out.println("getContents");
        Note instance = new Note();
        String expResult = "";
        String result = instance.getContents();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContents method, of class Note.
     */
    @Test
    public void testSetContents() {
        System.out.println("setContents");
        String contents = "";
        Note instance = new Note();
        instance.setContents(contents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Note.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Note instance = new Note();
        User expResult = null;
        User result = instance.getOwner();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class Note.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        User owner = null;
        Note instance = new Note();
        instance.setOwner(owner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Note.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Note instance = new Note();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Note.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Note instance = new Note();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Note.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Note instance = new Note();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
