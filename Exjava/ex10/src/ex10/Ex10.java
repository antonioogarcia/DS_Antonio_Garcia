package ex10;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Insira sua altura (em M): ");
        double altura = teclado.nextDouble();

        System.out.println("Insira seu sexo (M para masculino e F para feminino): ");
        String sexo = teclado.next();

        if (sexo.equals("M")) {
            double peso_ideal = (72.7 * altura) - 58;
            System.out.println(nome + ", o peso ideal para sua altura é: " + peso_ideal);
        } else if (sexo.equals("F")) {
            double peso_ideal = (62.1 * altura) - 44.7;
            System.out.println(nome + ", o peso ideal para sua altura é: " + peso_ideal);
        } else {
            System.out.println("Sexo inválido!");
        }
    }
}
