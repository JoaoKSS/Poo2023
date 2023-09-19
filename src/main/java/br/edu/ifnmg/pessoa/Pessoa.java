/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.pessoa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author joaok
 */
public class Pessoa {

    private String nome;
    private LocalDate nascimento;
    private Byte idade;

    private Credencial credencial;
    private ArrayList<Telefone> telefone;
    private ArrayList<Endereco> endereco;
    private ArrayList<Compra> compra;

    public Pessoa() {
        telefone = new ArrayList<>();
        endereco = new ArrayList<>();
        compra = new ArrayList<>();
    }

    public Byte getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Nome nao pode ser nulo");
        } else if (nome.length() > 45) {
            throw new Exception("Nome nao pode ser mais de 45 caracteres");
        }
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        LocalDate hoje = LocalDate.now();
        idade = (byte) nascimento.until(hoje, ChronoUnit.YEARS);
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<Telefone> telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Compra> getCompra() {
        return compra;
    }

    public void setCompra(ArrayList<Compra> compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nascimento=" + nascimento + ", idade=" + idade + ", credencial=" + credencial + ", endereco=" + endereco + ", telefone=" + telefone + ", compra=" + compra + '}';
    }

}
