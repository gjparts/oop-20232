package sistema_archivos;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-10
 */
public class Documento extends Archivo {
    //atributos
    public Autor autor;
    public int palabras;
    //constructor
    public Documento(String nombre, int tamano, String fecha,
                    String extension, Autor autor, int palabras){
        //construir la super clase
        super(nombre, tamano, "Documento", extension, fecha);
        
        //inicializar los atributos de esta clase
        if( autor == null )
            throw new IllegalArgumentException("Debe colocar el Autor");
        else
            this.autor = autor;
        
        this.palabras = palabras;
    }
}
