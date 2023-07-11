package sistema_archivos;
/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-11
 */
public class Audio extends Media {
    //atributos
    public String artista;
    public String album;
    public int anio;
    public int pista;
    //constructor
    public Audio(String nombre, int tamano, String fecha,
            String extension, Autor autor, int duracion,
            String artista, String album, int anio, int pista){
        //construir la super clase
        //Media tiene constructor sin parametros, si la clase
        //pare tiene constr. sin parametros no es obligatorio
        //poner la instruccion siguiente:
        super();
        //si construye sin parametros puede despues inicializar
        //los atributos de la super clase
        super.nombre = nombre;
        super.tamano = tamano;
        super.fecha = fecha;
        super.extension = extension;
        super.setAutor(autor);
        super.duracion = duracion;
        super.setTipo("Archivo de Sonido");
        //atributos de esta clase
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.pista = pista;
    }
}
