/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

/**
 *
 * @author joaok
 */
public class Endereco {

    private TipoLogradouro tipoLogradouro;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private Integer cep;

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) throws Exception {
        if (logradouro == null) {
            throw new Exception("Logradouro nao pode ser nulo");
        } else if (logradouro.length() > 255) {
            throw new Exception("Logradouro nao pode ser mais de 255 caracteres");
        }
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if (bairro == null) {
            throw new Exception("Bairro nao pode ser nulo");
        } else if (bairro.length() > 50) {
            throw new Exception("Bairro nao pode ser mais de 50 caracteres");
        }
        this.bairro = bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public enum TipoLogradouro {
        AVENIDA, PRACA, RUA, OUTRO
    }

    @Override
    public String toString() {
        return "" + tipoLogradouro + " " + logradouro + "," + numero + "," + bairro + "," + cep;
    }

}
