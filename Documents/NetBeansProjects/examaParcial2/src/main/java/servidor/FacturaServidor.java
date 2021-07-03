/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;
import modelo.Factura;

/**
 *
 * @author Sergio_Mendez_G
 */
@RequestScoped
public class FacturaServidor {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Factura> findFacturas() {
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Factura> query = builder.createQuery(Factura.class);
        query.from(Factura.class);
        return this.entityManager.createQuery(query).getResultList();
    }

}
