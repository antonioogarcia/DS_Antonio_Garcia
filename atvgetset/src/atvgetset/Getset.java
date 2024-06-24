package atvgetset;

public class Getset {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Tony");
        cliente1.setSobrenome("Garcia");

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Sobrenome: " + cliente1.getSobrenome());
    }

    public static class Cliente {
        private String sobrenome;
        private String nome;

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String novoSobrenome) {
            this.sobrenome = novoSobrenome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String novoNome) {
            this.nome = novoNome;
        }
    }

}
