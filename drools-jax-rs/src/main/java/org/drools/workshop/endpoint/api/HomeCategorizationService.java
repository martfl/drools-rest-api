/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.endpoint.api;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.*;


@Path("home")
public interface HomeCategorizationService {
    //--------------------- Sensores ---------------------------------------------------
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/setsensor")
    public Sensor setSensor(@NotNull Sensor sensor);

    @GET
    @Produces("application/json")
    @Path("/getsensores")
    public List<Sensor> getSensores();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deletesensor")
    public Sensor deleteSensor(@NotNull String name);

    //--------------------- Aire Acondicionado -----------------------------------------
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/setaire")
    public AireCondicionado setAire(@NotNull AireCondicionado aire);

    @GET
    @Produces("application/json")
    @Path("/getaires")
    public List<AireCondicionado> getAires();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deleteaire")
    public AireCondicionado deleteAire(@NotNull String name);

    //--------------------- Focos -----------------------------------------
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/setfoco")
    public Foco setFoco(@NotNull Foco foco);

    @GET
    @Produces("application/json")
    @Path("/getfocos")
    public List<Foco> getFocos();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deletefoco")
    public Foco deleteFoco(@NotNull String name);

    //--------------------- Sensores de Presencia -----------------------------------------
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/setsensorpre")
    public SensorPresencia setSensorPre(@NotNull SensorPresencia sensorPre);

    @GET
    @Produces("application/json")
    @Path("/getsensorespre")
    public List<SensorPresencia> getSensoresPre();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deletesensorpre")
    public SensorPresencia deleteSensorPre(@NotNull String name);

    //--------------------- Sensores de Temperatura -----------------------------------------
    @GET
    @Produces("application/json")
    @Path("/getsensorestemp")
    public List<SensorTemperatura> getsensoresTemp();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/setsensortemp")
    public SensorTemperatura setSensorTemp(@NotNull SensorTemperatura sensor);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deletesensortemp")
    public SensorTemperatura deleteSensorTemp(@NotNull String name);

    //--------------------- Lugares -----------------------------------------
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/setplace")
    public Place setplace(@NotNull Place place);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deleteplace")
    public Place deleteplace(@NotNull Integer id);

    @GET
    @Produces("application/json")
    @Path("")
    public List<Place> getplaces();

    //--------------------- Objetos -----------------------------------------
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/setobject")
    public Home_object setobject(@NotNull Home_object object);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/deleteobject")
    public Home_object deleteobject(@NotNull Integer id);

    @GET
    @Produces("application/json")
    @Path("/getobjects")
    public List<Home_object> getobjects();

}
