
/*
 * Логика просчета  чисел
 */

public class Logic {

    public void logicRac(Input inputRacio) {

        switch (inputRacio.action) {
            case "+":
                System.out.printf("Result: %.2f", inputRacio.racNum1 + inputRacio.racNum2);
                break;

            case "*":
                System.out.printf("Result: %.2f", inputRacio.racNum1 * inputRacio.racNum2);
                break;

            case "-":
                System.out.printf("Result: %.2f", inputRacio.racNum1 - inputRacio.racNum2);
                break;

            case "/":
                System.out.printf("Result: %.2f", inputRacio.racNum1 / inputRacio.racNum2);
                break;

            default:
                System.out.println("Не верные данные. Введите *,+,-,/");
                break;
        }
    }

    public void logicSec(Input inputComplex) {
        switch (inputComplex.action) {
            case "+": {
                inputComplex.ComplxNum1.printResult(inputComplex.ComplxNum1.complexSum(inputComplex.ComplxNum2));
                break;
            }

            case "-": {
                inputComplex.ComplxNum1.printResult(inputComplex.ComplxNum1.complexDiff(inputComplex.ComplxNum2));
                break;
            }

            case "*": {
                inputComplex.ComplxNum1.printResult(inputComplex.ComplxNum1.complexMultiply(inputComplex.ComplxNum2));
                break;
            }
            case "/": {
                inputComplex.ComplxNum1.printResult(inputComplex.ComplxNum1.complexDivide(inputComplex.ComplxNum2));
                break;
            }
            default: {
                System.out.println("Ошибка.");
            }
        }

    }

}
