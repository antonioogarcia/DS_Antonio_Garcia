package atvwhile;

import java.util.Scanner;

public class While5 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        
            float comp = 0; 
            int ind = 1;
            while(ind <= 10){
                System.out.println("Insira o " + ind + "° número: ");
                float num = teclado.nextFloat();
        
                if(num > comp){
                    comp = num;
                }
                ind++;
            }
                System.out.println("O maior número digitado foi: " + comp);
      }
    }
