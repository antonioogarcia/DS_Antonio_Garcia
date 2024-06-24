package atvwhile;

import java.util.Scanner;

public class While6 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int ind = 0;
            int maior1 = 0;
            int maior2 = 0;
        
            while (ind < 10) {
                ind++;
                System.out.println("Insira o " + ind + "° número: ");
                int num = teclado.nextInt();
        
                if (num > maior1) {
                    maior2 = maior1; 
                    maior1 = num; 
                } else if (num > maior2) {
                    maior2 = num; 
                }
            }
        
            System.out.println("Os dois maiores números digitados foram: " + maior1 + " e " + maior2);
      }
    }
