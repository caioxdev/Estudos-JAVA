import java.util.Scanner;

public class UtilizandoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome =  sc.nextLine(); // Lê uma linha inteira de texto (String)

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt(); // Lê um número inteiro

        System.out.println("Você é o " + nome + " e tem " + idade + " anos.");

        sc.close(); // Fechar o Scanner
    }
}

/*  TIPOS DE SCANNER - sc.

nextLine()    -> Lê uma linha inteira (String)   => Exemplo de uso: String nome    = sc.nextLine();

next()        -> Lê uma palavra (até espaço)     => Exemplo de uso: String palavra = sc.next();

nextInt()     -> Lê números inteiros (int)       => Exemplo de uso: int idade      = sc.nextInt();

nextFloat()   -> Lê números decimais menores     => Exemplo de uso: float preco    = sc.nextFloat();

nextDouble()  -> Lê números decimais (double)    => Exemplo de uso: double altura  = sc.nextDouble();

nextLong()    -> Lê números inteiros grandes     => Exemplo de uso: long pop       = sc.nextLong();

nextShort()   -> Lê números inteiros pequeno     => Exemplo de uso: short idade    = sc.nestShort();

nextByte()    -> Lê números muitos pequenos      => Exemplo de uso: byte b         = sc.nextByte();

nextBoolean() -> Lê valor lógico (true ou false) => Exemplo de uso: boolean ativo  = sc.nextBoolean();

 */