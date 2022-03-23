import java.util.Scanner;
public class UriCalculoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        double C = teclado.nextDouble();
        int D = teclado.nextInt();
        int E = teclado.nextInt();
        double F = teclado.nextDouble();
        double total = (B*C) + (E*F);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
