
package atvfor;

import java.util.Scanner;


public class For11 {

   
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = teclado.nextInt();
        int fatorial = 1;
        
        for(int a=num; a>0; a--) {
            fatorial *= a;
            System.out.println("O fatorial desse número é: " + fatorial);
        }
    }
    
}
