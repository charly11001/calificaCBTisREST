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
public class AlumnoMateria {
    
    
   private int alumnoMateriaID;
   private int calFinal;
   private grupo grupo;
   private materia materia;
   private alumno alumno;
   private docente docente;
   private semestre semestre;
   private padreFamilia padreFamilia;

    /**
     * @return the alumnoMateriaID
     */
    public int getAlumnoMateriaID() {
        return alumnoMateriaID;
    }

    /**
     * @param alumnoMateriaID the alumnoMateriaID to set
     */
    public void setAlumnoMateriaID(int alumnoMateriaID) {
        this.alumnoMateriaID = alumnoMateriaID;
    }

    /**
     * @return the calFinal
     */
    public int getCalFinal() {
        return calFinal;
    }

    /**
     * @param calFinal the calFinal to set
     */
    public void setCalFinal(int calFinal) {
        this.calFinal = calFinal;
    }

    /**
     * @return the grupo
     */
    public grupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(grupo grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the materia
     */
    public materia getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(materia materia) {
        this.materia = materia;
    }

    /**
     * @return the alumno
     */
    public alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the docente
     */
    public docente getDocente() {
        return docente;
    }

    /**
     * @param docente the docente to set
     */
    public void setDocente(docente docente) {
        this.docente = docente;
    }

    /**
     * @return the semestre
     */
    public semestre getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(semestre semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the padreFamilia
     */
    public padreFamilia getPadreFamilia() {
        return padreFamilia;
    }

    /**
     * @param padreFamilia the padreFamilia to set
     */
    public void setPadreFamilia(padreFamilia padreFamilia) {
        this.padreFamilia = padreFamilia;
    }

    
}
