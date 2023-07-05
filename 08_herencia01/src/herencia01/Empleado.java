package herencia01;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-05
 */
public class Empleado extends Persona {
    //atributos
    public float salario;
    public String cargo;
    //constructor
    public Empleado(String nombre, int edad, char genero,
            float salario, String cargo){
        //si ya tenemos en la super clase (Persona)
        //un constructor SIN Parametros entonces no estamos
        //obligados a construir la super clase
        //JAVA automaticamente manda ejecutar el constructor
        //sin parametros: super()
        //lo que quiere decir que ya podemos llenar datos
        //en la super clase
        super.nombre = nombre;
        super.edad = edad;
        super.genero = genero;
        //inicializar los atributos de la clase actual
        this.salario = salario;
        this.cargo = cargo;
    }
    //metodos
    public void trabajar(){
        System.out.println("Hoy soy "+this.nombre
                            +" estoy trabajando de "+this.cargo);
    }
}
