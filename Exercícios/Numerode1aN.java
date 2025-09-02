import java.util.Scanner;

public class Numerode1aN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, most;
        int i = 1;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (; i <= n; i++) {
            most = i;
            System.out.println(most);
        }
    }
}

/*
Mostrar os números de 1 até o número digitado
 */