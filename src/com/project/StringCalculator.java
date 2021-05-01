package com.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public StringCalculator() {}

    public int add(String input) throws Exception {

        if(input.equals("")) {

            return 0;

        }else if(input.matches("-?\\d+")) {

            return Integer.parseInt(input);

        }else if(InputValidator(input)){

            String delimiter=";";

            if(input.startsWith("//")){
                if(input.charAt(2)!='['){
                    delimiter = input.substring(2, 3);
                    input = input.substring(2, input.length());
                }else{
                    int j=2;
                    delimiter="";
                    while(input.charAt(j)!='\\'){
                        delimiter += input.substring(j, j+1);
                        j++;
                    }
                    input = input.substring(j+2);
                }
            }

            String regex = ",|\n|\\n|"+delimiter;


            String[] inputNumbers = input.split(regex);

            int sum=0;

            for(int i=0;i< inputNumbers.length;i++) {

                String negatives = "Contains negative numbers: ";

                if (inputNumbers[i].matches("\\d*")) {

                    try {
                        int number = Integer.parseInt(inputNumbers[i]);
                        if (number <= 1000) {
                            sum += Integer.parseInt(inputNumbers[i]);
                        }
                    }catch(Exception e){ System.out.print(inputNumbers[i]);}

                } else if(inputNumbers[i].matches("^-\\d+$")){
                    negatives += inputNumbers[i] + " ";
                }

                if (!negatives.equals("Contains negative numbers: ")) throw new Exception(negatives);

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
