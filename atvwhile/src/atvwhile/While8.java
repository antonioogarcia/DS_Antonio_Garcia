package atvwhile;

import java.util.Scanner;

public class While8 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Insira um número entre 1 e 20: ");
            int lado = teclado.nextInt();
            teclado.close();
    
            System.out.println();
    
            while (lado < 1 || lado > 20) {
                System.out.println("Valor inválido");
                return;
            }
    
            for (int i = 0; i < lado; i++) { 
                System.out.print("*");
            }
            System.out.println();
    
            for (int i = 0; i < lado - 2; i++) { 
                System.out.print("*");
                for (int j = 0; j < lado - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            for (int i = 0; i < lado; i++) { 
                System.out.print("*");
            }
            System.out.println();
      }
    }
