package com.br.routine.dto.tarefa;

import com.br.routine.model.Usuario;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record TarefaAdicionarDTO(
        @NotBlank
        String titulo,
        String descricao,
        @NotNull
        Usuario usuario
        ) {
}
