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
public class CollateralImpl implements Collateral {

    private long id;
    private String name;
    private CollateralType type;

    public CollateralImpl(long id, String name, CollateralType type) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public CollateralType getType() {
        return type;
    }

    public void setType(CollateralType type) {
        this.type = type;
    }

}
