package ex9;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o salário fixo: ");
        double fixo = teclado.nextDouble();

        System.out.println("Insira o total de vendas: ");
        double totalVendas = teclado.nextDouble();

        System.out.println("Insira o valor que recebe por carro vendido (em R$): ");
        double valorCarro = teclado.nextDouble();

        System.out.println("Insira o número de carros vendidos: ");
        double totalCarros = teclado.nextDouble();

        totalVendas = totalVendas*0.05;
        totalCarros = valorCarro*totalCarros;

        double total = totalCarros + valorCarro + fixo + totalVendas;
          System.out.println("O salário final é: " + total);
    }
}
