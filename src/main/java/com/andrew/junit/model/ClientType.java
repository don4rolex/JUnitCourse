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
public enum ClientType {

    /**
     *
     */
    PRIVATE("P"),
    /**
     *
     */
    BUSINESS("Z");

    private final String textValue;

    /**
     * List of natural person types.
     */
    public static final List<String> NATURAL_PERSON_TYPES = Arrays.asList(ClientType.PRIVATE.toString());

    /**
     * List of corporate types.
     */
    public static final List<String> CORPORATE_TYPES = Arrays.asList(ClientType.BUSINESS.toString());

    ClientType(final String textValue) {
        this.textValue = textValue;
    }

    @Override
    public String toString() {
        return textValue;
    }
}
