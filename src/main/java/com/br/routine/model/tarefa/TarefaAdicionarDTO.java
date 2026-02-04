package com.br.routine.model.tarefa;

import com.br.routine.model.usuario.Usuario;
import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.NotBlank;

public record TarefaAdicionarDTO(
        @NotBlank
        String titulo,
        String descricao,
        Usuario idUsuario
        ) {
}
