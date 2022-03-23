import java.util.Scanner;
public class UriDistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        double distancia = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println(String.format("%.4f", distancia));
    }
}
