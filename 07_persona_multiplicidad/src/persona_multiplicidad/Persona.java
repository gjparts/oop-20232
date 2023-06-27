package persona_multiplicidad;
/**
 * Representa a una Persona
 * @author Gerardo Portillo
 * @since  2023-06-26
 */
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas;
    //constructor
    public Persona(String identidad, String nombre, int telefono){
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = null;
        this.empresaLabora = null;
        this.mascotas = null;
    }
    //metodos
    public void imprimir(){
        System.out.println("****************************");
        System.out.println("Identidad: "+this.identidad);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Telefono: "+this.telefono);
        //validar si viene o no viene la direccion
        System.out.print("Direccion: ");
        if( this.direccion == null )
            System.out.println("No tiene");
        else{
            System.out.print("Colonia: ");
            if( this.direccion.getColonia() == null )
                System.out.println("No definida.");
            else
                System.out.println(this.direccion.getColonia().nombre);
            
            System.out.println("\tCalle: "+this.direccion.calle);
            System.out.println("\tAve.: "+this.direccion.avenida);
            System.out.println("\tBloque: "+this.direccion.bloque);
            System.out.println("\tCasa: "+this.direccion.casa);
        }
    }
}
