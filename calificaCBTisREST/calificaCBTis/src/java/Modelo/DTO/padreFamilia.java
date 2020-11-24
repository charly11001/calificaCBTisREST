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
public class padreFamilia {
    private int padreFamiliaID;
    private String nombre;
    private int telefono;

    /**
     * @return the padreFamiliaID
     */
    public int getPadreFamiliaID() {
        return padreFamiliaID;
    }

    /**
     * @param padreFamiliaID the padreFamiliaID to set
     */
    public void setPadreFamiliaID(int padreFamiliaID) {
        this.padreFamiliaID = padreFamiliaID;
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

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
