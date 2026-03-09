//9..Oo;;ll))}}
import java.util.Scanner;

public class ejercicio1 {

    public static int calcularCien(int cantidad) {
        return cantidad / 100;
    }

    public static int calcularCincuenta(int cantidad) {
        return (cantidad % 100) / 50;
    }

    public static int calcularVeinte(int cantidad) {
        return (cantidad % 100 % 50) / 20;
    }

    public static int calcularCinco(int cantidad) {
        return (cantidad % 100 % 50 % 20) / 5;
    }

    public static int calcularDos(int cantidad) {
        return (cantidad % 100 % 50 % 20 % 5) / 2;
    }

    public static int calcularUno(int cantidad) {
        return (cantidad % 100 % 50 % 20 % 5 % 2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de dinero: ");
            int cantidad = scanner.nextInt();

            int billetes100 = calcularCien(cantidad);
            int billetes50 = calcularCincuenta(cantidad);
            int billetes20 = calcularVeinte(cantidad);
            int monedas5 = calcularCinco(cantidad);
            int monedas2 = calcularDos(cantidad);
            int monedas1 = calcularUno(cantidad);

            System.out.println("Cantidad: $" + cantidad);
            System.out.println("Billetes de 100: " + billetes100);
            System.out.println("Billetes de 50: " + billetes50);
            System.out.println("Billetes de 20: " + billetes20);
            System.out.println("Monedas de 5: " + monedas5);
            System.out.println("Monedas de 2: " + monedas2);
            System.out.println("Monedas de 1: " + monedas1);
        }
    }
}

