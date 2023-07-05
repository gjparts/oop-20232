package herencia01;

/**
 *
 * @author Gerardo Portillo
 * @since  2023/07/04
 */
//la clase Estudiante hereda de la clase Persona
public class Estudiante extends Persona {
    //atributos
    public String cuenta;
    public String carrera;
    //constructor
    public Estudiante(String cuenta, String nombre, String carrera){
        //construir la super clase (clase padre)
        super(nombre, 0, 'X');
        
        //inicializar los atributos de la clase hijo
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    //metodos
    public void estudiar(){
        System.out.println("Estoy estudiando "+this.carrera);
    }
}
