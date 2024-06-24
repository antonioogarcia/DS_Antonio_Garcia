package atvwhile;

import java.util.Scanner;

public class While7 {
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
        for(int ind = 0; ind < lado; ind++){
            for(int ind2 = 0; ind2 < lado; ind2++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
      }
    }
