/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.AlejandroSamuel;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machad
 */
public class Temporada {
    
    //Atributos de la clase
    String nombre;
    ArrayList<Carrera> carreras;
    HashMap<String, Equipo> equipos;
    
    /**
     * Constructor por defecto.
     */
    public Temporada(){}

    /**
     * Constructor con un parametro.
     * @param nombre de la clase.
     * 
     */
    public Temporada(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
        this.equipos = new HashMap<>();
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public HashMap<String, Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(HashMap<String, Equipo> equipos) {
        this.equipos = equipos;
    }
    
    
    
    
}
