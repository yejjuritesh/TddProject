package com.project;

public class StringCalculator {

    public StringCalculator() {}

    public int add(String input) {
        if(input.equals("")) {
            return 0;
        }else if(input.matches("-?\\d+")) {
            return Integer.parseInt(input);
        }else{
            String[] inputNumbers = input.split(",");
            if(inputNumbers[1].matches("-?\\d+") && inputNumbers[0].matches("-?\\d+")) {
                return Integer.parseInt(inputNumbers[1]) + Integer.parseInt(inputNumbers[0]);
            }
        }
        return -1;
    }

}
