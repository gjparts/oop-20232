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
        
        //validar si viene o no la empresa donde labora
        System.out.print("Empresa donde labora: ");
        if( this.empresaLabora == null )
            System.out.println("No labora para empresa.");
        else{
            System.out.println(this.empresaLabora.nombre);
            System.out.println("Telefono: "+this.empresaLabora.telefono);
            //validar si la direccion de la empresa es null
            System.out.print("Dirección: ");
            if( this.empresaLabora.getDireccion() == null )
                System.out.println("No definida.");
            else{
                System.out.print("Colonia: ");
                if( this.empresaLabora.getDireccion().getColonia() == null )
                    System.out.println("No definida.");
                else{
                    System.out.println(this.empresaLabora.getDireccion().getColonia().nombre);
                    System.out.println("\tCalle: "+this.empresaLabora.getDireccion().calle);
                    System.out.println("\tAve.: "+this.empresaLabora.getDireccion().avenida);
                    System.out.println("\tBloque: "+this.empresaLabora.getDireccion().bloque);
                    System.out.println("\tCasa: "+this.empresaLabora.getDireccion().casa);
                }
            }
        }
        
        //validar si es null el arreglo de mascotas
        System.out.println("Mascotas: *********");
        if( this.mascotas == null )
            System.out.println("\tNo tiene mascotas.");
        else{
            //el arreglo de mascotas es un objeto, validar si tiene items
            if( this.mascotas.length == 0 )
                System.out.println("\tNo tiene mascotas.");
            else{
                //si tiene mascotas (recorrer el array)
                for( int i = 0; i < this.mascotas.length; i++ ){
                    //validar si cada mascota es diferente de null
                    //si es asi la imprimimos, sino la ignoramos
                    if( this.mascotas[i] != null ){
                        System.out.println( "\tMascota "+(i+1) );
                        System.out.println("\t\tNombre: "+this.mascotas[i].nombre);
                        System.out.println("\t\tEspecie: "+this.mascotas[i].especie);
                    }
                }
            }
        }
    }
}
