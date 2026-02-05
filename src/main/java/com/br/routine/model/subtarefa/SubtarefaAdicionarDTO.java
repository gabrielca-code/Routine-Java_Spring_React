package com.br.routine.model.subtarefa;

import com.br.routine.model.tarefa.Tarefa;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record SubtarefaAdicionarDTO(
        @NotBlank
        String titulo,
        @NotNull
        Tarefa tarefa
) {
}
