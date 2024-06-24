
package atvoptionpane;
import javax.swing.JOptionPane;

public class optnpanefor {
 public static void main(String[] args) {
       for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite um número:");
            int numero = Integer.parseInt(input);
            int resultado = numero * 5;
            JOptionPane.showMessageDialog(null, "O número inserido multiplicado por 5 é: " + resultado);
        }
    
    }
    
}
