/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.gppuerto.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machad
 */
public class Temporada {
    
    //Atributos de la clase
    private int anio;
    private ArrayList<Carrera> carreras;
    private HashMap<String, Equipo> equipos;
    
    /**
     * Constructor por defecto.
     */
    public Temporada(){}

    /**
     * Constructor con un parametro.
     * @param nombre de la clase.
     * 
     */
    public Temporada(int anio) {
        this.anio = anio;
        this.carreras = new ArrayList<>();
        this.equipos = new HashMap<>();
    }
    
    //Getters y Setters

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
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
