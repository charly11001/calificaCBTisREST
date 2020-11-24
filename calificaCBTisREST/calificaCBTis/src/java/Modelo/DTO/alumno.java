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
public class alumno {
    private int alumnoID;
    private String noControl;
    private String estatus;

    /**
     * @return the alumnoID
     */
    public int getAlumnoID() {
        return alumnoID;
    }

    /**
     * @param alumnoID the alumnoID to set
     */
    public void setAlumnoID(int alumnoID) {
        this.alumnoID = alumnoID;
    }

    /**
     * @return the noControl
     */
    public String getNoControl() {
        return noControl;
    }

    /**
     * @param noControl the noControl to set
     */
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
}
