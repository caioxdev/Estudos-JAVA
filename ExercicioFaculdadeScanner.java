import java.util.Scanner;

public class ExercicioFaculdadeScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PEDIR NOME
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        // PEDIR IDADE
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // PEDIR ALTURA
        System.out.print("Digite sua altura: ");
        float altura = sc.nextFloat();

        // PEDIR PESO
        System.out.print("Digite seu peso: ");
        float peso = sc.nextFloat();
        System.out.println();

        System.out.println("######### RESUMO #########");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}
