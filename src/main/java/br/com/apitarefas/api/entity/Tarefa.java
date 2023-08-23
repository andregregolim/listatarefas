package br.com.apitarefas.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity()
@Table(name = "tarefas")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

}
