package com.github.andreytondo;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("pessoa")
public class PessoaResource {

    @Inject
    PessoaService service;

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Pessoa findById(@PathParam("id") Long id) {
        return service.findById(id);
    }
}
