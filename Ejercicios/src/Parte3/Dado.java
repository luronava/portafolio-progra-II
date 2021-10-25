package Parte3;
public class Dado {
    private int valor;

    public Dado() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public int tirar() {
        valor = (int)(Math.random()*6+1);
        return valor;
    }
}
