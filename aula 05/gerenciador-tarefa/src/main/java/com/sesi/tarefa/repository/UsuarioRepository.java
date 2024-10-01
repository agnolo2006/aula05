package com.sesi.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.tarefa.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
