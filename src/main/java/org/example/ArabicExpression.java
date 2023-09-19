package org.example;

public class ArabicExpression {
    public static String calculate(String[] input) throws NumberFormatException {
        int operandA = Integer.parseInt(input[0]);
        int operandB = Integer.parseInt(input[2]);
        String operator = input[1];
        return Main.calculate(operandA, operator, operandB);
    }
}
