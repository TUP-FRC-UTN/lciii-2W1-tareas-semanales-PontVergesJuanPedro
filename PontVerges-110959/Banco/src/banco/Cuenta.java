
package banco;

public abstract class Cuenta {
    protected int numero;
    protected String nombre;
    protected double saldo;


    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
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
    
    
    
    public abstract void depositar(double monto);
    public abstract void extraer(double monto);
    
    
    
}
