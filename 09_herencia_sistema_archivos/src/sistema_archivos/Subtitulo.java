package sistema_archivos;
/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-11
 */
public class Subtitulo {
    //atributos
    private Autor autor;
    public String lenguaje;
    //constructor
    public Subtitulo(Autor autor, String lenguaje){
        this.setAutor(autor);
        this.lenguaje = lenguaje;
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
