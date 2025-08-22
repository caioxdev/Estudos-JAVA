/* EXERCÍCIOS
Dado um determinado salário
Se o salário for maior que 4500 imprima 30% do valor
Senão imprima 15%

Desafio: Diga na impressão se é 30% ou 10%
 */

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 5124F;
        float salario2 = 5124F;
        float salario3 = 5124F; // PARTE DO DESAFIO
        float result1, result2;
        float result3 = 0F; // PARA USAR APENAS UMA VARIÁVEL PARA GUARDAR O RESULTADO; DECLARANDO COMO 0
        float resultado = 0F; // PARTE DO DESAFIO
        String porcentagem = ""; // PARTE DO DESAFIO

        if (salario > 4500) {
            result1 = salario * 0.3F;
            System.out.println("30% do salário é: R$ " + result1);
        } else {
            result2 = salario * 0.15F;
            System.out.println("15% do salário é: R$ " + result2);
        }

        // UTILIZANDO APENAS UMA VARIÁVEL PARA GUARDAR O RESULTADO E IMPRIMIR NO FINAL

        if (salario2 > 5000) {
            result3 = salario2 * 0.3F;
            System.out.println("30% do salário é: R$ " + result3);
        } else {
            result3 = salario2 * 0.15F;
            System.out.println("30% do salário é: R$ " + result3);
        }

        // DESAFIO

        if (salario3 > 4500) {
            resultado =  salario3 * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario3 * 0.1F;
            porcentagem = "10%";
        }
        System.out.println("O valor final de " + porcentagem + " é de: R$ " + resultado);
    }
}
