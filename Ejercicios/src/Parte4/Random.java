package Parte4;


public class Random {
    private static int valor = ((50 * 25173) + 13849) % 65536;
    
    public static int getValor() {
        valor = ((valor * 25173) + 13849) % 65536;
        return valor;
    }
    
}
