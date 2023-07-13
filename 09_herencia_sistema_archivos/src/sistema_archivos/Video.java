package sistema_archivos;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-12
 */
import java.util.LinkedList;
public class Video extends Media {
    //atributos
    public String codec;
    public String[] audio;
    public LinkedList<Subtitulo> subtitulos;
    //constructor
    public Video(String nombre, int tamano, String fecha,
            String extension, Autor autor, int duracion, String codec){
        //construir la super clase
        super(nombre, tamano, fecha, extension, autor, duracion);
        super.setTipo("Archivo de Video");
        //atributos de esta clase
        this.codec = codec;
        this.audio = null;
        this.subtitulos = new LinkedList();
    }
}