/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junitcourse;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Andrew
 */
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
    
    private StringHelper helper = new StringHelper();
    private String input, outputExpected;

    public StringHelperParameterizedTest(String input, String outputExpected) {
        this.input = input;
        this.outputExpected = outputExpected;
    }
    
    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs[][] = {{"AACD","CD"}, {"ACD","CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(outputExpected, helper.truncateAInFirst2Positions(input));
    }
}
