package polimorfismo1;

public class Polimorfismo1 {

    public static void main(String[] args) {
        Animal a1 = new Animal("Cocodrilo", "Reptil", 4, true);
        a1.imprimir();
        a1.hablar();
        
        Gato g1 = new Gato("Neko", true, true);
        g1.imprimir();
        g1.ronronear();
        g1.hablar();
        
        Perro p1 = new Perro("Firulais", true, "Mixto");
        p1.imprimir();
        p1.jugar();
        p1.hablar();
    }
    
}
