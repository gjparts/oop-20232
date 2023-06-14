package asociaciones;

public class Asociaciones {

    public static void main(String[] args) {
        // TODO code application logic here
        Operador tigo = new Operador("TIGO","Honduras");
        Operador claro = new Operador("Claro C.A.","Honduras");
        
        Fabricante f1 = new Fabricante("SAMSUNG","Korea","Kim Algo");
        Fabricante f2 = new Fabricante("Sony","Japon","Satoru Iwata");
        Fabricante f3 = new Fabricante("Apple","USA","Tim Cook");
                
        Bateria b1 = new Bateria(f1,4500f);
        Bateria b2 = new Bateria(f2,3500f);
        Bateria b3 = new Bateria(f2,6000f);
        Bateria b4 = new Bateria(f3,5500f);
        
        //lo siguiente no deberia ser permitido
        //segun el diagrama tengo una relacion
        //por composicion, por lo tanto
        //el Fabricante debe ser un objeto
        //que no sea nulo.
        //Bateria b2 = new Bateria(null,4500f);
        
        Chip sim1 = new Chip(tigo, 99991515);
        Chip sim2 = new Chip(tigo, 97971616);
        Chip sim3 = new Chip(claro, 33331515);
        Chip sim4 = new Chip(claro, 34345656);
        
        Smartphone s20 = new Smartphone(f1, "Galaxy S20", 256, 8, b1);
        s20.chip1 = sim1;
        System.out.println( s20.chip1 );
        System.out.println( s20.chip2 );
        s20.imprimir();
        
        Smartphone iphone14 = new Smartphone(f3, "iPhone 14", 512, 8, b4);
        iphone14.imprimir();
        
        Smartphone sony1 = new Smartphone(f2, "Ericsson w50000", 256, 4, b2);
        sony1.chip1 = sim2;
        sony1.chip2 = sim3;
        sony1.imprimir();
        
    }
    
}
