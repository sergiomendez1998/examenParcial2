/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Sergio_Mendez_G
 */
@RequestScoped
public class ClienteServicio {

    public static List<Cliente> clientesData = new ArrayList<>();

    public List<Cliente> getClientes() {

        Cliente cliente1 = new Cliente(1, "WALMART-SA", " Operador de tiendas", "Guatemala zona 1", 10000);
        Cliente cliente2 = new Cliente(2, "Supermercado La Torre", " Operador de tiendas", "guatemala zona 6", 2000);
        Cliente cliente3 = new Cliente(3, "Distelsa SA", " Operador de tiendas", "guatemala zona 7", 3000);

        clientesData.add(cliente1);
        clientesData.add(cliente2);
        clientesData.add(cliente3);

        return clientesData;

    }

}
