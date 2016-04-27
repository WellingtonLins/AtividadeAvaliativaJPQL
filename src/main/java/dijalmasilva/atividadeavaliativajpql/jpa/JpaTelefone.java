/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.jpa;

import dijalmasilva.atividadeavaliativajpql.enums.Telefone;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class JpaTelefone {

    private final EntityManagerFactory factory;
    private final EntityManager em;

    public JpaTelefone() {
        this.factory = Persistence.createEntityManagerFactory("AtividadeJPQL");
        this.em = factory.createEntityManager();
    }
    
    public boolean salvar(Telefone obj){
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean remover(Telefone obj){
        em.getTransaction().begin();
        em.remove(em.merge(obj));
        em.getTransaction().commit();
        return true;
    }
    
    public Telefone buscar(int key){
        return em.find(Telefone.class, key);
    }
}
