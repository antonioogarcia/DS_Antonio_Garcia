package switch3;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = teclado.nextInt();
        
        System.out.println("Insira 1 se deseja realizar a média - 2 se deseja realizar subtração - 3 se deseja multiplicação - 4 se deseja divisão: ");
        int opera = teclado.nextInt();
        int media = (num1+num2)/2;
        int dif = num1-num2;
        int prod = num1*num2;
        double div = num1/num2;
        
        switch (opera) {
            case 1:
                System.out.println("A média de seus números é: " + media);
                break;
            case 2:
                System.out.println("a diferença entre os números: " + dif);
                break;
            case 3:
                System.out.println("O produto dos números é: " + prod);
                break;
            case 4:
                System.out.println("A divisão ente os números é: " + div);
                break;

        }
    }

}
