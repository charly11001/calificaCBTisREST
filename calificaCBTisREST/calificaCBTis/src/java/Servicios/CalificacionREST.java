/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import Modelo.DAO.SolicitudDAO;
import Modelo.DTO.Salida;
import Modelo.DTO.AlumnoMateria;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author Juan_Carlos
 */
@Path("/Calificaciones")
public class CalificacionREST {

    @Context
    private UriInfo context;
    Gson gson;
    SolicitudDAO sdao;

    /**
     * Creates a new instance of CalificacionREST
     */
    public CalificacionREST() {

        gson = new Gson();
        sdao = new SolicitudDAO();
        /**
         * Creates a new instance of SolicitudREST
         */
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String registrar(String json) {
        AlumnoMateria alumnoMateria = gson.fromJson(json, AlumnoMateria.class);
        Salida salida = sdao.agregar(alumnoMateria);
        return gson.toJson(salida);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String consultarCalificaciones() {
        Object objeto = sdao.consultaGeneral();
        return gson.toJson(objeto);
    }

      @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String eliminar(@PathParam("id") int alumnoID){
        
        Salida salida=sdao.eliminar(alumnoID);
        return gson.toJson(salida);
    }
    
     @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String modificar(String json){
        AlumnoMateria alumnoMateria=gson.fromJson(json, AlumnoMateria.class);
        Salida salida=sdao.modificar(alumnoMateria);
        return gson.toJson(salida);
    }
    
      @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String consultarCalificacion(@PathParam("id") int alumnoMateriaID){
       Object objeto=sdao.consultaIndividual(alumnoMateriaID);
       return gson.toJson(objeto);
    } 
}
