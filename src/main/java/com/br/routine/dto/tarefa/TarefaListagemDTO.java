package com.br.routine.dto.tarefa;

import com.br.routine.dto.subtarefa.SubtarefaListagemDTO;
import com.br.routine.model.Tarefa;
import com.br.routine.dto.usuario.UsuarioListagemDTO;

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
