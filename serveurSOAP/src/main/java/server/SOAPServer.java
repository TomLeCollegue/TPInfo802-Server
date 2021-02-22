package server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SOAPServer {

    @WebMethod
    public double calculDeliveryFee(double weight, double distance) {

        double price = weight * distance * 0.1;
        return price;

    }

}
