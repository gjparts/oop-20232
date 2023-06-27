package persona_multiplicidad;

/**
 * Representa a una direccion geográfica
 * @author Gerardo Portillo
 * @since  2023-06-26
 */
public class Direccion {
    //atributos
    private Barrio colonia;
    public String calle;
    public String avenida;
    public String bloque;
    public String casa;
    //constructor
    public Direccion(Barrio colonia){
        //la colonia es obligatoria en la direccion (relacion por composicion)
        if( colonia != null )
            this.colonia = colonia;
        else
            throw new IllegalArgumentException("colonia debe de ser un objeto de tipo Barrio");
            
        calle = "N/A";
        avenida = "N/A";
        bloque = "N/A";
        casa = "N/A";
    }
    //metodos
    public Barrio getColonia() {
        return this.colonia;
    }
}
