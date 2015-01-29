package controllers;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@ApplicationPath("/apath")
@Path("/path")
public class GrettingController extends Application {
	@GET
	public String shitt(){
		return "fuck";
	}
}
