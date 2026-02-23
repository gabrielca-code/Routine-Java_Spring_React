package com.br.routine.dto.subtarefa;

import com.br.routine.model.Tarefa;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record SubtarefaAdicionarDTO(
        @NotBlank
        String titulo,
        @NotNull
        Tarefa tarefa
) {
}
