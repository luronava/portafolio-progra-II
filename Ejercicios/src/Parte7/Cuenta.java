package Parte7;

public class Cuenta {
   protected int numeroCuenta;
   protected String cliente;
   protected double balance;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        balance = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   public double depositar(double cantidad)
    {
        return balance+=cantidad;
    }
    
    public boolean retirar(double cantidad)
    {
        if(balance-cantidad>=0)
        {
            balance-=cantidad;
            return true;
        }else
        {
            return false;
        }
    }
}
