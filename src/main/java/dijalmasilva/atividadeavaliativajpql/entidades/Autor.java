/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.atividadeavaliativajpql.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Autor extends Pessoa {

    private String instituicaoVinculada;
    @ManyToMany(mappedBy = "autores", cascade = CascadeType.PERSIST)
    private List<Livro> livros;

    public Autor() {
    }

    public Autor(String instituicaoVinculada, List<Livro> livros, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(nome, idade, dataNascimento, endereco);
        this.instituicaoVinculada = instituicaoVinculada;
        this.livros = livros;
    }

    public Autor(String instituicaoVinculada, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(nome, idade, dataNascimento, endereco);
        this.instituicaoVinculada = instituicaoVinculada;
        this.livros = new ArrayList<>();
    }

    public Autor(String instituicaoVinculada, List<Livro> livros, int id, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(id, nome, idade, dataNascimento, endereco);
        this.instituicaoVinculada = instituicaoVinculada;
        this.livros = livros;
    }

    public Autor(String instituicaoVinculada, int id, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(id, nome, idade, dataNascimento, endereco);
        this.instituicaoVinculada = instituicaoVinculada;
        this.livros = new ArrayList<>();
    }
    
    public String getInstituicaoVinculada() {
        return instituicaoVinculada;
    }

    public void setInstituicaoVinculada(String instituicaoVinculada) {
        this.instituicaoVinculada = instituicaoVinculada;
    }
    
    public void addLivro(Livro livro){
        this.livros.add(livro);
    }

}
