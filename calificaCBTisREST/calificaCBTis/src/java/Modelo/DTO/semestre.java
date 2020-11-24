/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

/**
 *
 * @author Juan_Carlos
 */
public class semestre {
    private int semestreID;
    private String descripcion;

    /**
     * @return the semestreID
     */
    public int getSemestreID() {
        return semestreID;
    }

    /**
     * @param semestreID the semestreID to set
     */
    public void setSemestreID(int semestreID) {
        this.semestreID = semestreID;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
