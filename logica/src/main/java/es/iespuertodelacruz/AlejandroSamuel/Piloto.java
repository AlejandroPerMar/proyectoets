/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.AlejandroSamuel;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machad
 */
public class Piloto {
    
    //Atributos de la clase
    String nombre;
    String apellido;
    Integer edad;
    String paisOrigen;
    Temporada temporadasrealizadas;

    
    /**
     * Constructor por defecto.
     */
    public Piloto() {}

    
    /**
     * Constructor com 5 parametros.
     * @param nombre de la clase.
     * @param apellido de la clase.
     * @param edad de la clase.
     * @param paisOrigen de la clase.
     * @param temporadasrealizadas de la clase.
     */
    public Piloto(String nombre, String apellido, Integer edad, String paisOrigen, Temporada temporadasrealizadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.paisOrigen = paisOrigen;
        this.temporadasrealizadas = temporadasrealizadas;
    }
    
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Temporada getTemporadasrealizadas() {
        return temporadasrealizadas;
    }

    public void setTemporadasrealizadas(Temporada temporadasrealizadas) {
        this.temporadasrealizadas = temporadasrealizadas;
    }
    
    
    
    
    
}
