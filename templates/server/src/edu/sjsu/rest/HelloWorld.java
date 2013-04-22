package edu.sjsu.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public class HelloWorld {

	@GET
	@Produces({  MediaType.TEXT_HTML, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String getHelloWorld(@QueryParam("msg") String msg){
		return "echo: " + msg;
	}
}
