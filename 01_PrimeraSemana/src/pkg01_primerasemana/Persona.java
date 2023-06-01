/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_primerasemana;

/**
 *
 * @author Gerardo
 */
public class Persona {
    //atributos o propiedades
    public String nombre;
    private int edad;
    private char genero;
    public String ciudadNacimiento;
    public boolean trabaja;
    
    //constructores de la clases
    public Persona(){
        //este es el constructor sin parametros
        this.nombre = "no definido";
        this.edad = 0;
        this.genero = 'N';
        this.ciudadNacimiento = "no definida";
        this.trabaja = false;
    }
    public Persona(String nombre, int edad){
        //este es un constructor con dos parametros
        this.nombre = nombre;
        this.edad = edad;
        this.genero = 'N';
        this.ciudadNacimiento = "no definida";
        this.trabaja = false;
    }
    public Persona(String nombre, char genero, String ciudadNacimiento, int edad){
        //este es un constructor con cuatro parametros
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.ciudadNacimiento = ciudadNacimiento;
        this.trabaja = false;
    }
    //metodos
    public void imprimir(){
        System.out.println("*****************");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        
        //evaluar el genero usando switch-case
        System.out.print("Genero: ");
        switch (this.genero) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Femenino");
                break;
            case 'N':
                System.out.println("Otros");
                break;
            default:
                System.out.println("No valido");
        }
        
        //evaluar el genero usando el operador ternario
        System.out.println("Genero: "+( this.genero == 'M' ? "Masculino" : 
                ( this.genero == 'F' ? "Femenino" : 
                ( this.genero == 'N' ? "Otros" : "No valido" ) ) ) );
        
        System.out.println("Trabaja: "+( this.trabaja == true ? "Si" : "No" ) );
        
        System.out.println("Ciudad de Origen: "+this.ciudadNacimiento);
    }
    
    public void saludar(boolean ciudad){
        System.out.println("Hola soy "+this.nombre+( ciudad == true ? " soy de "+this.ciudadNacimiento : "" ) );
    }
    
    public double getDescuentoTerceraEdad(){
        /*if( this.edad >= 60 )
            return 0.25;
        else
            return 0.00;*/
        return ( this.edad >= 60 ? 0.25 : 0.00 );
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        if( edad >= 0 )
            this.edad = edad;
        else
            throw new IllegalArgumentException("La edad debe ser un numero positivo.");
    }
    
    public char getGenero(){
        return this.genero;
    }
    
    public void setGenero( char genero ){
        /*switch (genero) {
            case 'M': case 'F': case 'N':
                this.genero = genero;
            break;
            default:
                throw new IllegalArgumentException("Genero debe ser M, F, N.");
        }*/
        
        if( genero == 'M' || genero == 'F' || genero == 'N' )
            this.genero = genero;
        else
            throw new IllegalArgumentException("Genero debe ser M, F, N en mayusculas.");
    }
}
