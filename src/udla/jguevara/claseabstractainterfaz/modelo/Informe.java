package udla.jguevara.claseabstractainterfaz.modelo;

// Clase hija de la clase abstracta Hoja
// Cuando se hereda de una clase abstracta, necesito utilizar sus metodos de acuerdo con las necesidades de la clase.

public class Informe extends Hoja{
    private String autor; // Sugiere que sea final porque el java ve que no tiene getter y setter.
    private String revisor;

    // Siempre que tengo un constructor que recibe algun parametro,debo utilizar el cosntructor de esa clase.
    // No se puede utilizar un metodo abstracto cuando tiene la palabra FINAL.

    public Informe(String autor, String revisor, String contenido) {
        super(contenido); // En hoja yo tengo un constructor que no está vacio, por lo que estoy llamando a ese constructor en la clase padre.
        // Super = heredo los atributos de la superclase.
        this.autor = autor;
        this.revisor = revisor;
    }

    // Con generate implementamos el metodo de la clase abstracta Hoja.
    // Existe algun metodo al cual yo le voy a reutilizar de acuerdo a mis necesidades.
    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor + "Revisado por: "+ this.revisor + "\n" +this.contenido; // Se puede acceder a contenido porque es protected.
    }
}
