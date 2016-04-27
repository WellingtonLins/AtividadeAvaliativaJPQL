/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.jpa;

import dijalmasilva.atividadeavaliativajpql.entidades.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class JpaAluno {

    private final EntityManagerFactory factory;
    private final EntityManager em;

    public JpaAluno() {
        this.factory = Persistence.createEntityManagerFactory("AtividadeJPQL");
        this.em = factory.createEntityManager();
    }
    
    public boolean salvar(Aluno obj){
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean remover(Aluno obj){
        em.getTransaction().begin();
        em.remove(em.merge(obj));
        em.getTransaction().commit();
        return true;
    }
    
    public Aluno buscar(int key){
        return em.find(Aluno.class, key);
    }
}
