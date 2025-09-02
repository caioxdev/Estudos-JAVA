import java.util.Scanner;

public class Exercicio2AlunoStruct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[2];  // Usando array

        alunos[0] = new Aluno();   // criando os objetos
        alunos[1] = new Aluno();

        System.out.print("Nome: ");
        alunos[0].nome = sc.nextLine();
        System.out.print("Idade: ");
        alunos[0].idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        alunos[1].nome = sc.nextLine();
        System.out.print("Idade: ");
        alunos[1].idade = sc.nextInt();

        sc.close();

        System.out.println("Aluno1: " +  alunos[0].nome + ", " + alunos[0].idade);
        System.out.println("Aluno2: " +  alunos[1].nome + ", " + alunos[1].idade);


    }
}

class Aluno {       // Utilizando class Aluno sem o static pq está fora de uma class
    String nome;
    int idade;
}