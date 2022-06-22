import java.util.Scanner;

/*   Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, 
добавив в неё систему логирования.
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите: ");
        System.out.println("1 - Коплексные числа;");
        System.out.println("2 - Рациональные;");
        int choise = sc.nextInt();

        if (choise == 1) {
            System.out.println("Введите вещественную часть первого числа: ");
            double real = sc.nextDouble();
            System.out.println("Введите мнимую часть первого числа: ");
            double img = sc.nextDouble();
            System.out.println("Действие (*,+,-,/): ");
            String swtc = sc.next();

            ComplexNum num = new ComplexNum(real, img);

            System.out.println("Введите вещественную и мнимую часть комплексного числа: ");
            ComplexNum num2 = new ComplexNum(sc.nextDouble(), sc.nextDouble());
            sc.close();

            Logic.logicSec(swtc, num, num2);
        }

        else if (choise == 2) {
            Input start = Input.inputRacio();

            Logic.logic(start.n1, start.n2, start.action);
        }

        else
            System.out.println("Введите 1 или 2.");
    }

}
