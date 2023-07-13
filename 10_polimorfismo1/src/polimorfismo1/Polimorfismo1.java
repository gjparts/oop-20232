package polimorfismo1;

public class Polimorfismo1 {

    public static void main(String[] args) {
        Animal a1 = new Animal("Cocodrilo", "Reptil", 4, true);
        a1.imprimir();
        a1.hablar();
        
        Gato g1 = new Gato("Neko", true, true);
        g1.imprimir();
        g1.hablar();
    }
    
}
