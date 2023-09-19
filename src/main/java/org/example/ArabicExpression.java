package org.example;

public class ArabicExpression {
    public static String calculate(String[] input) {
        try {
            int operandA = Integer.parseInt(input[0]);
            int operandB = Integer.parseInt(input[2]);
            String operator = input[1];
            return Main.calculate(operandA, operator, operandB);
        } catch (NumberFormatException e) {
            System.out.println("Метод принимает только выражения формата 1 + 1 или I + I, проверьте ввод и повторите");
        }
        return "";
    }
}
