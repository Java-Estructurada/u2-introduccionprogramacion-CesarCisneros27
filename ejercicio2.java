//9..Oo;;ll))}}
import java.util.Scanner;

public class ejercicio2 {

    public static double cuadrado(double numero) {
        return numero * numero;
    }  
    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        double sumaCuadrados = cuadrado(diferenciaX) + cuadrado(diferenciaY);
        return raizCuadrada(sumaCuadrados);
    }
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {    
        System.out.print("Ingrese x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese y2: ");
        double y2 = scanner.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("Distancia: " + distancia);
    }
    }
} 