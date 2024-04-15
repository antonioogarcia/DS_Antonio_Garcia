
package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
           System.out.println("Insira sua idade em anos: ");
           int anos = teclado.nextInt();
           anos = anos*365;
           
           System.out.println("Insira os meses da sua idade:");
           int meses = teclado.nextInt();
           meses = meses*30;
           
           System.out.println("Insira os dias da sua idade: ");
           int dias = teclado.nextInt();
           
           int total = dias+meses+anos;
           System.out.println("A quantidade totais de dias que você viveu é: " + total);
              
    }
    
}
