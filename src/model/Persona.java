/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Felipe Concha Almeida
 */
public class Persona {
    public String rut;
    public String nombre;
    public int añoNacimiento;
    
    //Este el es el metodo constructor, estos parametros se traspasan cuando instanciamos la clase
    //Por ejemplo:  Persona nuevaPersona = new Persona("20220460k", "Felipe", 21);
    
    /**
     * 
     * @param rut Numero identificatorio unico que posee cada chileno residente o no en Chile.
     * @param nombre Nombre completo de la persona.
     * @param año Año de nacimiento de la persona.
     */
    public Persona(String rut, String nombre, int año){
        this.rut = rut;
        this.nombre = nombre;
        
        //Como el parametro tiene un nombre diferente al atributo, no es necesario utilizar la palabra reservada this.
        añoNacimiento = año;
    }
    
    /**
     * Metodo publico de la clase persona, que calcula la edad actual de la persona utilizando su fecha de nacimiento.
     * 
     * @return Diferencia entre el año actual y el de nacimiento.
     */
    public int calcularEdad(){
        LocalDate añoActual = LocalDate.now();
        return añoActual.getYear() - añoNacimiento;
    }
}
