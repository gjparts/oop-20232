package sistema_archivos;
public class Sistema_archivos {
    public static void main(String[] args) {
        Archivo a1 = new Archivo("log.txt", 12,
                "Documento", "txt", "2023/07/10");
        a1.imprimir();
        
        Autor aut1 = new Autor("Gerardo Portillo", "g@g.com");
        
        Documento d1 = new Documento("tesis.docx", 124123, "2023/07/10",
                "docx", aut1, 30000);
        d1.imprimir();
        System.out.println(d1.getTipo());
        
        Media md1 = new Media();
        md1.imprimir();
        System.out.println("Autor: "+md1.autor.nombre);
        
        Media md2 = new Media("img.png", 15123, "2023-07-10", 
                "png", aut1, 0);
        md2.imprimir();
        md2.autor = null;
        System.out.println("Autor: "+md2.autor.nombre);
        System.out.println("Autor (correo): "+md2.autor.email);
    }
    
}
