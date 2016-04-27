/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.entidades;

import dijalmasilva.atividadeavaliativajpql.enums.Telefone;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Professor extends Pessoa{

    private double salario;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Telefone> telefones;

    public Professor() {
    }

    public Professor(double salario, List<Telefone> telefones, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(nome, idade, dataNascimento, endereco);
        this.salario = salario;
        this.telefones = telefones;
    }

    public Professor(double salario, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(nome, idade, dataNascimento, endereco);
        this.salario = salario;
        this.telefones = new ArrayList<>();
    }

    public Professor(double salario, List<Telefone> telefones, int id, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(id, nome, idade, dataNascimento, endereco);
        this.salario = salario;
        this.telefones = telefones;
    }

    public Professor(double salario, int id, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(id, nome, idade, dataNascimento, endereco);
        this.salario = salario;
        this.telefones = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void addTelefone(Telefone telefone){
        this.telefones.add(telefone);
    }
}
