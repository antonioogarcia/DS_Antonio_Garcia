package array;

public class Ar3 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};
  
        System.out.println("Vetor original:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        inverterVetor(vetor);
        
        System.out.println("Vetor invertido:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void inverterVetor(int[] vetor) {
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
    }
}
