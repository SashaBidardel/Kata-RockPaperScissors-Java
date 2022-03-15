package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaperTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }
    @Test
    public void returnText(){
        Paper paper = new Paper();
        String message= paper.GetPaper();
        assertEquals("Paper",message);
    }
    
}