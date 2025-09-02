//String, char e boolean

public class TestandoVariaveis {
    public static void main(String[] args) {
        char masculino = 'M';
        char feminino = 'F';
        String nome = "Aqui pode digitar uma frase bem grande";
        boolean condicao = true;
        boolean ligado = true;
        boolean maiorDeIdade = false;

        System.out.println(masculino);
        System.out.println(feminino);
        System.out.println(masculino + feminino);
        System.out.println("" + masculino + feminino);
        System.out.println(nome);
        System.out.println(condicao);

        //exemplo boolean com if/else - ligado
        //se o que está dentro do if for verdadeiro, vai rodar o que está dentro do if, caso contrário, vai rodar o que está fora (no caso o else).

        if(ligado){
            System.out.println("A luz está acesa");
        } else {
            System.out.println("A luz está apagada");
        }


        //exemplo boolean com if/else - maior de idade
        //se o que está dentro do if for verdadeiro, vai rodar o que está dentro do if, caso contrário, vai rodar o que está fora (no caso o else).

        if(maiorDeIdade){
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não pode entrar");
        }
    }
}

// CHAR -> Ex: char masculino = 'M';
/*
O que é? Um único caractere, como 'A', 'S', '%d' etc.
Para que serve: Quando quer armazenar um único símbolo, letra ou número.
Quando usar: . Para inicial de nome: 'C'.
             . Para sexo: 'M' ou 'F'.
             . Para verificar um caractere específico em texto.
 */

// STRING -> Ex: String mensagem = "Olá, posso escrever uma frase grande";
/*
O que é? Uma sequência de caracteres.
Para que serve: Quando você armazenar palavras, frases ou textos longos.
Quando usar: . Frases ou qualquer conteúdo textual.
 */

// BOOLEAN -> boolean ligado = true;
/*
O que é? Só pode ser dois valores: true(v) ou false(f).
Para que serve: Para verificar condições, fazer decisões no código.
Quando usar: . Testar se algo é verdadeiro/falso.
             . Controle de fluxos(if, while, for e do-while).
 */