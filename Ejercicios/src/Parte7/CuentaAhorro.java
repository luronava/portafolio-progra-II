package Parte7;

public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(int numeroCuenta, String cliente) {
        super(numeroCuenta, cliente);
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
    
    public double calcularInteres()
    {
        double interes = balance*.02;
        balance += interes;
        return interes;
    }
}
