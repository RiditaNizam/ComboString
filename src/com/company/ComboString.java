package com.company;

/**
 * Created by ridita on 5/11/17.
 */
public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
