import java.util.Scanner;
public class UriSalarioComBonus {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        double salary = keyboard.nextDouble();
        double sale = keyboard.nextDouble();
        double salaryWithBonus = (sale*0.15)+salary;
        System.out.println(String.format("TOTAL = R$ %.2f", salaryWithBonus));
    }
}
