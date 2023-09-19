package org.example;

public class RomanianExpression {
    public static String calculate(String[] input) throws CalculateException{
        int resultOfExpression = 0;
        int operandA = Converter.romanToArabic(input[0]);
        String operator = input[1];
        int operandB = Converter.romanToArabic(input[2]);
            if(operandA < operandB) {
            throw new CalculateException("Результат выражения не может быть меньше 0");
            } else {
            resultOfExpression = Integer.parseInt(Main.calculate(operandA, operator, operandB));
            }
        return Converter.arabicToRoman(resultOfExpression);
    }
}
