import java.util.Scanner;

public class Input {
    public double n1;
    public double n2;
    public String action;

    public Input(Double n1, Double n2, String action) {  // конструктор значений

        this.n1 = n1;

        this.n2 = n2;

        this.action = action;
    }

    public static Input inputRacio() {  //Вводим значения  и  знак выражения

        Scanner in = new Scanner(System.in);
        System.out.print("Число X: ");
        Double n1 = in.nextDouble();

        System.out.print("Число Y: ");
        Double n2 = in.nextDouble();

        System.out.print("Действие (*,+,-,/): ");
        String action = in.next();

        // System.out.printf("Вы ввели: %f \n", n1);
        // System.out.printf("Вы ввели: %f \n", n2);
        // System.out.printf("Вы ввели: %s \n", action);

        in.close();

        return new Input(n1, n2, action);

    }

    


    
}
