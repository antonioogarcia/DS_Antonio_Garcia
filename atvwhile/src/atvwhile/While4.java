package atvwhile;

import java.util.Scanner;

public class While4 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a quantidade de alunos: ");
        int alunos = teclado.nextInt();

        float notaSala = 0;
        int ind= 0;
       
        while (ind < alunos) {
            ind++;
            System.out.println("Insira a nota do "+ ind + "° aluno: ");
            float notaAluno = teclado.nextFloat();
    
            
            notaSala = notaSala + notaAluno;
        }
    
        float media = notaSala / alunos;
        System.out.println("A média da sala foi " + media);
    
      }
    }
