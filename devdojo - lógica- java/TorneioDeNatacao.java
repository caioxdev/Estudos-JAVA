/* Exercício IF-ELSE
Eu como usuário gostaria de ter o nome e a idade de participantes de um torneio de natação e que o sistema imprimisse da seguinte forma:
Menor que 11 anos: <Nome> participará da categoria Infantil
Entre que 11 e 15 anos: <Nome> participará da categoria Juvenil
Entre que 16 e 19 anos: <Nome> participará da categoria Pré-adulto
Acima de 20 anos: <Nome> participará da categoria Adulto
para que eu possa rapidamente classificar todos os participantes

Leitura complementar:
. Processos de desenvolvimento de software
. Metodologias ágeis
. SCRUM
*/

public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "João";
        int idade = 15;

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infatil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
