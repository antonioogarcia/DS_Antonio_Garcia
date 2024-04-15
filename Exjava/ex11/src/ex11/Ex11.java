package ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o tipo de combustível (A para álcool e G para gasolina): ");
        String tipo = teclado.nextLine();

        System.out.println("Insira a quantidade de litros vendidos: ");
        double totalLitros = teclado.nextDouble();

        if (tipo.equals("A")) {
            if (totalLitros <= 20) {
                double valorAlcool = totalLitros * 2.90;
                valorAlcool = valorAlcool - totalLitros * 0.03 * 2.90;
                System.out.println("Você tem 3% de desconto por litro, o valor com desconto é: " + valorAlcool);
            } else {
                double valorAlcool = totalLitros * 2.90;
                valorAlcool = valorAlcool - totalLitros * 0.05 * 2.90;
                System.out.println("Você tem 5% de desconto por litro, o valor com desconto é: " + valorAlcool);
            }
        } else if (tipo.equals("G")) {
            if (totalLitros <= 20) {
                double valorGasolina = totalLitros * 3.30;
                valorGasolina = valorGasolina - totalLitros * 0.04 * 3.30;
                System.out.println("Você tem 4% de desconto por litro, o valor com desconto é: " + valorGasolina);
            } else {
                double valorGasolina = totalLitros * 3.30;
                valorGasolina = valorGasolina - totalLitros * 0.06 * 3.30;
                System.out.println("Você tem 6% de desconto por litro, o valor com desconto é: " + valorGasolina);
            }
        } else {
            System.out.println("Dado inválido!");
        }
    }
}
