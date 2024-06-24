package atvswing;

import javax.swing.*;

public class Atvswing {

    private JFrame frame;
    private JPanel panel;
    private JLabel labelNome, labelIdade, labelResultado;
    private JTextField textFieldNome, textFieldIdade;
    private JButton button;

    public Atvswing() {
      
        frame = new JFrame("Idade da Pessoa");
        panel = new JPanel();
        labelNome = new JLabel("Nome:");
        labelIdade = new JLabel("Idade:");
        labelResultado = new JLabel("Resultado:"); // Adicionando um valor inicial
        textFieldNome = new JTextField(20);
        textFieldIdade = new JTextField(20);
        button = new JButton("Obter Idade");

       
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Configurando o layout do painel
        panel.add(labelNome);
        panel.add(textFieldNome);
        panel.add(labelIdade);
        panel.add(textFieldIdade);
        panel.add(button);
        panel.add(labelResultado);

        frame.add(panel);
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);

     
        button.addActionListener(e -> {
            String nome = textFieldNome.getText();
            try {
                int idade = Integer.parseInt(textFieldIdade.getText());
                String mensagem = nome + " tem " + idade + " anos de idade e é um amorzinho de pessoa!";
                labelResultado.setText(mensagem);
            } catch (NumberFormatException ex) {
                labelResultado.setText("Por favor, insira uma idade válida.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Atvswing());
    }
}
