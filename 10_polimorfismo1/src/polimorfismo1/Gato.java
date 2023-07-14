package polimorfismo1;
/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-13
 */
public class Gato extends Animal {
    //atributos
    public String apodo;
    private boolean tienePelaje;
    //constructor
    public Gato(String apodo, boolean tienePelaje, boolean tieneCola){
        //construir la super clase
        super("Gato", "Felino", 4, tieneCola);
        //inicializar los atributos de esta clase
        this.apodo = apodo;
        this.tienePelaje = tienePelaje;
    }
    //metodos
    public void ronronear(){
        System.out.println(this.getNombre()+" hace prrrrrrrrrr");
    }
    //Polimorfismo: superponer metodos de la clase padre.
    @Override
    public void hablar(){
        //override completo: no reutiliza el metodo al que hace
        //override
        System.out.println("marra miauuuu");
    }
    @Override
    public void imprimir(){
        //override parcial: reutiliza el metodo al que hace
        //override
        //polimorfismo tambien permite reutilizar el codigo
        //del metodo heredado para darle continuidad al mismo
        super.imprimir();   //ejecuta el metodo imprimir de la super clase
        //luego imprimimos cosas nuevas:
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Tiene pelaje: "+( this.tienePelaje == true ? "Si" : "No" ));
    }
}
