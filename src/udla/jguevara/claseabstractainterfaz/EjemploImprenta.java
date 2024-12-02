package udla.jguevara.claseabstractainterfaz;
import udla.jguevara.claseabstractainterfaz.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Josselyn Guevara", "Ing.Software", "Resumen laboral...");
        cv.experiencia("Java");
        cv.experiencia("Oracle DBA");
        cv.experiencia("SpringBoot Framework");
        cv.experiencia("Desarrollo FullStank");
        cv.experiencia("Angular");

        Informe informe = new Informe( "Susana Rojas\n", "Dilipa", "Estudio Microservicios");
        imprimir(cv);
        imprimir(informe);
        
        Libro libro = new Libro(new Persona("Erich", "Gamma"),"Patrones de diseños: Elem.Reusables",Genero.PROGRAMACION);







    }

    public static void imprimir(Hoja imprime){ // Le estoy importando full contenido de la clase hoja.
        System.out.println(imprime.imprimir()); // Al ser una clase abstracta le tengo que llegar por un metodo.

    }
}


//--------------------------------------------------------- TEORÍA ----------------------------------------------------------
// No se puede instanciar la CLASE ABSTRACTA.
// Clase asbtracta: Cuando veo comportamientos comunes entre clases que se ASOCIAN = HERENCIA se crea una clase abstracta.
// Los metodos de una clase abstracta solo se crean pero cada clase los utiliza de acuerdo a su manera.
// Polimorfismo: Sobrecarga reutilizar el metodo dependiendo de los argumentos que reciba.
// Interfaces: Comportamientos comunes y no necesariamente de clases que estén asociadas.