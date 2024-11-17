package com.iri.jakartarestful.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.EntityPart;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.io.File;

/**
 *
 * @author Isaac Rodriguez
 */
@Path("testing")
public class JakartaEE10Resource {

  @GET
  public Response get() {
    return Response
            .ok("All right, check next one")
            .build();
  }

  @POST
  public Response post() {
    return Response
            .ok("All right, check next one")
            .build();
  }

  @GET
  @Produces(MediaType.APPLICATION_OCTET_STREAM)
  public Response download() {
    File file = new File("C:/text.txt");
    return Response
            .ok(file)
            .build();
  }

  @POST
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  public Response upload(@FormParam("file") EntityPart file) {
    System.out.println("file name: " + file.getName());
    return Response
            .ok("All right, check next one")
            .build();
  }
}
