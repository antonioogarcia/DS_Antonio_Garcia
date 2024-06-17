
package carroprojeto;


public class CarroProjeto {

   
    public static void main(String[] args) {
            carro car = new carro();
            car.vel = 70;
            car.nome = "Uno";
            car.marca = "Fiat";
            car.ano = 2015;
            
            car.acel(10);
            System.out.println("Velocidade acelerada: " + car.vel);
            
            car.frear(10);
            System.out.println("Velocidade freada: " + car.vel);
            
            car.buzina();
            System.out.println("FonFon");
            
            System.out.println("A marca do carro é: " + car.marca + ". O modelo é: " + car.nome);
    }
    
}
