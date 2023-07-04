package persona_multiplicidad;
/**
 * Representa a una Persona
 * @author Gerardo Portillo
 * @since  2023-06-26
 */
import java.util.LinkedList;    //Lista vinculada
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas;  //multiplicidad
    //la siguiente es una coleccion de objetos
    //con restriccion de tipo a solo aceptar
    //objetos de clase Diploma
    public LinkedList<Diploma> diplomas; //multiplicidad
    //referencias circulares: objeto de la misma clase a la que pertenecen
    public Persona conyuge;
    public LinkedList<Persona> hijos;   //multiplicidad y ref.circular    
    //constructor
    public Persona(String identidad, String nombre, int telefono){
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = null;
        this.empresaLabora = null;
        this.mascotas = null;
        this.conyuge = null;
        //inicializamos la lista vinculada de diplomas
        //para que este lista para su uso.
        this.diplomas = new LinkedList();
        //inicializar la lista vinculada de hijos
        //para que quede lista para usar
        this.hijos = new LinkedList();
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
        
        //conyuge
        System.out.print("Conyuge: ");
        if( this.conyuge == null )
            System.out.println("No tiene.");
        else{
            System.out.println( this.conyuge.nombre );
            System.out.println("\tIdentidad: "+this.conyuge.identidad);
            System.out.println("\tTelefono: "+this.conyuge.telefono);
        }
        
        //hijos (validar que no viene null)
        System.out.println("Hijos : *************");
        if( this.hijos == null )
            System.out.println("\tNo tiene");
        else{
            //validar que tenga hijos (longitud > 0)
            if( this.hijos.size() == 0 )
                System.out.println("\tNo tiene");
            else{
                //recorrer el LisnkedList de hijos, validar
                //cada hijo que no sea null si lo es entonces ignorarlo.
                for( int i = 0; i < this.hijos.size(); i++ )
                {
                    if( this.hijos.get(i) != null ){
                        System.out.println("* Nombre: "+this.hijos.get(i).nombre);
                    }
                }
            }
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
        
        //validar su es null el LinkedList de diplomas
        System.out.println("Diplomas **************");
        if( this.diplomas == null )
            System.out.println("\tNo tiene diplomas.");
        else{
            if( this.diplomas.size() == 0 )
                //si no hay diplomas:
                System.out.println("\tNo tiene diplomas.");
            else{
                //hay diplomas, recorrer la lista e imprimirlos
                //uno a uno si son diferentes de null.
                for( int i = 0; i < this.diplomas.size(); i++ ){
                    if( this.diplomas.get(i) != null ){
                        System.out.println("\tInstitucion: "+this.diplomas.get(i).institucion);
                        System.out.println("\tNombre: "+this.diplomas.get(i).nombre);
                    }
                }
            }
        }
    }
}
