
/*
 * Логика просчета  чисел
 */

public class Logic {

    public static void logic(double x, double y, String b) {

        double resul;
        switch (b) {
            case "+":
                resul = x + y;
                System.out.printf("%.2f", resul);
                break;

            case "*":
                resul = x * y;
                System.out.printf("%.2f", resul);
                break;

            case "-":
                resul = x - y;
                System.out.printf("%.2f", resul);
                break;

            case "/":
                resul = x / y;
                System.out.printf("%.2f", resul);
                break;

            default:
                System.out.println("Не верные данные. Введите *,+,-,/");
                break;
        }

    }

    public static void logicSec(String swtc, ComplexNum num, ComplexNum num2) {
        switch (swtc) {
            case "+": {
                num.printResult(num.complexAdd(num2));
                break;
            }

            case "-": {
                num.printResult(num.complexReduce(num2));
                break;
            }

            case "*": {
                num.printResult(num.complexMultiply(num2));
                break;
            }
            case "/": {
                num.printResult(num.complexDivide(num2));
                break;
            }
            default: {
                System.out.println("Ошибка.");
            }
        }

    }

}
