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
public class materia {
    
    private int materiaID;
    private String clave;
    private String nombre;

    /**
     * @return the materiaID
     */
    public int getMateriaID() {
        return materiaID;
    }

    /**
     * @param materiaID the materiaID to set
     */
    public void setMateriaID(int materiaID) {
        this.materiaID = materiaID;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      
}
