/**
 * логика просчета рациональных чисел
 */
public class Racional {

    // public static void main(String[] args) {

    //     // System.out.println(sum(2, 3, 1, 4));
    //     // System.out.println(mult(2, 3, 1, 4));
    //     // System.out.println(sub(2, 3, 1, 4));
    //     // System.out.println(div(2, 3, 1, 4));
    // }

    public  double sum(double n1,double d1, double n2, double d2 ) {   // сумма
        
        return (n1 * d2 + n2 * d1) / (d1* d2); 
    }
    public  double mult(double n1,double d1, double n2, double d2) { // умножение

    return (n1 * n2) / (d1 * d2);
    
    }
    public  double sub(double n1,double d1, double n2, double d2) { // вычитание

    return (n1 * d2 - n2 * d1) / (d1* d2);
    
    }
    public  double div(double n1,double d1, double n2, double d2) { // деление

    return (n1*d2) / (d1*n2);

    
}

}