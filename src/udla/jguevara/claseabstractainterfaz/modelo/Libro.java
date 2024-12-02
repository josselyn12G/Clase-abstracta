package udla.jguevara.claseabstractainterfaz.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private List<Hoja> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero; // Yo te voy a llamar ahí de lo que contengas de tipo Genero.

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>(); // Es necesario instanciar la lista.
    }
    // Agregando paginas de una lista.
    public Libro addPagina(){ Hoja pagina
        paginas.add(pagina);
        return this;
    }

   // @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n").append("Autor: ").append(this.autor)
                .append("\n").append("Genero: ").append(genero).append("\n");
        for(Hoja pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }



}
