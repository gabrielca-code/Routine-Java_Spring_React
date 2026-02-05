package com.br.routine.model.subtarefa;

import com.br.routine.model.tarefa.Tarefa;

public record SubtarefaListagemDTO(
        Long id,
        String titulo,
        Tarefa tarefa
) {

    public SubtarefaListagemDTO(Subtarefa subtarefa) {
        this(subtarefa.getId(), subtarefa.getTitulo(), subtarefa.getTarefa());
    }

}
