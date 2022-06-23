import java.util.Scanner;

public class Controller {
    public void start() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите: ");
        System.out.println("1 - Коплексные числа;");
        System.out.println("2 - Рациональные;");
        int choise = scan.nextInt();

        if (choise == 1) {
            Input inpt = new Input();

            Logic calc = new Logic();
            calc.logicSec(inpt.inputCompelx());
        }

        else if (choise == 2) {
            Input inpt = new Input();
            Logic calc = new Logic();

            calc.logicRac(inpt.inputRacio());
        }

        else
            System.out.println("Введите 1 или 2.");

        scan.close();
    }
}
