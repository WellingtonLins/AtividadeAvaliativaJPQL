/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.main;

import dijalmasilva.atividadeavaliativajpql.jpa.JpaAluno;
import dijalmasilva.atividadeavaliativajpql.jpa.JpaLivro;
import dijalmasilva.atividadeavaliativajpql.jpa.JpaProfessor;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Loader {

    public static void main(String[] args) {
        
//        Aluno aluno = new Aluno("201312010134", LocalDate.of(2013, Month.MAY, 13), "P1", "Manoel Dijalma", 
//                21, LocalDate.of(1995, Month.JANUARY, 26), new Endereco("Tenente Aquino de Albuquerque",
//                        "Casas Populares", "Cajazeiras", "58900-000"));
//        Professor professor = new Professor(5000, "Job", 28, LocalDate.of(1988, Month.MARCH, 10), 
//                new Endereco("Que prova fácil", "Centro", "Cajazeiras", "58900-000"));
//        Professor professor2 = new Professor(5000, "Diogo", 28, LocalDate.of(1988, Month.MARCH, 28), 
//                new Endereco("Que prova fácil", "Oasis", "Cajazeiras", "58900-000"));
//        Telefone telefone = new Telefone("3531-2123", TelefoneType.RESIDENDECIAL);
//        Telefone comercial = new Telefone("3531-1222", TelefoneType.COMERCIAL);
//        professor.addTelefone(telefone);
//        professor.addTelefone(comercial);
//        Autor autor = new Autor("Clare College", "Anton Gill", 67, LocalDate.of(1948, Month.OCTOBER, 22), 
//                new Endereco("Qualquer", "Centro", "Ilford", "28182-222"));
//        Livro livro = new Livro("Assassins Creed", "9789500207713", new Date(2009, 11, 20));
//        
//        autor.addLivro(livro);
//        livro.addAutor(autor);
        
        JpaAluno daoAluno = new JpaAluno();
//        daoAluno.salvar(aluno);
        JpaProfessor daoProfessor = new JpaProfessor();
//        daoProfessor.salvar(professor);
//        daoProfessor.salvar(professor2);
        JpaLivro daoLivro = new JpaLivro();
//        daoLivro.salvar(livro);
        
//        System.out.println("Deu certo!!");
    }
}
