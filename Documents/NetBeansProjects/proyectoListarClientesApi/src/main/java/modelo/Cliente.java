/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import jakarta.persistence.Id;
import lombok.Data;


/**
 *
 * @author Sergio_Mendez_G
 */
@Data
public class Cliente {

   
    private int id;

    private String nombre;

    private String nombreComercial;

    private String direccion;

    private int saldo;

    public Cliente(int id, String nombre, String nombreComercial, String direccion, int saldo) {
        this.id = id;
        this.nombre = nombre;
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.saldo = saldo;
    }

   
}
