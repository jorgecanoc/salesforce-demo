package com.sophiademo.camel.salesforce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/sf")
public class SalesforceService {

	@GET
	@Path("/{test}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getOpportunities(@PathParam("test") Long test){
		return null;
	}
}
