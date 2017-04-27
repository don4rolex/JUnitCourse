/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junitcourse;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Andrew
 */
public class StringHelperTest {
    
    private StringHelper helper;
    
    public StringHelperTest() {
        helper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions2() {
        assertEquals("CD", helper.truncateAInFirst2Positions("CD"));
    }
    
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
    
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
    
}
