import java.util.Scanner;

/*   Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, 
добавив в неё систему логирования.
*/


 public class Calculator {
 
    
 
 public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        System.out.println("Рациональные или Комплексные числа?(1/2): ");
        int solution = calc.nextInt();
        System.out.println();

        Racional racio = new Racional();
        Complex comp = new Complex();
        

        if(solution==1){     // счет Рациональные
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

        calc.close();
        in.close();
        string.close();

        
        if(action == 1) 
        {
            double sum = racio.sum(n1, d1, n2, d2);
            System.out.println("Ответ: "+sum);
        }
        else if (action == 2) {
            double sub = racio.sub(n1, d1, n2, d2);
            System.out.println("Ответ: "+sub);
            
        } 
        else if (action == 3) {
            double mult = racio.mult(n1, d1, n2, d2);
            System.out.println("Ответ: "+mult);
            
        }else if (action == 4) {
            double div = racio.div(n1, d1, n2, d2);
            System.out.println("Ответ: "+div);
            
        } else {
            System.out.println("Не верные данные");
        }
    }
    if (solution==2) { // счет Комплексные
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int n1 = in.nextInt();
        System.out.println();

        System.out.print("B: ");
        int d1 = in.nextInt();
        System.out.println();

        System.out.print("C: ");
        int n2 = in.nextInt();
        System.out.println();
        
        System.out.print("D: ");
        int d2 = in.nextInt();
        System.out.println();

        Scanner string = new Scanner(System.in);
        System.out.print("Действие?\nСложение-1;\nВычитание-2;\nУмножение-3;\nДеление-4;");
        int action = string.nextInt();
        System.out.println();

        calc.close();
        in.close();
        string.close();

        if(action == 1)  
        {
            double sum = comp.sum(n1, d1, n2, d2);
            System.out.println("Ответ: "+sum+"j");
        }
        else if (action == 2) {
            //double sub = comp.sub(n1, d1, n2, d2);
            //System.out.println("Ответ: "+sub);
            
        } 
        else if (action == 3) {
            double mult = comp.mult(n1, d1, n2, d2);
            System.out.println("Ответ: "+mult);
            
        }else if (action == 4) {
            double div = comp.Div(n1, d1, n2, d2);
            System.out.println("Ответ: "+div);
            
        } else {
            System.out.println("Не верные данные");
        }

        
    } else {

        System.out.println("Не верные данные");
    }

     
    
    }

}


 

 