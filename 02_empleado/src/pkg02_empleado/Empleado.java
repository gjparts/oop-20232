/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_empleado;

/**
 *
 * @author Gerardo Portillo
 * @since 2023/06/05
 */
public class Empleado {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    private char estadoCivil;
    private char contrato;
    private float salario;
    //constructor
    /**
     * Construye un objeto de clase Empleado
     * @param nombre    nombre del empleado
     * @param edad      edad del empleado
     * @param genero    genero del empleado puede ser:
     *                  M   para Masculino
     *                  F   para Femenino
     *                  O   para Otros
     */
    public Empleado(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.setEdad(edad);
        this.setGenero(genero);
        this.estadoCivil = 'S';
        this.contrato = 'P';
        this.salario = 0.00f;
    }
    //metodos
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        if( edad >= 0 )
            this.edad = edad;   //si la edad es numero positivo la aceptamos
        else
            throw new IllegalArgumentException("La edad debe ser numero positivo.");
    }
    
    public char getGenero(){
        return this.genero;
    }
    public void setGenero(char genero){
        if( genero == 'M' || genero == 'F' || genero == 'O' )
            this.genero = genero;   //si el genero es M F O lo aceptamos
        else
            throw new IllegalArgumentException("El genero solo puede ser M, F, O.");
    }
    
    public char getEstadoCivil(){
        return this.estadoCivil;
    }
    public void SetEstadoCivil(char estadoCivil){
        if( estadoCivil == 'C' || estadoCivil == 'S' || estadoCivil == 'V' || 
            estadoCivil == 'D' || estadoCivil == 'U' )
            this.estadoCivil = estadoCivil;
        else
            throw new IllegalArgumentException("El estado civil solo puede ser C, S, V, D, U.");
    }
    
    public char getContrato(){
        return this.contrato;
    }
    public void setContrato(char contrato){
        if( contrato == 'P' || contrato == 'T' || contrato == 'H' )
            this.contrato = contrato;
        else
           throw new IllegalArgumentException("El contrato solo puede ser P, T, H."); 
    }
    
    public float getSalario(){
        return this.salario;
    }
    public void setSalario( float salario ){
        if( salario >= 0 )
            this.salario = salario;
        else
            throw new IllegalArgumentException("Salario debe ser mayor o igual que cero."); 
    }
    
    public void imprimir(){
        System.out.println("******* EMPLEADO *******");
        System.out.println("Nombre: "+this.nombre);
        //System.out.println("Edad: "+this.getEdad()); //es correcto
        System.out.println("Edad: "+this.edad);
        
        System.out.print("Estado Civil: ");
        switch(this.estadoCivil){
          case 'S': System.out.println("Soltero"); break;
          case 'C': System.out.println("Casado"); break;
          case 'V': System.out.println("Viudo"); break;
          case 'D': System.out.println("Divorciado"); break;
          case 'U': System.out.println("Union Libre"); break;
        }
        
        System.out.println( "Genero: "+(this.genero == 'M' ? "Masculino" :
                            this.genero == 'F' ? "Femenino" : "Otros") );
        
        System.out.print("Contrato: ");
        if( this.contrato == 'P' ) System.out.println("Permanente");
        if( this.contrato == 'T' ) System.out.println("Temporal");
        if( this.contrato == 'H' ) System.out.println("Por Hora");
        System.out.println("Salario: "+this.salario);
    }
}
