package com.br.routine.model.usuario;

import javax.validation.constraints.NotBlank;

public record UsuarioAdicionarDTO(
        @NotBlank
        String login,
        @NotBlank
        String senha
) {
}
