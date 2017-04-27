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
public interface Product {

    long getId();
    String getName();
    ProductType getType();
    Amount getAmount();
}
