package herencia01;

/**
 *
 * @author Gerardo Portillo
 * @since  2023/07/04
 */
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    //constructor
    public Persona(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //metodos
    public void saludar(){
        System.out.println("Hola soy "+this.nombre+" y tengo "+this.edad+" años");
    }
}
