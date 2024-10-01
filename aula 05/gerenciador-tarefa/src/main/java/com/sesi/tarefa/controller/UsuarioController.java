package com.sesi.tarefa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.tarefa.model.TarefaCategoria;
import com.sesi.tarefa.model.Usuario;
import com.sesi.tarefa.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listarUsuario")
	public String listarUsuario(Model modelo){
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		return"listarUsuario";
	}
	
	@GetMapping("/formularioUsuario")
	public String mostrarFormulario( Model modelo) {
		modelo.addAttribute("usuario", new Usuario());
		return"formularioUsuario";
	}
	
	@PostMapping("/salvarUsuario")
	public String salvarUsuario(@ModelAttribute Usuario usuario) {
		usuarioRepository.save(usuario);
		return "redirect:/listarUsuario";
		
	}

}
