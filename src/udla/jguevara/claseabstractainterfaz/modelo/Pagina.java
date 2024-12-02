package udla.jguevara.claseabstractainterfaz.modelo;

public class Pagina extends Hoja {//implements Imprimible {
    // Constructor
    public Pagina(String contenido){
        super(contenido); // Implementar el constructor
    }
    // Metodo Abstracto
    @Override
    public String imprimir(){
        return this.contenido; // Implementar el metodo abstracto.
    }
}
