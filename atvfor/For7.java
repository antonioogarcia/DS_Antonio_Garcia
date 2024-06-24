
package atvfor;

import java.util.Scanner;

public class For7 {


    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Insira um número:");
         int num = teclado.nextInt();
         
         for(int a=1; a<=10; a++) {
             System.out.println("A tabuada de tal número é: " + a*num);
         }
    }
    
}
