package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }
    @Test
    public void returnText(){
        Rock roca = new Rock();
        String message= roca.GetRock();
        assertEquals("Rock",message);
    }
    
}
