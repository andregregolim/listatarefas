package br.com.apitarefas.api.service;

import br.com.apitarefas.api.entity.Tarefa;
import br.com.apitarefas.api.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TarefaService {
    @Autowired
    /*Usando a anotação Autowired para injetar as depedências, não é necessário criar o contrutor*/
    private TarefaRepository tarefaRepository;

    public List<Tarefa> criarTarefa(Tarefa tarefa){
        tarefaRepository.save(tarefa);
        return listarTarefa();
    }
    public List<Tarefa> listarTarefa(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return tarefaRepository.findAll(sort);
    }
    public List<Tarefa> atualizarTarefa(Tarefa tarefa){
        tarefaRepository.save(tarefa);
        return listarTarefa();
    }
    public List<Tarefa> deletarTarefa(Long id){
        tarefaRepository.deleteById(id);
        return listarTarefa();
    }



}
