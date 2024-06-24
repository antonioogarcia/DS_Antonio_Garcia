package atvwhile;

import java.util.Scanner;

public class While3 {
    
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        
            System.out.println("Insira um número: ");
            int num = teclado.nextInt();
        
            num = num - 1;
            int ind = 0;
            while (ind < num) {
                ind = ind + 2;
                int impar = ind - 1;
                int par = ind;
        
                System.out.println("Números pares: " + par + " !! Números ímpares: " + impar);
            }
      }
    }
