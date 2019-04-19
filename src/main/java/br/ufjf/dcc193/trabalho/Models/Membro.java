package br.ufjf.dcc193.trabalho.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Membro
 */
@Entity
public class Membro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Sede sede;
    private long idMembro;
    private String nomeCompleto;
    private String funcao;
    private String email;
    private String dataEntrada;
    private String dataSaida;

    public Membro(){

    }

    public Membro(String nome, String funcao, String email, String data_entrada, String data_saida){
        this.nomeCompleto = nome;
        this.funcao = funcao;
        this.email = email;
        this.dataEntrada = data_entrada;
        this.dataSaida = data_saida;
    }

    public Membro(Sede sede, String nome, String funcao, String email, String data_entrada, String data_saida){
        this.sede = sede;
        this.nomeCompleto = nome;
        this.funcao = funcao;
        this.email = email;
        this.dataEntrada = data_entrada;
        this.dataSaida = data_saida;
    }

    /**
     * @return the id
     */
    public long getId() {
        return idMembro;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.idMembro = id;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public String getDataSaida() {
        return dataSaida;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

}