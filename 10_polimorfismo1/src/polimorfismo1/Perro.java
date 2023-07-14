package polimorfismo1;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-14
 */
public class Perro extends Animal {
    //atributos
    public String apodo;
    private String raza;
    //constructor
    public Perro(String apodo, boolean tieneCola, String raza){
        //construir la super clase
        super("Perro", "Canino", 4, tieneCola);
        //inicializar los atributos de esta clase
        this.apodo = apodo;
        this.raza = raza;
    }
    //metodos
    public void jugar(){
        System.out.println(this.apodo+" mueve la cola y corre feliz.");
    }
    @Override
    public void hablar(){
        //override completo
        System.out.println("Guau");
    }
    @Override
    public void imprimir(){
        //override parcial
        super.imprimir();   //reutilizo codigo del metodo heredado
        //codigo adicional
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Raza: "+this.raza);
    }
}
