
package atvfor;


public class For10 {


    public static void main(String[] args) {
   int a = 0, b = 1, c;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500: ");

        while (a <= 500) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(); 
    }
    }
   
    
