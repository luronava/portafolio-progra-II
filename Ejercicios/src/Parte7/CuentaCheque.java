package Parte7;

public class CuentaCheque extends Cuenta {

    public CuentaCheque(int numeroCuenta, String cliente) {
        super(numeroCuenta, cliente);
    }

    public boolean retirar(double cantidad) {
        balance -= cantidad;
        return true;
    }
}
