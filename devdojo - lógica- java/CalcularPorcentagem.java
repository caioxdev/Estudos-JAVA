// Crie uma classe que calcule uma determinada porcentagem de um dado salário

public class CalcularPorcentagem {
    public static void main(String[] args){
        float salario = 1500F;
        float porcentagem = 5;
        float porcentagemSalario;

        porcentagemSalario = salario * (porcentagem/100);
        System.out.println(porcentagemSalario);
    }
}

/*
No java tem que falar o tipo do número -> Quando não tem nada ele vai interpretar como int. Mesmo tendo float antes.
Portanto, vai ficar assim: float salario = 1500F;
 */