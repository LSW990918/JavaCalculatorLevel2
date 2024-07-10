package calcul.calculate;

import calcul.operation.Operation;

public class Divide extends Operation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return num1 / num2;
    }
}
