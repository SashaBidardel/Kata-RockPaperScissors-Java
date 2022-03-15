package com.factoriaf5.rps.models;
import static org.junit.Assert.*;

import org.junit.Test;
public class ScissorsTest {
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }
    @Test
    public void returnText(){
        Scissors scissors= new Scissors();
        String message= scissors.GetScissors();
        assertEquals("Scissors",message);
    }
}
