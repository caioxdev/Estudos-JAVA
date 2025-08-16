/*
Cria uma classe chamada CalculadorDiferencaIdade
Crie uma variável para guardar a primeira idade
Crie uma variável para guardar a segunda idade
Crie uma variável para guardar a diferença entre a idade 1 e a idade 2 
Imprima a diferença no console
*/

//Resolução

public class CalculadorDiferencaIdade {
	public static void main(String[] args){
		int PrimeiraIdade = 20;
		int SegundaIdade = 10;
		int diferenca;

		diferenca = PrimeiraIdade - SegundaIdade;

		System.out.println(diferenca + " anos de diferenca de idade.");
	}
}