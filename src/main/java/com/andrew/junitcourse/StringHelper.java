/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.junitcourse;

/**
 *
 * @author Andrew
 */
public class StringHelper {

    public String truncateAInFirst2Positions(String str) {
        if (str.length() <= 2) {
            return str.replaceAll("A", "");
        }

        String first2Chars = str.substring(0, 2);
        String stringMinusFirst2Chars = str.substring(2);

        return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
    }

    public boolean areFirstAndLastTwoCharactersTheSame(String str) {

        if (str.length() <= 1) {
            return false;
        }
        if (str.length() == 2) {
            return true;
        }

        String first2Chars = str.substring(0, 2);

        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);
    }

}
