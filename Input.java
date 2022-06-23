import java.util.Scanner;

public class Input {
    public double racNum1;
    public double racNum2;
    public String action;
    ComplexNum ComplxNum1 = new ComplexNum();
    ComplexNum ComplxNum2 = new ComplexNum();

    public Input(String action, Double n1, Double n2) {
        this.racNum1 = n1;
        this.racNum2 = n2;
        this.action = action;
    }

    public Input(String action, ComplexNum num1, ComplexNum num2) {
        this.action = action;
        this.ComplxNum1 = num1;
        this.ComplxNum2 = num2;
    }

    public Input() {
        super();
    }

    public Input inputRacio() {

        Scanner inp = new Scanner(System.in);
        System.out.print("Число 1: ");
        Double racNum1 = inp.nextDouble();

        System.out.print("Число 2: ");
        Double racNum2 = inp.nextDouble();

        System.out.print("Действие (*,+,-,/): ");
        String action = inp.next();

        inp.close();

        return new Input(action, racNum1, racNum2 );

    }

    public Input inputCompelx() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите вещественную и мнимую часть 1-ого комплексного числа: ");
        ComplexNum num1 = new ComplexNum(inp.nextDouble(), inp.nextDouble());
        System.out.println("Действие (*,+,-,/): ");
        String action = inp.next();

        

        System.out.println("Введите вещественную и мнимую часть 2-ого комплексного числа: ");
        ComplexNum num2 = new ComplexNum(inp.nextDouble(), inp.nextDouble());
        inp.close();

        return new Input(action, num1, num2);
    }

}
