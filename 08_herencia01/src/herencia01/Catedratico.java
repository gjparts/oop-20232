package herencia01;

/**
 *
 * @author Gerardo Portillo
 * @since  2023/07/06
 */
public class Catedratico extends Empleado {
    //atributos
    public String profesion;
    //constructor
    public Catedratico(String nombre, int edad, char genero,
            float salario, String profesion){
        //construir la super clase
        super(nombre, edad, genero, salario, "Docente");
        //atributos de esta clase
        this.profesion = profesion;
    }
    //metodos
    public void educar(){
        System.out.println("Soy "+this.nombre
                +" y estoy dando clases en la carrera de "+this.profesion);
    }
}
