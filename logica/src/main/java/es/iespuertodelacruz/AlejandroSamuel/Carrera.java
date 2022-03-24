/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.AlejandroSamuel;

import java.sql.Time;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machado
 */
public class Carrera {
    
    //Atributos de la clase
    Circuito circuito;
    Time tmpPole;
    Time tmpVueltaRpdCarrera;
    
    /**
     * Constructor por defecto.
     */
    public Carrera() {}

    /**
     * Constructor con 3 parametros.
     * @param circuito de la clase.
     * @param tmpPole de la clase.
     * @param tmpVueltaRpdCarrera de la clase.
     */
    public Carrera(Circuito circuito, Time tmpPole, Time tmpVueltaRpdCarrera) {
        this.circuito = circuito;
        this.tmpPole = tmpPole;
        this.tmpVueltaRpdCarrera = tmpVueltaRpdCarrera;
    }
    
    //Getters y Setters.

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public Time getTmpPole() {
        return tmpPole;
    }

    public void setTmpPole(Time tmpPole) {
        this.tmpPole = tmpPole;
    }

    public Time getTmpVueltaRpdCarrera() {
        return tmpVueltaRpdCarrera;
    }

    public void setTmpVueltaRpdCarrera(Time tmpVueltaRpdCarrera) {
        this.tmpVueltaRpdCarrera = tmpVueltaRpdCarrera;
    }
    
    
    
}
