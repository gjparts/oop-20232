/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_empleado;

/**
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
    /**
     * retorna la edad del empleado
     * @return numero entero representando la edad
     */
    public int getEdad(){
        return this.edad;
    }
    /**
     * asigna la edad al empleado
     * @param edad debe ser un numero entero mayor o igual que cero.
     */
    public void setEdad(int edad){
        if( edad >= 0 )
            this.edad = edad;   //si la edad es numero positivo la aceptamos
        else
            throw new IllegalArgumentException("La edad debe ser numero positivo.");
    }
    /**
     * retorna el genero del empleado
     * @return un valor char que puede ser:
     *          M Masculino,
     *          F Femenino,
     *          O Otros
     */
    public char getGenero(){
        return this.genero;
    }
    /**
     * define el genero del empleado
     * @param genero un valor char que puede ser:
     *          M Masculino,
     *          F Femenino,
     *          O Otros
     */
    public void setGenero(char genero){
        if( genero == 'M' || genero == 'F' || genero == 'O' )
            this.genero = genero;   //si el genero es M F O lo aceptamos
        else
            throw new IllegalArgumentException("El genero solo puede ser M, F, O.");
    }
    /**
     * retorna el estado civil del empleado
     * @return un valor char que puede ser:
     *          C   Casado,
     *          S   Soltero,
     *          V   Viudo,
     *          D   Divorciado
     *          U   Union Libre
     */
    public char getEstadoCivil(){
        return this.estadoCivil;
    }
    /**
     * define el estado civil del empleado
     * @param estadoCivil un valor char que puede ser:
     *          C   Casado,
     *          S   Soltero,
     *          V   Viudo,
     *          D   Divorciado
     *          U   Union Libre
     */
    public void SetEstadoCivil(char estadoCivil){
        if( estadoCivil == 'C' || estadoCivil == 'S' || estadoCivil == 'V' || 
            estadoCivil == 'D' || estadoCivil == 'U' )
            this.estadoCivil = estadoCivil;
        else
            throw new IllegalArgumentException("El estado civil solo puede ser C, S, V, D, U.");
    }
    /**
     * retorna las condiciones de la contratacion del empleado
     * @return un valor char que puede ser:
     *          P   Empleado Permanente
     *          T   Empleado Temporal
     *          H   Empleado por Hora
     */
    public char getContrato(){
        return this.contrato;
    }
    /**
     * define el tipo de contratacion del empleado
     * @param contrato un valor char que puede ser:
     *          P   Empleado Permanente
     *          T   Empleado Temporal
     *          H   Empleado por Hora
     */
    public void setContrato(char contrato){
        if( contrato == 'P' || contrato == 'T' || contrato == 'H' )
            this.contrato = contrato;
        else
           throw new IllegalArgumentException("El contrato solo puede ser P, T, H."); 
    }
    /**
     * retorna el salario bruto devengado por el empleado
     * @return un valor float mayor o igual que cero.
     */
    public float getSalario(){
        return this.salario;
    }
    /**
     * define el salario bruto devengado por el empleado
     * @param salario un valor float mayor o igual que cero.
     */
    public void setSalario( float salario ){
        if( salario >= 0 )
            this.salario = salario;
        else
            throw new IllegalArgumentException("Salario debe ser mayor o igual que cero."); 
    }
    /**
     * imprime en la consola de texto la ficha del empleado
     */
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
