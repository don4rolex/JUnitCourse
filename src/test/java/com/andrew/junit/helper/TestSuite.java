/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Andrew
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({QuickBeforeAfterTest.class, StringHelperTest.class, ArraysCompareTest.class})
public class TestSuite {
    
}
