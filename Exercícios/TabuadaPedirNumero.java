import java.util.Scanner;

public class TabuadaPedirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, mult;
        int i = 1;

        System.out.print("Digite número: ");
        n = sc.nextInt();


        for (; i < 11; i++) {
            mult = n * i;
            System.out.println(n + " x " + i + " = " + mult);
        }
    }
}