package array;

import java.util.Scanner;

public class Ar4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maiorValor, menorValor;

        System.out.println("Insira os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        maiorValor = matriz[0][0];
        menorValor = matriz[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }


        System.out.println("O maior valor na matriz é: " + maiorValor);
        System.out.println("O menor valor na matriz é: " + menorValor);
        }
        
    }

