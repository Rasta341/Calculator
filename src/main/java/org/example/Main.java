package org.example;


public class Main {
    public static String calc(String input) throws CalculateException {
        String[] splitted = input.split(" ");
        String result = "";
            if(RomanNumeral.values().equals(Converter.arabicToRoman(splitted[0].charAt(0)))){
                result = RomanianExpression.calculate(splitted);
            } else {
                result = ArabicExpression.calculate(splitted);
            }
        return result;
    }
    public static String calculate(int operandA, String operator, int operandB) {
        int resultOfExpression;
        resultOfExpression = switch (operator) {
            case "+" -> operandA + operandB;
            case "-" -> operandA - operandB;
            case "*" -> operandA * operandB;
            case "/" -> operandA / operandB;
            default -> 0;
        };
        return String.valueOf(resultOfExpression);
    }

}