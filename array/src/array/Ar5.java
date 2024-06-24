package array;

import java.util.Scanner;

public class Ar5 {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
    int matriz[][] = new int [4][4];
    int i = 0;
    int j = 0;
    int maior = 0;
    int menor = 0;
    int procurado = 0;
    int procurado_i = -1;
    int procurado_j = -1;


    System.out.println("Insira o número da matriz[" + i + "][" + j + "]: ");
    matriz[i][j] = teclado.nextInt();
    menor = matriz[i][j];
    j++;

    while(i < 4){
        while(j < 4){
            System.out.println("Insira o número da matriz[" + i + "][" + j + "]: ");
            matriz[i][j] = teclado.nextInt();

            if(menor >= matriz[i][j]){
                menor = matriz[i][j]; 
            }
            if (maior <= matriz[i][j]) {
                maior = matriz[i][j];
            }
            j++;
        }
        j = 0;
        i++;
    }    
    i = 0;
    j = 0; 

    System.out.println();
    System.out.println("O menor número digitado: " + menor);
    System.out.println("O maior número digitado: " + maior);
    System.out.println();

    System.out.println("Insira o número procurado: ");
    procurado = teclado.nextInt();

    while(i < 4){
        while(j < 4){
            if (procurado == matriz[i][j]) {
                procurado_i = i;
                procurado_j = j;
            }
            j++;
        }
        j = 0;
        i++;
    }
    if (procurado_i == -1 && procurado_j == -1) {
       System.out.println("\nEste não foi um número digitado"); 
    }
    else{
    System.out.println("\nO número procurado está na matriz[" + procurado_i + "][" + procurado_j + "]");
    }
        
    }
}

