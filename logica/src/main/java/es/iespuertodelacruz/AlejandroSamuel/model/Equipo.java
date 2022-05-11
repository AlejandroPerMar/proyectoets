/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.AlejandroSamuel.model;

import java.util.HashMap;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machad
 */
public class Equipo {
    
    //Atributos de la clase Escuderia
    String nombre;
    String paisOrigen;
    HashMap<String, Piloto> pilotos;
    HashMap<String, Vehiculo> vehiculos;

    /**
     * Constructor por defecto.
     */
    public Equipo() {}

    /**
     * Constructor con  2 parámetros.
     * @param nombre de la clase.
     * @param paisOrigen de la clase.
     */
    public Equipo(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.pilotos = new HashMap<>();
        this.vehiculos = new HashMap<>();
    }

    //Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public HashMap<String, Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(HashMap<String, Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public HashMap<String, Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(HashMap<String, Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    

    
    
}
