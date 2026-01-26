package com.br.routine.model.usuario;

import javax.validation.constraints.NotBlank;

public record UsuarioEditarDTO(
        @NotNull
        Long id,
        @NotBlank
        String login,
        @NotBlank
        String senha,
        @NotBlank
        String nome
) {
}
