/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Livro implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    private String isbn;
    @Temporal(TemporalType.DATE)
    private Date lancamento;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Autor> autores;

    public Livro() {
    }
    
    public Livro(String titulo, String isbn, Date lancamento, List<Autor> autores) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.lancamento = lancamento;
        this.autores = autores;
    }

    public Livro(String titulo, String isbn, Date lancamento) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.lancamento = lancamento;
        this.autores = new ArrayList<>();
    }

    public Livro(int id, String titulo, String isbn, Date lancamento, List<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.lancamento = lancamento;
        this.autores = autores;
    }

    public Livro(int id, String titulo, String isbn, Date lancamento) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.lancamento = lancamento;
        this.autores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    public void addAutor(Autor autor){
        this.autores.add(autor);
    }
}
