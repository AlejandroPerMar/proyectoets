/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.gppuerto.model;

import java.sql.Time;

/**
 *
 * @author Alejandro Pérez Martín y Samuel Gonzalez Machado
 */
public class Carrera {
    
    //Atributos de la clase
    Circuito circuito;
    Time tmpPole;
    Time tmpVueltaRapida;
    
    /**
     * Constructor por defecto.
     */
    public Carrera() {}

    /**
     * Constructor con 3 parametros.
     * @param circuito de la clase.
     * @param tmpPole de la clase.
     * @param tmpVueltaRapida de la clase.
     */
    public Carrera(Circuito circuito, Time tmpPole, Time tmpVueltaRapida) {
        this.circuito = circuito;
        this.tmpPole = tmpPole;
        this.tmpVueltaRapida = tmpVueltaRapida;
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

    public Time getTmpVueltaRapida() {
        return tmpVueltaRapida;
    }

    public void setTmpVueltaRapida(Time tmpVueltaRapida) {
        this.tmpVueltaRapida = tmpVueltaRapida;
    }
    
    
    
}
