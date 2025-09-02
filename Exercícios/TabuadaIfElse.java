import java.util.Scanner;

public class TabuadaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int som, subt, mult, div;

        // Selecionar a operação
        System.out.print("Selecione a operação que você que fazer (+, -, * e /): ");
        String opera = sc.nextLine();
        System.out.println();

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (opera.equals("+")) {
            som = n1 + n2;
            System.out.println();
            System.out.println("A soma entre os números é: " + som);
        } else if (opera.equals("-")) {
            subt = n1 - n2;
            System.out.println();
            System.out.println("A subtração ente os números é: " + subt);
        } else if (opera.equals("*")) {
            mult = n1 * n2;
            System.out.println();
            System.out.println("A multiplicação entre os números é: " + mult);
        } else {
            div = n1 / n2;
            System.out.println();
            System.out.println("A divisão entre os números é: " + div);
        }
        sc.close();
    }
}