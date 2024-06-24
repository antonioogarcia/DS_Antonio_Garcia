
package atvfor;

import java.util.Scanner;

public class For4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        int n = teclado.nextInt();
        
        System.out.println("\n");
        
        for(int num = 0; num<=n; num++) {
            System.out.println(num);
        }
  
    }
    
}
