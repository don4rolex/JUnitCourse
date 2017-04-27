/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junit.business;

import com.andrew.junit.business.exception.DifferentCurrenciesException;
import com.andrew.junit.model.Amount;
import com.andrew.junit.model.AmountImpl;
import com.andrew.junit.model.Currency;
import com.andrew.junit.model.Product;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Andrew
 */
public class ClientBOImpl implements ClientBO {

    /*
     * (non-Javadoc)
     * 
     * @see com.clarity.model.ClientBO#getClientProductsSum(java.util.List)
     */
    @Override
    public Amount getClientProductsSum(List<Product> products) throws DifferentCurrenciesException {

        if (products.size() == 0) {
            return new AmountImpl(BigDecimal.ZERO, Currency.EURO);
        }

        if (!isCurrencySameForAllProducts(products)) {
            throw new DifferentCurrenciesException();
        }

        BigDecimal productSum = calculateProductSum(products);

        Currency firstProductCurrency = products.get(0).getAmount().getCurrency();

        return new AmountImpl(productSum, firstProductCurrency);
    }

    private BigDecimal calculateProductSum(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        // Calculate Sum of Products
        for (Product product : products) {
            sum = sum.add(product.getAmount().getValue());
        }
        return sum;
    }

    private boolean isCurrencySameForAllProducts(List<Product> products)throws DifferentCurrenciesException {

        Currency firstProductCurrency = products.get(0).getAmount().getCurrency();

        for (Product product : products) {
            boolean currencySameAsFirstProduct = product.getAmount()
                    .getCurrency().equals(firstProductCurrency);
            if (!currencySameAsFirstProduct) {
                return false;
            }
        }

        return true;
    }

}
