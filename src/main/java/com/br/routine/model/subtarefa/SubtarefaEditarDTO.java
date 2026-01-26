package com.br.routine.model.subtarefa;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record SubtarefaEditarDTO(
        @NotNull
        Long id,
        @NotBlank
        String titulo
) {
}
