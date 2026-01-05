package com.br.routine.model.tarefa;

import jakarta.persistence.*;

@Entity(name = "Tarefa")
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private boolean ativa;

}
