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
public class Ciudad {
    //atributos
    public String pais;
    public String departamento;
    public String municipio;
    public String alcalde;
    //constructores
    public Ciudad(String pais, String departamento){
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = "no definido";
        this.alcalde = "no tiene";
    }
    public Ciudad(String pais, String departamento,
                  String municipio, String alcalde){
        //ejecutar el constructor de dos parametros
        this(pais, departamento);
        //llenar los otros dos parametros de aqui
        this.municipio = municipio;
        this.alcalde = alcalde;
    }
}
