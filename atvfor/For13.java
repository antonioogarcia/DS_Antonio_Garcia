
package atvfor;

import java.util.Scanner;


public class For13 {

   
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Quantos números você deseja inserir? ");
          int n = scanner.nextInt();
  
          if (n <= 0) {
              System.out.println("A quantidade tem que ser maior que 0!");
              return;
          }
  
          int[] numeros = new int[n];
  
          System.out.println("Insira os números (apenas números menores que 1000 e maiores que 0): ");
          for (int a = 0; a < n; a++) {
              System.out.print("Número " + (i + 1) + ": ");
              if (numero > 0 && numero < 1000) {
                numeros[a] = numero;
            } else {
                System.out.println("O número digitado é maior que 1000 ou menor que 0. Tente novamente.");
                a--; 
            }
        }

          }
  
          int menorValor = numeros[0];
          int maiorValor = numeros[0];
          int soma = 0;
  
          for (int i = 0; i < n; i++) {
              if (numeros[i] < menorValor) {
                  menorValor = numeros[i];
              }
              if (numeros[i] > maiorValor) {
                  maiorValor = numeros[i];
              }
              soma += numeros[i];
          }
  
          System.out.println("Menor valor: " + menorValor);
          System.out.println("Maior valor: " + maiorValor);
          System.out.println("Soma dos valores: " + soma);
  
    }

