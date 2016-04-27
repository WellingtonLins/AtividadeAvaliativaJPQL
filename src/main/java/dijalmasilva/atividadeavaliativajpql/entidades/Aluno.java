/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.entidades;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Aluno extends Pessoa{

    private String matricula;
    @Temporal(TemporalType.DATE)
    private LocalDate dataIngresso;
    private String turma;

    public Aluno() {
    }

    public Aluno(String matricula, LocalDate dataIngresso, String turma, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(nome, idade, dataNascimento, endereco);
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
        this.turma = turma;
    }

    public Aluno(String matricula, LocalDate dataIngresso, String turma, int id, String nome, int idade, LocalDate dataNascimento, Endereco endereco) {
        super(id, nome, idade, dataNascimento, endereco);
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}
