package com.br.routine.model.subtarefa;

import com.br.routine.model.tarefa.Tarefa;
import com.br.routine.model.tarefa.TarefaListagemDTO;

public record SubtarefaListagemDTO(
        Long id,
        String titulo,
        TarefaListagemDTO tarefa
) {

    public SubtarefaListagemDTO(Subtarefa subtarefa) {
        this(subtarefa.getId(), subtarefa.getTitulo(), new TarefaListagemDTO(subtarefa.getTarefa()));
    }

}
