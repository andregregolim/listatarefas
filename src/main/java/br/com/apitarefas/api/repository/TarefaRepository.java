package br.com.apitarefas.api.repository;

import br.com.apitarefas.api.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
}
