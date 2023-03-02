package com.andrelake.controllers;

import com.andrelake.controllers.dto.CreateUserRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    public Response getUsers() {
        return Response.ok().build();
    }

    @POST
    public Response createUser(CreateUserRequest request) {
        return Response.ok(request).build();
    }
}
