package calcul;


import calcul.operation.Operation;
import calcul.operation.OperationFactory;
import exception.InvalidInputException;

import java.util.Scanner;

public class Calculator {
    public void performCalculation() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = scanner.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            Operation operation = OperationFactory.getOperation(operator);

            double result = operation.calculate(num1, num2);

            System.out.println("결과: " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}

