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
        System.out.println("Autor: "+md1.getAutor().nombre);
        
        Media md2 = new Media("img.png", 15123, "2023-07-10", 
                "png", aut1, 0);
        md2.imprimir();
        md2.setAutor(new Autor("Alicia Cobra","alicia@cooper.com"));
        System.out.println("Autor: "+md2.getAutor().nombre);
        System.out.println("Autor (correo): "+md2.getAutor().email);
        
        Audio au1 = new Audio("Come Undone.mp3", 3256128, "2023-07-11", "mp3", 
                aut1, 205, "Duran Duran", "The Wedding Album", 1984, 3);
        au1.imprimir();
        System.out.println("Artista de au1: "+au1.artista);
        System.out.println("Autor de au1: "+au1.getAutor().nombre);
        
        Video v1 = new Video("Akira", 123456, "1989/1/1", "mp4", 
                new Autor("Katsuhiro Otomo",""), 120, "h264");
        //canales de idioma de v1
        String[] canalesAudio1 = { "Ingles", "Español" };
        v1.audio = canalesAudio1;
        //subtitulos de v1
        Subtitulo st1 = new Subtitulo(aut1, "Chino");
        v1.subtitulos.push( new Subtitulo(new Autor("GNula",""), "Español") );
        v1.subtitulos.push( new Subtitulo(aut1, "Ingles") );
        v1.subtitulos.push( st1 );
    }
    
}
