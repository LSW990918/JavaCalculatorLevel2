package calcul.calculate;

import calcul.operation.Operation;

public class Subtract extends Operation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}
