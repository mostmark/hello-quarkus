package com.test;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class HelloResource {

    @ConfigProperty(name = "environment", defaultValue="local")
    String environment;
    @ConfigProperty(name = "name", defaultValue="me")
    String name;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello " + name + " in " + environment;
    }
}