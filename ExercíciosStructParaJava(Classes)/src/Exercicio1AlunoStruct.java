import java.util.Scanner;

public class Exercicio1AlunoStruct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        System.out.print("Nome: ");
        aluno1.nome = sc.nextLine();
        System.out.print("Idade: ");
        aluno1.idade = sc.nextInt();
        sc.nextLine(); // Esse sc.nextLine() e para limpar o buffer, ou seja, ele não conta o \n (enter) -> se não usar ele vai pular linha que não era para pular.

        System.out.print("Nome: ");
        aluno2.nome = sc.nextLine();
        System.out.print("Idade: ");
        aluno2.idade = sc.nextInt();

        sc.close();

        System.out.println("Aluno 1: " + aluno1.nome + ", " + aluno1.idade);
        System.out.println("Aluno 2: " + aluno2.nome + ", " + aluno2.idade);


    }

    static class Aluno {
        String nome;
        int idade;
    }
}

/* Nesse exercício estou usando o static no class Aluno, pq está dentro de outra class.
*/