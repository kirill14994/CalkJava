import java.util.Scanner;

/*   Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, 
добавив в неё систему логирования.
*/

public class Calculator {

    public static void main(String[] args) {

        Input a = inputValues();

        Logic.logic(a.n1, a.n2, a.action);

       
    }

    public static Input inputValues() {  //Вводим значения  и  знак выражения

        Scanner in = new Scanner(System.in);
        System.out.print("Число X: ");
        Double n1 = in.nextDouble();

        System.out.print("Число Y: ");
        Double n2 = in.nextDouble();

        System.out.print("Действие: ");
        String action = in.next();

        System.out.printf("Вы ввели: %f \n", n1);
        System.out.printf("Вы ввели: %f \n", n2);
        System.out.printf("Вы ввели: %s \n", action);

        in.close();

        return new Input(n1, n2, action);

    }

}
