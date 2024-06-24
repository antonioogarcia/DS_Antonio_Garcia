package array;

import java.util.Scanner;

public class Ar2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int num [] = new int [10];
    int men = 0;   
    int ind = 0;

    System.out.println("Insira o " + ind + " número inteiro: ");
        num[ind] = teclado.nextInt();
    men = num[ind];

    ind++;

    while(ind < 10){
        System.out.println("Insira o " + ind + "° número inteiro: ");
        num[ind] = teclado.nextInt();

        if(men >= num[ind]){
            men = num[ind]; 
        }

        ind++;
    }

    System.out.println("O menor número digitado: " + men);

    System.out.println("\n Insira o número procurado: ");
    int proc = teclado.nextInt();

    ind = 0; 
    while(ind < 10){
        if(proc == num[ind]){
            proc = ind;
            
        } 
        ind++;
    }

    System.out.println("\nO número procurado está no vetor[" + proc + "]");

    } 
}
