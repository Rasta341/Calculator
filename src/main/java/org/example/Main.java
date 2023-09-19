package org.example;


public class Main {
    public static String calc(String input) throws CalculateException {
        String[] splitted = input.split(" ");
        String result = "";
        var num = splitted[0].charAt(0);
        if(Character.isDigit(num)) result = ArabicExpression.calculate(splitted);
        else result = RomanianExpression.calculate(splitted);
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