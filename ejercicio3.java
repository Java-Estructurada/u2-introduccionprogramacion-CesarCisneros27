//9..Oo;;ll))}}
import java.util.Scanner;

public class ejercicio3 {

    public static int calcularDias(int segundos) {
        return segundos / 86400;
    }

    public static int calcularHoras(int segundos) {
        int residuoDias = segundos % 86400;
        return residuoDias / 3600;
    }

    public static int calcularMinutos(int segundos) {
        int residuoDias = segundos % 86400;
        int residuoHoras = residuoDias % 3600;
        return residuoHoras / 60;
    }

    public static int calcularSegundos(int segundos) {
        int residuoDias = segundos % 86400;
        int residuoHoras = residuoDias % 3600;
        int residuoMinutos = residuoHoras % 60;
        return residuoMinutos;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad total de segundos: ");
            int totalSegundos = scanner.nextInt();

            int dias = calcularDias(totalSegundos);
            int horas = calcularHoras(totalSegundos);
            int minutos = calcularMinutos(totalSegundos);
            int segundos = calcularSegundos(totalSegundos);

            System.out.println("Equivalente: " + dias + " : " + horas + " : " + minutos + " : " + segundos);
        }
    }
}
