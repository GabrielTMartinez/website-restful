package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("/greeting")
public class GreetingController extends Application {
	@GET
	public String shitt(){
		return "fuck";
	}
}
