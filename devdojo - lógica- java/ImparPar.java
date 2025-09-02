/* EXERCÍCIOS
Dado um determinado número inteiro
imprima se ele é ímpar ou por
 */

public class ImparPar {
    public static void main(String[] args) {
        int numero = 6;

        if (numero % 2 == 0) {
            System.out.println("O número '" + numero + "' é par!");
        } else {
            System.out.println("O número '" + numero + "' é ímpar!");
        }
    }
}
