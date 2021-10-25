
package Parte1;

public class Cuenta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double depositar(double cantidad)
    {
        return saldo+=cantidad;
    }
    
    public boolean retirar(double cantidad)
    {
        if(saldo-cantidad>=0)
        {
            saldo-=cantidad;
            return true;
        }else
        {
            return false;
        }
    }
}
