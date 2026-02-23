package com.br.routine.dto.subtarefa;

import com.br.routine.model.Subtarefa;

public record SubtarefaListagemDTO(
        Long id,
        String titulo) {

    public SubtarefaListagemDTO(Subtarefa subtarefa) {
        this(subtarefa.getId(), subtarefa.getTitulo());
    }

}
