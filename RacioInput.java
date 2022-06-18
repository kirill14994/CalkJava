import java.util.Scanner;

public class RacioInput {

    public void input() {
        
        Scanner calc = new Scanner(System.in);
        System.out.println("Рациональные или Комплексные числа?(1/2): ");
        int solution = calc.nextInt();
        System.out.println();

        if (solution == 1) { // счет Рациональные
            Scanner in = new Scanner(System.in);
            System.out.print("Числитель: ");
            int n1 = in.nextInt();
            System.out.println();

            System.out.print("Знаменатель: ");
            int d1 = in.nextInt();
            System.out.println();

            System.out.print("Числитель: ");
            int n2 = in.nextInt();
            System.out.println();

            System.out.print("Знаменатель: ");
            int d2 = in.nextInt();
            System.out.println();

            Scanner string = new Scanner(System.in);
            System.out.print("Действие?\nСложение-1;\nВычитание-2;\nУмножение-3;\nДеление-4;");
            int action = string.nextInt();
            System.out.println();

            in.close();
            string.close();
        }
    }
}