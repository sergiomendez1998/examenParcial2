/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 *
 * @author Sergio_Mendez_G
 */
@Data
@EqualsAndHashCode(of ="id")
@ToString(of ="id")
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
