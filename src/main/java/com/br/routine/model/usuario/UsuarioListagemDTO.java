package com.br.routine.model.usuario;

import com.br.routine.model.tarefa.Tarefa;

public record UsuarioListagemDTO(
        Long id,
        String login,
        boolean isAtiva
) {

    public UsuarioListagemDTO(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin(), usuario.isAtiva());
    }

}
