/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junit.business;

import com.andrew.junit.business.exception.DifferentCurrenciesException;
import com.andrew.junit.model.Amount;
import com.andrew.junit.model.Product;
import java.util.List;

/**
 *
 * @author Andrew
 */
public interface ClientBO {

    Amount getClientProductsSum(List<Product> products) throws DifferentCurrenciesException;

}
