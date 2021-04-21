/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicios;

import java.util.Date;
import lombok.Data;

/**
 * 
 * @sergio santos mendez
 */
@Data
public class Producto {
    
    private int id;
    private String codigo;
    private String nombre;
    private double precioBase;
    private double precioVenta;
    private int existencia;
    private Date fechaCreacion;
   

    public Producto() {
    }
    
    

    public Producto(String codigo, String nombre, double precioBase, double precioVenta, int existencia, Date fechaCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
        this.fechaCreacion = fechaCreacion;
    }
    
    
    
      public void setFechaNacimiento(Date fechac) {

        if (fechac.getTime() > new Date().getTime()) {
            this.fechaCreacion= null;
        } else {
            this.fechaCreacion = fechac;
        }

    }

}
