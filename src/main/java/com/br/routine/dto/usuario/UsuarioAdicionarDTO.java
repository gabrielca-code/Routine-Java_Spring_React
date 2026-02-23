package com.br.routine.dto.usuario;

import javax.validation.constraints.NotBlank;

public record UsuarioAdicionarDTO(
        @NotBlank
        String login,
        @NotBlank
        String senha,
        @NotBlank
        String nome
) {
}
