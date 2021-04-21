/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicios;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 * 
 * @sergio santos mendez
 */
@RequestScoped
public class ProductoServicio implements Serializable {
    
   public static List<Producto> datosProductos = new ArrayList<>();
          
   
   public List<Producto> mostrarProductos(){
  
       return datosProductos;
   
   }
   
    public void agregarProducto(Producto pro) {
       pro.setId(datosProductos.size()+1);
       datosProductos.add(pro);
       
    }
    
    
   
    
    
   

}
