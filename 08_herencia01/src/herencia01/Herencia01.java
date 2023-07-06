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
        Persona p2 = new Persona();
        System.out.println(p2.genero);
        p2.saludar();
        
        Estudiante e1 = new Estudiante("20012002049","Josue","Ing. Industrial");
        //Estudiante hereda edad, nombre, genero  y saludar() de la clase Persona
        e1.edad = 21;
        
        e1.saludar();
        e1.estudiar();
        
        Empleado t1 = new Empleado("Calamardo", 40, 'M', 8000, "Cocinero");
        t1.trabajar();
        t1.saludar();
        System.out.println(t1.genero);
        
        Practicante prac1 = new Practicante("Fenestacio", 19, 'M', 2);
        prac1.saludar();
        prac1.trabajar();
        System.out.println("El salario de "+prac1.nombre+" es "+prac1.salario);
        prac1.salario = 3000;
        System.out.println("El nuevo salario ahora es "+prac1.salario);
        
        Catedratico cat1 = new Catedratico("Kurko Bain", 45, 'M', 15000, "Ing. de Sonido");
        cat1.saludar();
        cat1.trabajar();
        cat1.educar();
    }
    
}
