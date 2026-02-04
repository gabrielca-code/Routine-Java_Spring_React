package com.br.routine.model.tarefa;

import com.br.routine.model.usuario.Usuario;

public record TarefaListagemDTO(
        Long id,
        String titulo,
        String descricao,
        Usuario usuario,
        Boolean ativa
) {

    public TarefaListagemDTO(Tarefa tarefa) {
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getUsuario(), tarefa.isAtiva());
    }
}
