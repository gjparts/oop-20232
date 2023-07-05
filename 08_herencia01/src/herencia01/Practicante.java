package herencia01;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-05
 */
public class Practicante extends Empleado {
    //atributos
    public int meses;
    //constructor
    public Practicante(String nombre, int edad, char genero, int meses){
        //construir la super clasepas
        super(nombre, edad, genero, 0.00f, "Pasante");
        //llenar los atributos de esta clase
        this.meses = meses;
    }
}
