public class NumerosEnteros {
    private final int[] numeros;
    private int pares;
    private int impares;

    public NumerosEnteros() {
        this.numeros = new int[10];
        this.pares = 0;
        this.impares = 0;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        System.arraycopy(numeros, 0, this.numeros, 0, numeros.length);
    }

    public int getPares() {
        return pares;
    }

    public int getImpares() {
        return impares;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }

    public void setImpares(int impares) {
        this.impares = impares;
    }
}

