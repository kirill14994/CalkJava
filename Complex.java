/*
 * Логика просчета комплексных чисел
 */

public class Complex {
    
    public static void main(String[] args) {
        
        for(int i=0;i<sub(3,5,3,7).length;i++) {
            System.out.print(sub(3,5,3,7)[i] + " ");
          }

    }

    public  double sum(double n1,double d1, double n2, double d2 ) {   // сумма
        
        return (n1+n2)+(d1+d2);
    }
    public  double mult(double n1,double d1, double n2, double d2) { // умножение

    return (n1*n2-d1*d2)+(d1*n2+n1*d2);
    
    }
    public static int[] sub(int n1,int d1, int n2, int d2) { // вычитание
        int first = n1-n2;
        int second = d1-d2;
        
        int[] a={first,second};
        return  a; 

    
    }

    public int Div(int n1,int d1, int n2, int d2) { // деление
        
        int first = (n1*n2+d1*d2)/(n1^2+d2^2);
        int second = ((d1*n2-n1*d2)/n2^2+d2^2);
        
        return first;
    }
 
}

