package switch4;

import java.util.Scanner;

public class Switch4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o código do produto: ");
        int cod = teclado.nextInt();
        
        System.out.println("Insira a quantidade desejada: ");
        int quantidade = teclado.nextInt();
        
        double preco;
        
        switch (cod) {
            case 100:
                preco = quantidade*1.70;
                System.out.println("O valor total é: " + preco);
                break;
                  case 101:
                preco = quantidade*2.30;
                System.out.println("O valor total é: " + preco);
                break;
                  case 102:
                preco = quantidade*2.60;
                System.out.println("O valor total é: " + preco);
                break;
                  case 103:
                preco = quantidade*2.40;
                System.out.println("O valor total é: " + preco);
                break;
                  case 104:
                preco = quantidade*2.50;
                System.out.println("O valor total é: " + preco);
                break;
                  case 105:
                 preco = quantidade*1.00;
                System.out.println("O valor total é: " + preco);
                break;
         
            default:
                System.out.println("Código de produto inválido");
        }
    }

}
