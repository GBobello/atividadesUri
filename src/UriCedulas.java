import java.io.IOException;
import java.util.Scanner;
public class UriCedulas {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int notas = teclado.nextInt();
        int total = notas;
        int n100 = total/100;
        total -= n100 * 100;
        int n50 = total/50;
        total -= n50 * 50;
        int n20 = total/20;
        total -= n20 * 20;
        int n10 = total/10;
        total -= n10 * 10;
        int n5 = total/5;
        total -= n5 * 5;
        int n2 = total/2;
        total -= n2 * 2;
        int n1 = total;
        System.out.println(notas);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
 
}