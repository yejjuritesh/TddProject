package com.project;

public class StringCalculator {

    public StringCalculator() {}

    public int add(String input) {
        if(input.equals(""))
            return 0;
        return Integer.parseInt(input);
    }

}
