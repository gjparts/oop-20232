package sistema_archivos;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-10
 */
public class Documento extends Archivo {
    //atributos
    private Autor autor;
    public int palabras;
    //constructor
    public Documento(String nombre, int tamano, String fecha,
                    String extension, Autor autor, int palabras){
        //construir la super clase
        super(nombre, tamano, "Documento", extension, fecha);
        
        //inicializar los atributos de esta clase
        this.setAutor(autor);
        this.palabras = palabras;
    }
    //metodos
    public void setAutor(Autor autor){
        if( autor != null )
            this.autor = autor;
        else
            throw new IllegalArgumentException("El autor debe ser un objeto");
    }
    public Autor getAutor() {
        return this.autor;
    }
}
