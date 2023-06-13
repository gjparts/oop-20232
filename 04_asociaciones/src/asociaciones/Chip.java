package asociaciones;

/**
 * Representa una SIM Card para telefono
 * @author Gerardo Portillo
 * @since  2023/06/13
 */
public class Chip {
    //atributos
    private Operador proveedor;
    public int numeroTelefonico;
    //constructor
    /**
     * Crea un nuevo objeto de clase Chip
     * @param proveedor         el proveedor de servicios telefonicos, es de tipo Operador
     * @param numeroTelefonico  un numero entero para el numero de telefono de este chip
     */
    public Chip(Operador proveedor, int numeroTelefonico){
        //el proveedor es obligatorio (composicion)
        if( proveedor == null )
            throw new IllegalArgumentException("El proveedor es obligatorio");
        else
            this.proveedor = proveedor;
        
        this.numeroTelefonico = numeroTelefonico;
    }
    //metodos
    /**
     * Retorna el proveedor de servicios telefonicos de el chip
     * @return  un objeto de clase Operador
     */
    public Operador getProveedor(){
        return this.proveedor;
    }
}
