package com.br.routine.model.tarefa;

public record TarefaListagemDTO(
        Long id,
        String titulo,
        String descricao,
        //Adicionar usuario
        boolean ativa
) {

    public TarefaListagemDTO(Tarefa tarefa) {
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.isAtiva());
    }
}
