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
import modelo.FacturaDetalle;

/**
 *
 * @author Sergio_Mendez_G
 */
@RequestScoped
public class FacturaDetalleServidor {
   @PersistenceContext
    private EntityManager entityManager;

    public List<FacturaDetalle> findFacturaDetalle() {
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<FacturaDetalle> query = builder.createQuery(FacturaDetalle.class);
        query.from(FacturaDetalle.class);
        return this.entityManager.createQuery(query).getResultList();
    }
}
