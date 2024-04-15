package ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o custo de fábrica do carro: ");
        double total = teclado.nextDouble();
           
        double distribuidor = total * 0.28; 
        double imposto = distribuidor * 0.45; 

        total = total + distribuidor + imposto;

        System.out.println("O valor para o consumidor é: " + total);
    }
}
