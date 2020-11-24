/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.DTO.Salida;
import Modelo.DTO.AlumnoMateria;
import Modelo.DTO.alumno;
import Modelo.DTO.docente;
import Modelo.DTO.grupo;
import Modelo.DTO.materia;
import Modelo.DTO.padreFamilia;
import Modelo.DTO.semestre;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author Juan_Carlos
 */
public class SolicitudDAO {

    public Salida agregar(AlumnoMateria alumnoMateria) {

        String sql = "{CALL SP_insertarCalificacion(?,?,?,?,?,?,?,?,?)}";
        Salida salida = new Salida();
        try {
            CallableStatement cs = ConexionBD.getInstance().getConnection().prepareCall(sql);

            cs.setInt(1, alumnoMateria.getMateria().getMateriaID());
            cs.setInt(2, alumnoMateria.getAlumno().getAlumnoID());
            cs.setInt(3, alumnoMateria.getCalFinal());
            cs.setInt(4, alumnoMateria.getGrupo().getGrupoID());
            cs.setInt(5, alumnoMateria.getSemestre().getSemestreID());
            cs.setInt(6, alumnoMateria.getPadreFamilia().getPadreFamiliaID());

            cs.setInt(7, alumnoMateria.getDocente().getDocenteID());

            cs.registerOutParameter(8, Types.VARCHAR);
            cs.registerOutParameter(9, Types.VARCHAR);
            cs.execute();
            salida.setEstatus(cs.getString(8));

            salida.setMensaje(cs.getString(9));
            cs.close();
            ConexionBD.getInstance().cerrar();

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el sp_registrar_solicitud:" + ex.getMessage());
        }
        return salida;
    }

    public Salida modificar(AlumnoMateria alumnoMateria) {
        String sql = "{call sp_modificar_calificacion(?,?,?,?,?)}";
        Salida s = new Salida();
        try {
            CallableStatement cs = ConexionBD.getInstance().getConnection().
                    prepareCall(sql);
            cs.setInt(1, alumnoMateria.getAlumnoMateriaID());
            cs.setInt(2, alumnoMateria.getAlumno().getAlumnoID());
            cs.setInt(3, alumnoMateria.getCalFinal());
            cs.registerOutParameter(4, Types.VARCHAR);
            cs.registerOutParameter(5, Types.VARCHAR);
            cs.execute();
            s.setEstatus(cs.getString(4));
            s.setMensaje(cs.getString(5));
            cs.close();
            ConexionBD.getInstance().cerrar();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar:" + sql + ", " + ex.getMessage());
            s.setEstatus("Error:");
            s.setMensaje("Error al ejecutar:" + sql);
        }
        return s;
    }

    public Salida eliminar(int alumnoID) {
        String sql = "{call sp_eliminarCalificacion(?,?,?)}";
        Salida s = new Salida();
        try {
            CallableStatement cs = ConexionBD.getInstance()
                    .getConnection().prepareCall(sql);
            cs.setInt(1, alumnoID);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();
            s.setEstatus(cs.getString(2));
            s.setMensaje(cs.getString(3));
            cs.close();
            ConexionBD.getInstance().cerrar();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar:" + sql + ", " + ex.getMessage());
            s.setEstatus("Error:");
            s.setMensaje("Error al ejecutar:" + sql);
        }
        return s;
    }

    public Object consultaGeneral() {
        String sql = "select alumnoMateriaID, MateriaID, AlumnoID, calFinal, \n"
                + "   GrupoID, SemestreID, PadreFamiliaID, DocenteID from alumnoMateria";

        Salida s = new Salida();
        ArrayList<AlumnoMateria> calificaciones = new ArrayList<AlumnoMateria>();
        try {
            Statement query = ConexionBD.getInstance().getConnection().createStatement();
            ResultSet rs = query.executeQuery(sql);
            while (rs.next()) {
                AlumnoMateria alumnoMateria = new AlumnoMateria();
                alumnoMateria.setAlumnoMateriaID(rs.getInt("alumnoMateriaID"));
                materia Materia = new materia();
                Materia.setMateriaID(rs.getInt("MateriaID"));
                alumno Alumno = new alumno();
                Alumno.setAlumnoID(rs.getInt("AlumnoID"));
                alumnoMateria.setCalFinal(rs.getInt("calFinal"));
                grupo Grupo = new grupo();
                Grupo.setGrupoID(rs.getInt("GrupoID"));
                semestre Semestre = new semestre();
                Semestre.setSemestreID(rs.getInt("SemestreID"));
                padreFamilia PadreFamilia = new padreFamilia();
                PadreFamilia.setPadreFamiliaID(rs.getInt("PadreFamiliaID"));
                docente Docente = new docente();
                Docente.setDocenteID(rs.getInt("DocenteID"));
                calificaciones.add(alumnoMateria);

            }
            rs.close();
            query.close();
            ConexionBD.getInstance().cerrar();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar:" + sql + ", " + ex.getMessage());
            s.setEstatus("Error:");
            s.setMensaje("Error al ejecutar:" + sql);
            return s;
        }
        if (calificaciones.size() > 0) {
            return calificaciones;
        } else {
            s.setEstatus("OK");
            s.setMensaje("No hay calificaciones registradas");
            return s;
        }
    }

    public Object consultaIndividual(int alumnoMateriaID) {
        String sql = "select alumnoMateriaID, MateriaID, AlumnoID, calFinal, GrupoID, SemestreID, PadreFamiliaID, " 
                  + "DocenteID from VAlumno where alumnoMateriaID=?";
        Salida s = new Salida();
        AlumnoMateria alumnoMateria = new AlumnoMateria();
        try {
            PreparedStatement ps = ConexionBD.getInstance().getConnection().
                    prepareStatement(sql);
            ps.setInt(1, alumnoMateriaID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumnoMateria.setAlumnoMateriaID(rs.getInt("alumnoMateriaID"));
                materia ma=new materia();
                ma.setMateriaID(rs.getInt("MateriaID"));
                alumno a=new alumno();
                a.setAlumnoID(rs.getInt("AlumnoID"));
                alumnoMateria.setCalFinal(rs.getInt("calFinal"));
                grupo g=new grupo();
                g.setGrupoID(rs.getInt("GrupoID"));
                semestre sem=new semestre();
                sem.setSemestreID(rs.getInt("SemestreID"));
                padreFamilia p=new padreFamilia();
                p.setPadreFamiliaID(rs.getInt("PadreFamiliaID"));
               docente d=new docente();
               d.setDocenteID(rs.getInt("DocenteID"));
              
                        
               
            }
            rs.close();
            ps.close();
            ConexionBD.getInstance().cerrar();

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar:" + sql + ", " + ex.getMessage());
            s.setEstatus("Error:");
            s.setMensaje("Error al ejecutar:" + sql);
            return s;
        }
        if (alumnoMateria.getAlumnoMateriaID() != 0) {
            return alumnoMateria;
        } else {
            s.setEstatus("OK");
            s.setMensaje("No hay registros para este ID:" );
            return s;
        }
    }

}
