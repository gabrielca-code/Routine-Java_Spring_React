package com.br.routine.model.usuario;

import jakarta.persistence.*;
import tools.jackson.databind.annotation.JsonSerialize;

@Entity(name = "usuario")
@Table(name = "usuario")
public class Usuario {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
    private Boolean ativa;
    private String nome;

    public Usuario() {}

    public Usuario(UsuarioAdicionarDTO dados) {
        this.login = dados.login();
        this.senha = dados.senha();
        this.nome = dados.nome();
        this.ativa = true;
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

    public Boolean isAtiva() {
        return ativa;
    }

    public String getNome() { return nome; }

    public void editar(UsuarioEditarDTO dados) {
        if(dados.login() != null)
            this.login = dados.login();
        if(dados.senha() != null)
            this.senha = dados.senha();
        if(dados.ativa() != null)
            this.ativa = dados.ativa();
        if(dados.nome()  != null)
            this.nome = dados.nome();
    }
}
