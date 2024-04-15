
package ex3;


public class Ex3 {

    public static void main(String[] args) {
        double precoGasolina = 3.65;
        double consumoGasolina = 1.43;
        double distancia = 140;
        double  Km_L = distancia/consumoGasolina;
        double total=Km_L*precoGasolina;
        System.out.println("O preco de uma viagem de " + distancia + " Km e de: " + total);
    }
    
}
