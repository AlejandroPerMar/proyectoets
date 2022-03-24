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
    String paisOrigen;
    ArrayList<Carrera> carreras;
    HashMap<String, Escuderia> escuderias;
    
    /**
     * Constructor por defecto.
     */
    public Temporada(){}

    /**
     * Constructor con dos parametros.
     * @param nombre de la clase.
     * @param paisOrigen de la clase.
     * 
     */
    public Temporada(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.carreras = new ArrayList<>();
        this.escuderias = new HashMap<>();
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

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public HashMap<String, Escuderia> getEscuderias() {
        return escuderias;
    }

    public void setEscuderias(HashMap<String, Escuderia> escuderias) {
        this.escuderias = escuderias;
    }
    
    
    
    
}
