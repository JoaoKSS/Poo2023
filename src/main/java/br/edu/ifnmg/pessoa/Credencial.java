/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

/**
 *
 * @author joaok
 */
public class Credencial {

    private String email;
    private String senha;
    private Boolean administrador = false;
    private Pessoa pessoa;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha == null) {
            throw new Exception("A senha não pode ser nula");
        } else if (senha.length() > 12) {
            throw new Exception("Senha não pode ter mais de 12 caracteres");
        }
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public String getTipoAdministrador() {
        return administrador ? "Administrador" : "Usuário geral";
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Credencial{" + "email=" + email + ", senha=" + senha + ", administrador=" + getTipoAdministrador() + '}';
    }

}
