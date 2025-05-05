package com.github.andreytondo;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("pessoa")
public class PessoaResource {

    @Inject
    PessoaService service;

    @GET
    @Path("{id}")
    public Pessoa findById(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @POST
    public void create(Pessoa pessoa) {
        service.create(pessoa);
    }

    @PUT
    @Path("{id}")
    public void update(@PathParam("id") Long id, Pessoa pessoa) {
        service.update(id, pessoa);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        service.delete(id);
    }
}
