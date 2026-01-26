package com.br.routine.model.tarefa;

import javax.validation.constraints.NotBlank;

public record TarefaEditarDTO(
        Long id,
        @NotBlank
        String titulo,
        String descricao
) {
}
