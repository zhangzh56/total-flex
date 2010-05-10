/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalflex.model.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Clayton K. N. Passos
 */
@Entity
public class Endereco extends Contato implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @NotNull
    @Size(max = 100)
    private String logradouro;
    @Size(max = 10)
    private String numero;
    @Size(max = 255)
    private String observacao;
    @ManyToOne
    @NotNull
    private Cidade cidade;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
