package com.br.routine.dto.subtarefa;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record SubtarefaEditarDTO(
        @NotNull
        Long id,
        @NotBlank
        String titulo
) {
}
