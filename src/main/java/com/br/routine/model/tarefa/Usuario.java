package com.br.routine.model.tarefa;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Usuario")
@Table(name = "usuario")
public class Usuario {

    private Long id;
    private String login;
    private String senha;
    private boolean ativa;

    public Usuario() {}

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
}
