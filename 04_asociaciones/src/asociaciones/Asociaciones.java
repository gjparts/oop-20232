package asociaciones;

public class Asociaciones {

    public static void main(String[] args) {
        // TODO code application logic here
        Operador tigo = new Operador("TIGO","Honduras");
        
        Fabricante f1 = new Fabricante("SAMSUNG","Korea","Kim Algo");
        
        Bateria b1 = new Bateria(f1,4500f);
        //lo siguiente no deberia ser permitido
        //segun el diagrama tengo una relacion
        //por composicion, por lo tanto
        //el Fabricante debe ser un objeto
        //que no sea nulo.
        //Bateria b2 = new Bateria(null,4500f);
        
    }
    
}
