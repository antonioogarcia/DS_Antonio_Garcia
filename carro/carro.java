
package carroprojeto;


public class carro {
      
    int vel;
    int ano;
    String nome;
    String marca;
    
    void acel(int aceleração) {
        if (aceleração>20) {
            System.out.println("A aceleração é menor que 20 Km/h");
        }
        else {
        vel+=aceleração;
        }
    }
    
    void frear(int freio) {
        vel-=freio;
    }
    void buzina() {
        
    }
}
