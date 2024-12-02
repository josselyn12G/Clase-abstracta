package udla.jguevara.claseabstractainterfaz.modelo;
// Protected: Manera de acceder a los atributos sin los metodos especiales de getter y setter.
abstract public class Hoja {

    protected String contenido;

    // Creación de constructor
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    // Creación de metodo abstracto
    abstract public String imprimir(); // Es un metodo sin implementar y cada clase ajusta ese metodo.
    // Un metodo abstracto se lo debe utilizar en cada clase de acuerdo con su necesidad.
    // Una clase abstracta puede o no tener metodos abstractos.
    // No puede crear un metodo abstracto dentro de una clase NO abstracto.


    // Un SOLO metodo abstracto le vuelve abstracta a una clase.
    // Si se pueden poner metodos no abstractos en una clase asbtracta.

}
