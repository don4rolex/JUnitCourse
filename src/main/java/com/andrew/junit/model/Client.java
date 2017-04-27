/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junit.model;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Andrew
 */
public interface Client {

    long getId();

    String getName();

    Enum<?> getType();

    List<Collateral> getCollaterals();

    List<Product> getProducts();

    void setProductAmount(BigDecimal productAmount);

    BigDecimal getProductAmount();
}
