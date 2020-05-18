
package empresa;


public class Producto {
    String descripcion;
    Material[] materiales;
    float costoTotal;
    boolean bandera;
    int cantMenorPrecio;
    float[] vectorMenorPrecio = new float[20];
    
    public Producto(int cantMateriales, String descripcion, float costoTotal){
        materiales = new Material[cantMateriales];
        
    }
    
   public void agregarMaterial( Material nuevo ) {
       for (int i = 0; i < materiales.length; i++) {
           if(materiales[i] == null) {
               materiales[i] = nuevo;
           }
       }
   }
   
   public float costoTotal(){
       for (int i = 0; i < materiales.length; i++) {
           if(materiales[i] != null) {
               this.costoTotal += materiales[i].getValorUnitario();
           }
       }
       return this.costoTotal;
   }
   
   public boolean formaParteDelProducto(int codigo){
       for (int i = 0; i < materiales.length; i++) {
           if (materiales[i] != null) {
               if(materiales[i].getCodigo() == codigo) {
                   bandera = true;
               }
               else {
                   bandera = false;
               }
           }
       }
       return bandera;
   }
   
   public float[] cantMaterialesMenor(float valorUnitario) {
       for (int i = 0; i < vectorMenorPrecio.length; i++) {
           vectorMenorPrecio[i] = 0;
       }
        for (int i = 0; i < materiales.length; i++) {
           if (materiales[i] != null) {
               if (materiales[i].getValorUnitario() < valorUnitario) {
                   vectorMenorPrecio[i] = materiales[i].getValorUnitario();
               }
           }
       }
       return vectorMenorPrecio;
   }
   
   public String toString() {
       return this.descripcion + " " + this.costoTotal + " " + materiales.toString();
   }

}
