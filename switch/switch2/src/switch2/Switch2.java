package switch2;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        int nota1 = teclado.nextInt();

        System.out.println("Insira a segunda nota: ");
        int nota2 = teclado.nextInt();
        
        int media = (nota1+nota2)/2;
        
        switch (media) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Sua média é " + media + ". Você foi reprovado!");
                break;
            case 5:
            case 6:
            case 7:
               System.out.println("Sua média é " + media + ". Você está de exame!");
               break;
            case 8:
            case 9:
            case 10:
                System.out.println("Sua média é " + media + ". Você foi aprovado!");
                break;
            default:
                System.out.println("Notas inseridas inválidas");
        }
    }

}
