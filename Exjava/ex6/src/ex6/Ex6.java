package ex6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira a quantidade total de eleitores: ");
        int total = teclado.nextInt();
           
        System.out.println("Insira o total de votos brancos: ");
        int brancos = teclado.nextInt();
           
        System.out.println("Insira o total de votos nulos: ");
        int nulos = teclado.nextInt();
           
        System.out.println("Insira o total de votos v�lidos: ");
        int validos = teclado.nextInt();


        double porcentagemBrancos = (brancos * 100.0) / total;
        double porcentagemNulos = (nulos * 100.0) / total;
        double porcentagemValidos = (validos * 100.0) / total;


        int totalBrancos = brancos;
        int totalNulos = nulos;
        int totalValidos = validos;

        System.out.println("A quantidade de votos totais �: " + total + ". E a porcentagem de votos Brancos, Nulos e V�lidos, �, respectivamente: " + 
            porcentagemBrancos + "% " + porcentagemNulos + "% " + porcentagemValidos + "%");
    }  
}
