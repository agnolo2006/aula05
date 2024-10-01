package com.sesi.tarefa.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sesi.tarefa.model.TarefaCategoria;
import com.sesi.tarefa.model.Usuario;
import com.sesi.tarefa.repository.TarefaCategoriaRepository;
import com.sesi.tarefa.repository.UsuarioRepository;

@Configuration
public class CarregarBaseDeDados {
	
	@Autowired
	private TarefaCategoriaRepository tarefaCategoriaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Bean
	CommandLineRunner executar() {
		
		return args ->{
			Usuario usuario = new Usuario();
			usuario.setNome("Fernando");
			usuario.setSenha("madu❤");
			
			
			
			Usuario usuario1 = new Usuario();
			usuario.setNome("Giovana");
			usuario.setSenha("estudarMenina");
		};
		
		
		
		
		
	}
}
