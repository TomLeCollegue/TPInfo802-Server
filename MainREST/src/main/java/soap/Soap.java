package soap;

import javafx.application.Application;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/soap")
public class Soap {

    @POST
    @Path("/calculDeliveryFee")
    @Consumes(MediaType.APPLICATION_JSON)
    public String calculDeliveryFee(JsonObject info){


        double weight = Double.parseDouble(info.getString("weight"));
        double distance = Double.parseDouble(info.getString("distance"));
        SOAPServer service = new SOAPServerService().getSOAPServerPort();
        double result = service.calculDeliveryFee(weight, distance);
        System.out.println(result);


        return "{ \"result\" : \"" + result +  "\"}";
    }
}
