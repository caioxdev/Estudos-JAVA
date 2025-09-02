package Exercicio3AlunoStruct;

import Exercicio3AlunoStruct.Model.Aluno;
import Exercicio3AlunoStruct.Model.Endereco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno(); // criar objeto na memória
        aluno.endereco = new Endereco(); // refere-se ao aluno. Por isso aluno.endereco -> ficando assim public Endereco endereco; Na parte aluno.

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Idade: ");
        aluno.idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Rua: ");
        aluno.endereco.rua = sc.nextLine();
        System.out.print("Número: ");
        aluno.endereco.numero = sc.nextInt();

        sc.close();

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Rua informada: " + aluno.endereco.rua);
        System.out.println("Número informado: " + aluno.endereco.numero);
    }
}

/* Nesse exercícios utilizei packages para ficar mais organizado e entender mais
*/