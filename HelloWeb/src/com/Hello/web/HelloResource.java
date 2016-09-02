package com.Hello.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

@GET
@Produces("text/plain")
public String getPersonName(){
	return "Hello World!!!";
}

}
