package com.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public StringCalculator() {}

    public int add(String input) {

        if(input.equals("")) {

            return 0;

        }else if(input.matches("-?\\d+")) {

            return Integer.parseInt(input);

        }else if(InputValidator(input)){

            String[] inputNumbers = input.split(",|\n");

            int sum=0;

            for(int i=0;i< inputNumbers.length;i++) {

                if (inputNumbers[i].matches("-?\\d+")) {

                    sum += Integer.parseInt(inputNumbers[i]);

                }
            }
            return sum;
        }
        return -1;

    }

    private boolean InputValidator(String input) {

        boolean newLineComma = input.contains("\n,");
        boolean commaNewLine = input.contains(",\n");

        return !(newLineComma || commaNewLine);
    }
}
