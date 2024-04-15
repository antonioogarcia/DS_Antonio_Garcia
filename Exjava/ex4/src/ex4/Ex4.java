
package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
           System.out.println("Insira um número: ");
           
           int numero = teclado.nextInt();
           int antecessor = numero - 1;
           System.out.println("Seu antecessor e: " + antecessor);
    }
    
}
