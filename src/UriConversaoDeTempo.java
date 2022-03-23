import java.io.IOException;
import java.util.Scanner;
public class UriConversaoDeTempo {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int totalSegundos = teclado.nextInt();
        int horas = totalSegundos / 3600;
        int restoHoras = totalSegundos % 3600;
        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;
        int segundos = restoMinutos;
        System.out.println(horas+":"+minutos+":"+segundos);
    }
 
}