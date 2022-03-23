import java.util.Scanner;
public class UriSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number = teclado.nextInt();
        int hours = teclado.nextInt();
        double salPerHour = teclado.nextDouble();
        double salary = hours * salPerHour;
        System.out.println("NUMBER = "+number);
        System.out.println(String.format("SALARY = U$ %.2f", salary));
    }
}
