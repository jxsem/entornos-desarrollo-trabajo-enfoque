import java.util.Arrays;

public class AnalizadorNumeros {

    public void ordenarNumeros(int[] numeros) {
        Arrays.sort(numeros);
    }

    public void contarParesEImpares(int[] numeros, NumerosEnteros ne) {
        int pares = 0;
        int impares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        ne.setPares(pares);
        ne.setImpares(impares);
    }

    public void mostrarResultados(int[] numeros, NumerosEnteros ne) {
        System.out.println("\nNúmeros ordenados de menor a mayor:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("\nCantidad de números pares: " + ne.getPares());
        System.out.println("Cantidad de números impares: " + ne.getImpares());
    }
}

