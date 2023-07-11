package sistema_archivos;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-10
 */
public class Media extends Archivo {
    //atributos
    private Autor autor;
    public int duracion;
    //constructor
    public Media(){
        super("No tiene", 0, "Archivos de medios", "", "1900/01/01");
        //atributos de esta clase
        //como el autor es obligatorio; pero no se envia autor por
        //medio del constructor, entonces: creamos uno generico
        this.autor = new Autor("Desconocido","No tiene");
        this.duracion = 0;
    }
    public Media(String nombre, int tamano, String fecha,
            String extension, Autor autor, int duracion){
        super(nombre, tamano, "Archivo de medios" , extension, fecha);
        //atributos de esta clase
        //autor obligatorio
        this.setAutor(autor);
        this.duracion = duracion;
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
