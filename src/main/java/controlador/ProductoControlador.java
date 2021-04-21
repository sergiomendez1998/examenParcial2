/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.Date;

import java.util.List;
import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Data;

import org.primefaces.PrimeFaces;
import servicios.Producto;
import servicios.ProductoServicio;

/**
 *
 * @sergio santos mendez gonzalez
 */
@Named
@ViewScoped

public class ProductoControlador implements Serializable {

    private String codigo;
    private String nombre;
    private double precioB;
    private double precioV;
    private int existen;
    private Date fechaC;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioB() {
        return precioB;
    }

    public void setPrecioB(double precioB) {
        this.precioB = precioB;
    }

    public double getPrecioV() {
        return precioV;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }

    public int getExisten() {
        return existen;
    }

    public void setExisten(int existen) {
        this.existen = existen;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public ProductoServicio getProdS() {
        return prodS;
    }

    public void setProdS(ProductoServicio prodS) {
        this.prodS = prodS;
    }

    private Producto productos;

    @Inject
    private ProductoServicio prodS;

    private List<Producto> prod;

    @PostConstruct
    public void init() {

        this.prod = this.prodS.mostrarProductos();
    }

    public void agregar() {

        productos = new Producto(codigo, nombre, precioB, precioV, existen, fechaC);
        prodS.agregarProducto(productos);
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Informacion: ", "producto agregado satisfactoriamente!!!");
        PrimeFaces.current().dialog().showMessageDynamic(message);
        this.productos = new Producto();
        
   }

    public List<Producto> getProd() {
        return prod;
    }
    
    

     public String EliminarProducto(Producto producto) {
      prod.remove(producto);
      FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Informacion: ", "Producto Eliminado Correctamente!!!");
        PrimeFaces.current().dialog().showMessageDynamic(message);
        return null;
    }
     
     
      
      
  
       
       
   
}
