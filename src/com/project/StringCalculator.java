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
            int sum=0;
            for(int i=0;i< inputNumbers.length;i++) {
                if (inputNumbers[i].matches("-?\\d+")) {
                    sum += Integer.parseInt(inputNumbers[i]);
                }
            }
            return sum;
        }
    }
}
