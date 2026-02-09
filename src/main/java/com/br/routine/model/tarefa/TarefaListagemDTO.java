package com.br.routine.model.tarefa;

import com.br.routine.model.usuario.Usuario;
import com.br.routine.model.usuario.UsuarioListagemDTO;

public record TarefaListagemDTO(
        Long id,
        String titulo,
        String descricao,
        UsuarioListagemDTO usuario,
        Boolean ativa
) {

    public TarefaListagemDTO(Tarefa tarefa) {
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), new UsuarioListagemDTO(tarefa.getUsuario()), tarefa.isAtiva());
    }
}
