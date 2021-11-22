/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.travelagency.server.infra;

import co.unicauca.serversocket.serversockettemplate.infra.ServerSocketMultiThread;
import co.unicauca.travelagency.server.access.CustomerRepositoryImplArrays;
import co.unicauca.travelagency.server.domain.services.CustomerService;

/**
 *
 * @author ahurtado
 */
public class TravelAgencyServer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocketMultiThread myServer = new ServerSocketMultiThread(3000);
        TravelAgencyHandler myHandler = new TravelAgencyHandler();
        myHandler.setService(new CustomerService(new CustomerRepositoryImplArrays()) );
        myServer.setServerHandler(myHandler);
        myServer.startServer();
    }
    
}
