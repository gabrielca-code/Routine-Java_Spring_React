package com.br.routine.model.subtarefa;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record SubtarefaEditar(
        @NotNull
        Long id,
        @NotBlank
        String titulo
) {
}
