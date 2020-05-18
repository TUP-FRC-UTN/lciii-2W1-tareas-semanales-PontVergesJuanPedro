
package banco;

public class CuentaCorriente extends Cuenta {
    private double acuerdo;

    public CuentaCorriente(double acuerdo) {
        this.acuerdo = acuerdo;
    }

    @Override
    public void depositar(double monto) {
        super.saldo += monto;
    }

    @Override
    public void extraer(double monto) {
        if ((super.saldo - monto) > this.acuerdo) {
            super.saldo -= monto;
        }
    }
}
