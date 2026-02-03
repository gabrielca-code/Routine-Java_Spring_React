package com.br.routine.model.usuario;

import com.br.routine.model.tarefa.Tarefa;

public record UsuarioListagemDTO(
        Long id,
        String login,
        String nome,
        Boolean ativa

) {

    public UsuarioListagemDTO(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin(), usuario.getNome(), usuario.isAtiva());
    }

}
