/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.jpa;

import dijalmasilva.atividadeavaliativajpql.entidades.Autor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class JpaAutor {

    private final EntityManagerFactory factory;
    private final EntityManager em;

    public JpaAutor() {
        this.factory = Persistence.createEntityManagerFactory("AtividadeJPQL");
        this.em = factory.createEntityManager();
    }
    
    public boolean salvar(Autor obj){
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean remover(Autor obj){
        em.getTransaction().begin();
        em.remove(em.merge(obj));
        em.getTransaction().commit();
        return true;
    }
    
    public Autor buscar(int key){
        return em.find(Autor.class, key);
    }
}
