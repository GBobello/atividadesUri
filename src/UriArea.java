import java.util.Scanner;
public class UriArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double triangulo = (A*C)/2;
        double circulo = 3.14159 * (C*C);
        double trapezio = ((A+B)*C)/2;
        double quadrado = B*B;
        double retangulo = A*B;
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));
    }
}
