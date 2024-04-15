
package for5;

import java.util.Scanner;

public class For5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira um número de 1 a 10: ");
        int n = teclado.nextInt();
        
        System.out.println("");
        
        for(int num = 0; num<=10; num++) {
            int mult = num*n;
            System.out.println(mult);
        }
        
    }
    
}
