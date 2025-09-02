public class TabuadaFixa3 {
    public static void main(String[] args) {
        int n = 3;
        int mult = 1;

        for (int i = 1; i < 11; i++) {
            mult = n * i;
            System.out.println(n + " x " + i + " = " + mult);
        }
    }
}