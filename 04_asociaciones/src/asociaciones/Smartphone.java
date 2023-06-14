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
    //metodos
    /**
     * Devuelve la marca de quien fabrica el smartphone
     * @return un objeto de clase Fabricante
     */
    public Fabricante getMarca(){
        return this.marca;
    }
    /**
     * Devuelve el modelo del smartphone
     * @return un String
     */
    public String getModelo(){
        return this.modelo;
    }
    /**
     * Devuelve la capacidad en Gigabytes para la memoria interna del smartphone
     * @return un numero entero
     */
    public int getAlmacenamiento(){
        return this.almacenamiento;
    }
    /**
     * Devuelve la cantidad de RAM del smartphone en Gigabytes
     * @return un numero entero
     */
    public int getRam(){
        return this.ram;
    }
    /**
     * Devuelve la bateria del smartphone
     * @return un objeto de clase Bateria
     */
    public Bateria getBateria(){
        return this.bateria;
    }
    
    /**
     * imprime una ficha tecnica del smartphone
     */
    public void imprimir(){
        System.out.println("************** Smartphone **************");
        System.out.println("Fabricante: "+this.marca.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento: "+this.almacenamiento+"Gb");
        System.out.println("RAM: "+this.ram+"Gb");
        System.out.println("Bateria:");
        System.out.println("\tMarca: "+this.bateria.getMarca().nombre);
        System.out.println("\tMiliAmperios: "+this.bateria.miliAmperios);
        if( this.chip1 == null )
            System.out.println("Chip 1: No tiene");
        else
        {
            System.out.println("Chip 1:");
            System.out.println("\tOperador: "+this.chip1.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip1.numeroTelefonico);
        }
        if( this.chip2 == null )
            System.out.println("Chip 2: No tiene");
        else
        {
            System.out.println("Chip 2:");
            System.out.println("\tOperador: "+this.chip2.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip2.numeroTelefonico);
        }
    }
}
