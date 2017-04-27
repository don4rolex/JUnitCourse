/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junit.model;

/**
 *
 * @author Andrew
 */
public enum Currency {

    EURO("EUR"), UNITED_STATES_DOLLAR("USD"), INDIAN_RUPEE("INR");

    private final String textValue;

    Currency(final String textValue) {
        this.textValue = textValue;
    }

    @Override
    public String toString() {
        return textValue;
    }
}
