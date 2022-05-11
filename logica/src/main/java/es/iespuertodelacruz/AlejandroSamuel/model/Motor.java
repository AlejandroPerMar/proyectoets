/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.AlejandroSamuel.model;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machad
 */
public class Motor {

    // Atributos de la clase Motor
    String nombre;
    Integer caballosPotencia;
    Integer parMotor;
    Integer cilindrada;
    String disposicion;

    /**
     * Constructor por defecto.
     */
    public Motor() {}

    /**
     * Constructor con 5 parámetros.
     * @param nombre de la clase.
     * @param caballosPotencia de la clase.
     * @param parMotor de la clase.
     * @param cilindrada de la clase.
     * @param disposicion de la clase.
     */
    public Motor(String nombre, Integer caballosPotencia, Integer parMotor, Integer cilindrada, String disposicion) {
        this.nombre = nombre;
        this.caballosPotencia = caballosPotencia;
        this.parMotor = parMotor;
        this.cilindrada = cilindrada;
        this.disposicion = disposicion;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCaballosPotencia() {
        return caballosPotencia;
    }

    public void setCaballosPotencia(Integer caballosPotencia) {
        this.caballosPotencia = caballosPotencia;
    }

    public Integer getParMotor() {
        return parMotor;
    }

    public void setParMotor(Integer parMotor) {
        this.parMotor = parMotor;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(String disposicion) {
        this.disposicion = disposicion;
    }
    
    
    
    

}
