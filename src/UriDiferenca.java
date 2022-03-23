import java.io.IOException;
import java.util.Scanner;
public class UriDiferenca {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = "+diferenca);
    }
 
}