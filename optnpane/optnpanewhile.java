
package atvoptionpane;

import javax.swing.JOptionPane;


public class optnpanewhile {
public static void main(String[] args) {
        int cont = 0;
        while (cont < 5) {
            String input = JOptionPane.showInputDialog("Digite um número:");
            if (input != null) { // Verifica se o usuário não cancelou a entrada
                int numero = Integer.parseInt(input);
                int resultado = numero * 5;
                JOptionPane.showMessageDialog(null, "O número inserido multiplicado por 5 é: " + resultado);
                cont++;
            } else {
                // Se o usuário cancelar a entrada, sair do loop
                break;
            }
        }
    }
}
