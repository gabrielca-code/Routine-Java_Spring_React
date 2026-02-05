package com.br.routine.model.tarefa;

import com.br.routine.model.usuario.Usuario;

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
