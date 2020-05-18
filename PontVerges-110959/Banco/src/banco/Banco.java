
package banco;


public class Banco {

    public static void main(String[] args) {
        Cuenta c1 = new CajaAhorro();
        Cuenta c2 = new CuentaCorriente(-100);
        
        c1.setNombre("Cuenta C1");
        c1.depositar(1000);
        c1.extraer(500);
        c1.extraer(2000);
        System.out.println(c1.getNombre() + " " + c1.getSaldo());
        
        c2.depositar(100);
        
        c2.extraer(200);
        
        System.out.println(c2.getSaldo());
    }
    
}
