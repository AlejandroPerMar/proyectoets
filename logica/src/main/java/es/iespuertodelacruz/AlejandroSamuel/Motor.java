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
public class Motor {

    // Atributos de la clase Motor
    String nombre;
    Integer hp;
    Integer nm;
    Integer cc;
    String disposicionMotor;

    /**
     * Constructor por defecto.
     */
    public Motor() {}

    /**
     * Constructor con 5 parámetros.
     * @param nombre de la clase.
     * @param hp de la clase.
     * @param nm de la clase.
     * @param cc de la clase.
     * @param disposicionMotor de la clase.
     */
    public Motor(String nombre, Integer hp, Integer nm, Integer cc, String disposicionMotor) {
        this.nombre = nombre;
        this.hp = hp;
        this.nm = nm;
        this.cc = cc;
        this.disposicionMotor = disposicionMotor;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getNm() {
        return nm;
    }

    public void setNm(Integer nm) {
        this.nm = nm;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getDisposicionMotor() {
        return disposicionMotor;
    }

    public void setDisposicionMotor(String disposicionMotor) {
        this.disposicionMotor = disposicionMotor;
    }
    
    
    
    

}
