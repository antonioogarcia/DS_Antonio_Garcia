package array;

import java.util.Scanner;

public class Ar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int menorValor;

        
        System.out.println("Insira 10 valores inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        menorValor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }

       
        System.out.println("O menor valor é: " + menorValor);

    } 
}
