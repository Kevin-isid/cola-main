/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Cola.Base;

/**
 *
 * @author kevin.zambrano
 */
public class Personas extends Base {

    private int edad;
    

    public Personas() {
    }

    public Personas(int edad) {
        this.edad = edad;
        
    }
    
  
    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
    private String nombreP;
    private String correoP;

    public Personas() {
    }

    public Personas(String nombreP, String correoP) {
        this.nombreP = nombreP;
        this.correoP = correoP;
    }

    
    
    public String getCorreoP() {
        return correoP;
    }

    
    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }


    
    public String getNombreP() {
        return nombreP;
    }


    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombreP=" + nombreP + ", correoP=" + correoP + '}';
    }
     */
    @Override
    public Base copy() {
        return new Personas(edad);
    }

}
