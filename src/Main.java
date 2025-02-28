public class Main {
    public static void main(String[] args) {
        NumerosEnteros numerosEnteros = new NumerosEnteros();
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        AnalizadorNumeros analizadorNumeros = new AnalizadorNumeros();

        // Solicitar los números al usuario
        entradaNumeros.pedirNumeros(numerosEnteros.getNumeros());

        // Ordenar los números
        analizadorNumeros.ordenarNumeros(numerosEnteros.getNumeros());

        // Contar pares e impares
        analizadorNumeros.contarParesEImpares(numerosEnteros.getNumeros(), numerosEnteros);

        // Mostrar resultados
        analizadorNumeros.mostrarResultados(numerosEnteros.getNumeros(), numerosEnteros);

        // Cerrar el scanner
        entradaNumeros.cerrarScanner();
    }
}
