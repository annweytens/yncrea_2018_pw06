package yncrea.pw06.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yncrea.pw06.core.entity.CalEvent;
import yncrea.pw06.core.service.CalEventService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Named
@Path("/calevents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Controller implements RestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    @Inject
    private CalEventService calEventService;


    @GET
    @Path("/")
    public List<CalEvent> findAll() {
        return calEventService.findAll();
    }

    @GET
    @Path("/{id}")
    public CalEvent findById(@PathParam("id") long id) {
        LOGGER.info("get event for key {}", id);
        return calEventService.findById(id);
    }


    @POST
    @Path("/")
    public void saveEvent(CalEvent event) {
        calEventService.saveEvent(event);
    }
}


