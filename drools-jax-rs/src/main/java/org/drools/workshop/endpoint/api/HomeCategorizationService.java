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

/**
 *
 * @author salaboy
 */
@Path("home")
public interface HomeCategorizationService {
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
