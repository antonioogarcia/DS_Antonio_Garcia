package ex7;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o seu salário: ");
        double total = teclado.nextDouble();
           
        System.out.println("Insira o reajuste do seu salário (%): ");
        int reajuste = teclado.nextInt();
        
        total = total + (total * (reajuste / 100.0)); 
        System.out.println("O seu salário ajustado é: " + total);
    }
}
