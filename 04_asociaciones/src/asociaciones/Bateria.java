package asociaciones;

/**
 *  Representa a una bateria para un equipo electronico
 * @author Gerardo Portillo
 * @since  2023/06/12
 */
public class Bateria {
    //atributos
    private Fabricante marca;
    public float miliAmperios;
    //constructor
    /**
     * Crea un nuevo objeto de clase Bateria
     * @param marca         el fabricante de la bateria
     * @param miliAmperios  capacidad de carga en mA
     */
    public Bateria(Fabricante marca, float miliAmperios){
        //el Fabricante de la bateria es obligatorio
        if( marca != null )
            this.marca = marca;
        else
            throw new IllegalArgumentException("Fabricante es obligatorio en Bateria");
        
        this.miliAmperios = miliAmperios;
    }
    //metodos
    /**
     * retorna la marca de la bateria
     * @return objeto de clase Fabricante
     */
    public Fabricante getMarca(){
        return this.marca;
    }
}
