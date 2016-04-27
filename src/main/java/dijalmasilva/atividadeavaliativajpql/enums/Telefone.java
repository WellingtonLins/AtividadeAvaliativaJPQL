/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.atividadeavaliativajpql.enums;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Telefone implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    private String numero;
    @Enumerated(EnumType.ORDINAL)
    private TelefoneType tipo;

    public Telefone() {
    }

    public Telefone(String numero, TelefoneType tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Telefone(int id, String numero, TelefoneType tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TelefoneType getTipo() {
        return tipo;
    }

    public void setTipo(TelefoneType tipo) {
        this.tipo = tipo;
    }
    
}
