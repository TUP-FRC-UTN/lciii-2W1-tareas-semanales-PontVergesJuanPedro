
package empresa;

public class Material {
    String descripcion;
    int codigo;
    float valorUnitario;
    
    public Material(String descripcion, int codigo, float valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }
    
    public String getDescripicon() {
        return this.descripcion;
    }
    
    public void setDescripcion(String a) {
        this.descripcion = a;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int a) {
        this.codigo = a;
    }
    
    public float getValorUnitario() {
        return this.valorUnitario;
    }
    
    public void setValorUnitario(float a) {
        this.valorUnitario = a;
    }
    
    public String toString() {
        return this.descripcion + " " + this.codigo + " " + this.valorUnitario;
    }
}
