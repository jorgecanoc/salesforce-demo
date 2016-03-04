package com.sophiademo.camel.salesforce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.salesforce.dto.QueryRecordsAccount;
import org.apache.camel.salesforce.dto.QueryRecordsOpportunity;


@Path("/sf")
public class SalesforceService {

	@GET
	@Path("/opportunities")
	@Produces(MediaType.APPLICATION_JSON)
	public QueryRecordsOpportunity getOpportunities(){
		return null;
	}

	@GET
	@Path("/accounts")
	@Produces(MediaType.APPLICATION_JSON)
	public QueryRecordsAccount getAccounts(){
		return null;
	}	
}
