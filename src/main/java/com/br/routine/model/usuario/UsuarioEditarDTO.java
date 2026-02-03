package com.br.routine.model.usuario;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record UsuarioEditarDTO(
        @NotNull
        Long id,
        String login,
        String senha,
        String nome,
        Boolean ativa
) {
}
