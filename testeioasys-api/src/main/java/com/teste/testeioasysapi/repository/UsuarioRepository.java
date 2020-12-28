package com.teste.testeioasysapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.testeioasysapi.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
