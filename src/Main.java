import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que gestiona la entrada, ordenación y análisis de números enteros.
 */
class NumerosEnteros {
    private int[] numeros;
    private int pares;
    private int impares;
    private Scanner scanner;

    /**
     * Constructor que inicializa el array de numeros y el Scanner.
     */
    public NumerosEnteros() {
        numeros = new int[10];
        pares = 0;
        impares = 0;
        scanner = new Scanner(System.in);
    }

    /**
     * Metodo para solicitar los 10 numeros enteros al usuario.
     */
    public void pedirNumeros() {
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

    /**
     * Metodo para leer un número entero desde el teclado.
     *
     * @return El número ingresado por el usuario.
     */
    private int leerNumero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            scanner.next(); // Limpiar buffer
        }
        return scanner.nextInt();
    }

    /**
     * Metodo para validar el número ingresado.
     *
     * @param num Número a validar.
     * @return true si es válido, false en caso contrario.
     */
    private boolean validarNumero(int num) {
        return true; // Se podría añadir más validaciones si es necesario
    }

    /**
     * Metodo para ordenar los números de menor a mayor.
     */
    public void ordenarNumeros() {
        Arrays.sort(numeros);
    }

    /**
     * Metodo para contar cuántos números son pares e impares.
     */
    public void contarParesEImpares() {
        pares = 0;
        impares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
    }

    /**
     * Metodo para mostrar los resultados en pantalla.
     */
    public void mostrarResultados() {
        System.out.println("\nNúmeros ordenados de menor a mayor:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    /**
     * Metodo para cerrar el scanner.
     */
    public void cerrarScanner() {
        scanner.close();
    }
}

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        NumerosEnteros numerosEnteros = new NumerosEnteros();

        numerosEnteros.pedirNumeros();
        numerosEnteros.ordenarNumeros();
        numerosEnteros.contarParesEImpares();
        numerosEnteros.mostrarResultados();
        numerosEnteros.cerrarScanner();
    }
}
