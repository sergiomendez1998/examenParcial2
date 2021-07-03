/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Sergio_Mendez_G
 */
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "producto_id")
    private Integer producto_id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "volumen")
    private String volumen;

    @Column(name = "peso")
    private String peso;

    @Column(name = "alto")
    private String alto;

    @Column(name = "ancho")
    private String ancho;

    @Column(name = "profundidad")
    private String profundidad;

    @Column(name = "precio_base")
    private int precioBase;

    @Column(name = "precio_costo")
    private int precioCosto;

    @Column(name = "estado")
    private int estado;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)//
    private Set<FacturaDetalle> facturaDetalleSet = new HashSet();

    @ManyToMany
    @JoinTable(
            name = "cliente_producto",
            joinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    )
    private Set<Cliente> Clienteset = new HashSet();

    public Set<FacturaDetalle> getFacturaDetalleSet() {
        return facturaDetalleSet;
    }

    public void setFacturaDetalleSet(Set<FacturaDetalle> facturaDetalleSet) {
        this.facturaDetalleSet = facturaDetalleSet;
    }

    public Set<Cliente> getClienteset() {
        return Clienteset;
    }

    public void setClienteset(Set<Cliente> Clienteset) {
        this.Clienteset = Clienteset;
    }

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

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

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.producto_id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.producto_id, other.producto_id);
    }

    @Override
    public String toString() {
        return "producto{" + "producto_id=" + producto_id + '}';
    }

}
