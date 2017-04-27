/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junitcourse;

import java.util.Arrays;
import org.junit.Test;

/**
 *
 * @author Andrew
 */
public class ArraysPerformanceTest {

    @Test(timeout = 500)
    public void testPerformance() {
        for (int i = 0; i < 1000000; i++) {
            Arrays.sort(new int[]{i, i - 1, i + 1});
        }
    }
}
