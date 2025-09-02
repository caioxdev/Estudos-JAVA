public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = {82, 50, 71, 63, 85, 43, 39, 97, 14};
        int n = 9;
        int i, j, chave;

        for (i = 1; i < n; i++) {
            chave = vetor[i];
            j = i - 1;

            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
        System.out.println("Resultado: ");
        for (i = 0; i < n; i++) {
            System.out.print(" " + vetor[i]);
        }
    }
}