package com.br.routine.model.tarefa;

import com.br.routine.model.subtarefa.SubtarefaListagemDTO;
import com.br.routine.model.usuario.Usuario;
import com.br.routine.model.usuario.UsuarioListagemDTO;

import java.util.ArrayList;
import java.util.List;

public record TarefaListagemDTO(
        Long id,
        String titulo,
        String descricao,
        UsuarioListagemDTO usuario,
        List<SubtarefaListagemDTO> subtarefas,
        Boolean ativa
) {

    public TarefaListagemDTO(Tarefa tarefa) {
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), new UsuarioListagemDTO(tarefa.getUsuario()), tarefa.getSubtarefas().stream().map(SubtarefaListagemDTO::new).toList(), tarefa.isAtiva());
    }
}
