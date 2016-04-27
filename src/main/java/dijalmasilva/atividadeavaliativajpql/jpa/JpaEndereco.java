/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.jpa;

import dijalmasilva.atividadeavaliativajpql.entidades.Endereco;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class JpaEndereco {
    
    private final EntityManagerFactory factory;
    private final EntityManager em;

    public JpaEndereco() {
        this.factory = Persistence.createEntityManagerFactory("AtividadeJPQL");
        this.em = factory.createEntityManager();
    }
    
    public boolean salvar(Endereco obj){
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean remover(Endereco obj){
        em.getTransaction().begin();
        em.remove(em.merge(obj));
        em.getTransaction().commit();
        return true;
    }
    
    public Endereco buscar(int key){
        return em.find(Endereco.class, key);
    }
}
