import java.util.Scanner;
public class UriAreaCirculo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double raio = teclado.nextDouble();
        float a, b, c;
        double area = 3.14159 * (raio*raio);
        System.out.println(String.format("A=%.4f", area));
    }
 
}