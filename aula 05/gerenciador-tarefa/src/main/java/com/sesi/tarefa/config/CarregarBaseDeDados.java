package com.sesi.tarefa.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sesi.tarefa.model.TarefaCategoria;
import com.sesi.tarefa.repository.TarefaCategoriaRepository;

@Configuration
public class CarregarBaseDeDados {
	
	@Autowired
	TarefaCategoriaRepository tarefaCategoriaRepository;
	
	
	@Bean
	CommandLineRunner executar() {
		
		return args ->{
			TarefaCategoria categoria = new TarefaCategoria();
			categoria.setNome("Estudos");
			
			tarefaCategoriaRepository.save(categoria);
			
			TarefaCategoria categoria1 = new TarefaCategoria();
			categoria1.setNome("Pesquisa");
			
			tarefaCategoriaRepository.save(categoria1);

		};
		
	}
}
