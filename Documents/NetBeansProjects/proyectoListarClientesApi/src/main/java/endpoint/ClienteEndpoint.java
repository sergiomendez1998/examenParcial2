/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endpoint;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import servicio.ClienteServicio;

/**
 *
 * @author Sergio_Mendez_G
 */
@Path("/clientes")
public class ClienteEndpoint {

    
    @Inject
    private ClienteServicio clienteServicio;

     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findClientes() {
        var clienteList = this.clienteServicio.getClientes();
        return Response.ok(clienteList).build();
    }

}
