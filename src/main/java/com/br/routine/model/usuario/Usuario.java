package com.br.routine.model.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Usuario")
@Table(name = "usuario")
public class Usuario {

    private Long id;
    private String login;
    private String senha;
    private boolean ativa;
    private String nome;

    public Usuario() {}

    public Usuario(UsuarioAdicionarDTO dados) {
        this.login = dados.login();
        this.senha = dados.senha();
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public String getNome() { return nome; }
}
