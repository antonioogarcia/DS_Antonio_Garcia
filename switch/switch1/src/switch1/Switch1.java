package switch1;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o código do produto: ");
        int cod = teclado.nextInt();

        switch (cod) {
            case 1:
                System.out.println("O produto é alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("O produto é uma alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("O produto é vestuário");
                break;
            case 7:
                System.out.println("O produto é higiene pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("O produto é limpeza ou utensílios domésticos");
                break;
            default:
                System.out.println("Código de produto inválido");
        }
    }

}
