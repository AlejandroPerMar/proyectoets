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
public class Circuito {
    
    //Atributos de la clase
    String nombre;
    String pais;
    Double distanciaEnKm;
    
    /**
     * Constructor por defecto
     */
    public Circuito() {}

    /**
     * Constructor con 3 parametros.
     * @param nombre de la clase.
     * @param pais de la clase.
     * @param distanciaEnKm  de la clase.
     */
    public Circuito(String nombre, String pais, Double distanciaEnKm) {
        this.nombre = nombre;
        this.pais = pais;
        this.distanciaEnKm = distanciaEnKm;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getDistanciaEnKm() {
        return distanciaEnKm;
    }

    public void setDistanciaEnKm(Double distanciaEnKm) {
        this.distanciaEnKm = distanciaEnKm;
    }
    
    
    
    
    
}
