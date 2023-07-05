package herencia01;

/**
 *
 * @author Gerardo
 */
public class Herencia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Gerardo Portillo",40,'M');
        Estudiante e1 = new Estudiante("20012002049","Josue","Ing. Industrial");
        //Estudiante hereda edad, nombre, genero  y saludar() de la clase Persona
        e1.edad = 21;
        e1.saludar();
        e1.estudiar();
    }
    
}
