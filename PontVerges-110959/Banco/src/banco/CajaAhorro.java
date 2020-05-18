
package banco;

public class CajaAhorro extends Cuenta{
    
    public CajaAhorro() {
        super.saldo = 0;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
    @Override
    public void depositar(double monto) {
        super.saldo += monto;
    }

    @Override
    public void extraer(double monto) {
        if ((super.saldo - monto) <= 0) {
            System.out.println("No tiene dinero para extraer");
        } else
            super.saldo -= monto;
    }
  
}
