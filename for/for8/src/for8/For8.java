
package for8;

public class For8 {


    public static void main(String[] args) {
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;
        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Número de anos necessários para a população de A ultrapassar ou igualar a população de B: " + anos);
 
    }
    
}
