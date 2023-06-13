package asociaciones;
/**
 * Representa a un telefono inteligente
 * @author Gerardo Portillo
 * @since  2023/06/13
 */
public class Smartphone {
    //atributos
    private Fabricante marca; 
    private String modelo;
    private int almacenamiento;
    private int ram;
    private Bateria bateria;
    public Chip chip1;
    public Chip chip2;
    //constructor
    /**
     * Crea un nuevo objeto de clase Smartphone
     * @param marca             marca del smartphone como objeto Fabricante
     * @param modelo            modelo del smartphone
     * @param almacenamiento    memoria interna en gigas como numero entero
     * @param ram               memoria ram en gigas como numero entero
     * @param bateria           bateria del smartphone como objeto Bateria
     */
    public Smartphone(Fabricante marca, String modelo,
                        int almacenamiento, int ram, Bateria bateria ){
        //relaciones por composicion
        if( marca == null )
            throw new IllegalArgumentException("Marca debe ser un objeto");
        else
            this.marca = marca;
        
        if( bateria == null )
            throw new IllegalArgumentException("Bateria debe ser un objeto");
        else
            this.bateria = bateria;
        
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }
}
