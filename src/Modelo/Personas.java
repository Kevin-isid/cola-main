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

    private String nombreP;
    private String correoP;

    public Personas() {
    }

    public Personas(String nombreP, String correoP) {
        this.nombreP = nombreP;
        this.correoP = correoP;
    }

    
    /**
     * Get the value of correoP
     *
     * @return the value of correoP
     */
    public String getCorreoP() {
        return correoP;
    }

    /**
     * Set the value of correoP
     *
     * @param correoP new value of correoP
     */
    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }


    /**
     * Get the value of nombreP
     *
     * @return the value of nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * Set the value of nombreP
     *
     * @param nombreP new value of nombreP
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombreP=" + nombreP + ", correoP=" + correoP + '}';
    }
   
    
    
    @Override
    public Base copy() {
        return new Personas(nombreP, correoP);
    }

}
