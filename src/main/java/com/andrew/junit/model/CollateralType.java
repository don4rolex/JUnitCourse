/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junit.model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Andrew
 */
public enum CollateralType {

    REAL_ESTATE("REA"), BONDS("BND"), MUTUAL_FUNDS("MFD"), STOCKS("STK");

    private final String textValue;

    /**
     * All collateral types classified as securities.
     */
    public static final List<CollateralType> SECURITIES = Arrays.asList(BONDS, MUTUAL_FUNDS, STOCKS);

    CollateralType(final String textValue) {
        this.textValue = textValue;
    }

    @Override
    public String toString() {
        return textValue;
    }
}
