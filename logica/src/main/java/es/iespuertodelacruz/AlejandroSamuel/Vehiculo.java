/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.AlejandroSamuel;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machado
 */
public class Vehiculo {

    //Atributos de la clase Vehículo
    String nombre;
    Motor motor;
    boolean drs;
    boolean direccionAsistida;
    boolean controlTraccion;

    
    /**
     * Constructor por defecto.
     */
    public Vehiculo() {}

    /**
     *  Constructor con 5 parametros.
     * @param nombre de la clase.
     * @param motor de la clase.
     * @param drs de la clase.
     * @param direccionAsistida de la clase.
     * @param controlTraccion de la clase.
     */
    public Vehiculo(String nombre, Motor motor, boolean drs, boolean direccionAsistida, boolean controlTraccion) {
        this.nombre = nombre;
        this.motor = motor;
        this.drs = drs;
        this.direccionAsistida = direccionAsistida;
        this.controlTraccion = controlTraccion;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean isDrs() {
        return drs;
    }

    public void setDrs(boolean drs) {
        this.drs = drs;
    }

    public boolean isDireccionAsistida() {
        return direccionAsistida;
    }

    public void setDireccionAsistida(boolean direccionAsistida) {
        this.direccionAsistida = direccionAsistida;
    }

    public boolean isControlTraccion() {
        return controlTraccion;
    }

    public void setControlTraccion(boolean controlTraccion) {
        this.controlTraccion = controlTraccion;
    }
    
    
  
}
