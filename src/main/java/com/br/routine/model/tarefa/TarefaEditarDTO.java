package com.br.routine.model.tarefa;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record TarefaEditarDTO(
        @NotNull
        Long id,
        String titulo,
        String descricao,
        Boolean ativa
) {
}
