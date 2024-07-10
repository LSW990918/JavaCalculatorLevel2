package calcul.operation;

import calcul.calculate.Add;
import calcul.calculate.Divide;
import calcul.calculate.Multiply;
import calcul.calculate.Subtract;
import exception.InvalidInputException;

public class OperationFactory {
    public static Operation getOperation(char operator) throws InvalidInputException {
        switch (operator) {
            case '+':
                return new Add();
            case '-':
                return new Subtract();
            case '*':
                return new Multiply();
            case '/':
                return new Divide();
            default:
                throw new InvalidInputException("잘못된 연산 기호입니다: " + operator);
        }
    }
}
