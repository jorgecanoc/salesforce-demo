package com.sophiademo.camel.salesforce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.salesforce.dto.QueryRecordsAccount;
import org.apache.camel.salesforce.dto.QueryRecordsOpportunity;

@Path("/sf")
public class SalesforceService {

	@GET
	@Path("/opportunity")
	@Produces(MediaType.APPLICATION_JSON)
	public QueryRecordsOpportunity getOpportunities() {
		return null;
	}

	@GET
	@Path("/opportunity/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public QueryRecordsOpportunity getOpportunity(@PathParam("id") String id) {
		return null;
	}

	@GET
	@Path("/account")
	@Produces(MediaType.APPLICATION_JSON)
	public QueryRecordsAccount getAccounts() {
		return null;
	}

	@GET
	@Path("/account/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public QueryRecordsAccount getAccount(@PathParam("id") String id) {
		return null;
	}
}
