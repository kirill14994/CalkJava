

/*
 * Логика просчета  чисел
 */

public class Logic {

   
    public static void logic(double x, double y, String b) {

        
        double resul;
        switch (b) {
            case "+":
                resul = x + y;
                System.out.println(resul);
                break;

            case "*":
                resul = x * y;
                System.out.println(resul);
                break;

            case "-":
                resul = x - y;
                System.out.println(resul);
                break;

            case "/":
                resul = x / y;
                System.out.println(resul);
                break;

            default:
                System.out.println("Не верные данные. Введите *,+,-,/");
                break;
        }

    }
}
