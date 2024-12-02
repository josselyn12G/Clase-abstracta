package udla.jguevara.claseabstractainterfaz.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{
    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido); // El constructor porque no está vacio recibe al menos algun parametro
        this.persona = persona;
        this.carrera = carrera;
        this.contenido = contenido;
        this.experiencia = new ArrayList<>(); // Instancio mi lista
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n").append("Resumen : ").append(this.contenido).
                append("Profesion : "). append(this.carrera). append("\n").
                append("Experiencia : "). append("\n");
        for (String exp : experiencia) {
            sb.append(" - ").append(exp).append("\n");
        }
        return sb.toString();
    }

    public Curriculo experiencia(String exp){
        experiencia.add(exp);
        return this;
    }
    /*El tipo de retorno del metodo es Curriculo, que significa que el metodo devuelve una
    instancia del mismo objeto Curriculo sobre el que fue llamado.
    Esto permite llamar a otro metodo de la clase sin necesidad
    de asignar el resultado de cada llamada a una nueva variable.
    El truco está en el uso de this para devolver la referencia del mismo objeto actual
     en lugar de crear uno nuevo.
    Así, todos los métodos encadenados trabajan sobre la misma instancia,
    permitiendo modificaciones sucesivas sin perder el contexto del objeto.
     */
}


// Las clases que heredan de unas clases abstractas si se pueden instanciar.
// Si se puede heredar de clases abstractas.
