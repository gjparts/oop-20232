package sistema_archivos;

/**
 *
 * @author Gerardo Portillo
 * @since  2023-07-10
 */
public class Archivo {
    //atributos
    public String nombre;
    public int tamano;
    private String tipo;
    public String extension;
    public String fecha;
    //constructor
    public Archivo(String nombre, int tamano, String tipo,
                    String extension, String fecha){
        this.nombre = nombre;
        this.tamano = tamano;
        this.tipo = tipo;
        this.extension = extension;
        this.fecha = fecha;
    }
    //metodos
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimir(){
        System.out.println("********** ARCHIVO **********");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Tamaño: "+this.tamano);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Extension: "+this.extension);
        System.out.println("Fecha: "+this.fecha);
    }
}
