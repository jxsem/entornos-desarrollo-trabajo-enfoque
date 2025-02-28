import java.util.Scanner;

public class EntradaNumeros {
    private final Scanner scanner;

    public EntradaNumeros() {
        this.scanner = new Scanner(System.in);
    }

    public int leerNumero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            scanner.next(); // Limpiar buffer
        }
        return scanner.nextInt();
    }

    public void cerrarScanner() {
        scanner.close();
    }

    public void pedirNumeros(int[] numeros) {
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = leerNumero();
            } while (!validarNumero(num));

            numeros[i] = num;
        }
    }

    private boolean validarNumero(int num) {
        return true; // Se podría añadir más validaciones si es necesario
    }
}
