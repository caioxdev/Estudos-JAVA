/* Exercício
Crie uma variável que irá guardar o valor de um salário
Calcule a porcentagem desse salário, sendo os valores:
30%
15%
5%
A cada vez que você calculcar guarde o resultado em uma variável
Imprima o resultado e reutiliza a variável que guarda o resultado para o novo cálculo
 */

public class ReutilizarVariavel {
    public static void main(String[] args){
        double salario = 2500;
        double resultado = salario * (30/100D);

        System.out.println("30% é: " + resultado);

        resultado = salario * (15/100D);
        System.out.println("15% é: " + resultado);

        resultado = salario * (5/100D);
        System.out.println("5% é: " + resultado);;
    }
}
